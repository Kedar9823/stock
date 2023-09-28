package in.practice.restcontroller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.service.annotation.GetExchange;

import in.practice.service.IStockPriceService;

@RestController
@RequestMapping("api/price")
public class StockPriceController {

	@Autowired
	private IStockPriceService service;
	
	@GetMapping("/stockprice/{companyName}")
	public ResponseEntity<Double> getPriceByCompanyName(@PathVariable String companyName){
		
		Double price = service.findByCompanyName(companyName);
		System.out.println("Price: "+price);
		return new ResponseEntity<Double>(price,HttpStatus.OK) ;
	}
}
