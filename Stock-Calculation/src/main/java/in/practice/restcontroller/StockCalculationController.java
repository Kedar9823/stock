package in.practice.restcontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.service.annotation.GetExchange;

import in.practice.client.StockClient;

@RestController
@RequestMapping("/api/calc")
public class StockCalculationController {
	
	@Autowired
	private StockClient client;
	
	@GetMapping("/calculate/{companyName}/{quantity}")
	public ResponseEntity<?> calculate(@PathVariable String companyName, @PathVariable Integer quantity){
		
		ResponseEntity<?> response = null;
		
		System.out.println(companyName);
		System.out.println(quantity);
		
		
		try {
			response = client.getPriceByCompanyName(companyName);
			System.err.println(response);
			
			int statusCode = response.getStatusCode().value();
			
			if(statusCode == 200) {
				Double price = (Double) response.getBody();
				
				Double stocksPrice = price * quantity;
				String successMsg = "Total cost: "+stocksPrice;
				response = new ResponseEntity<String>(successMsg,HttpStatus.OK);
				
			}
			else {
				throw new Exception();
			}
			
		}
		catch (Exception e) {
			response = new ResponseEntity<String>("Company not registered",HttpStatus.NOT_FOUND);
		}
		return response;
	}
}
