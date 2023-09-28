package in.practice.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name="STOCK-PRICE-SERVICE")
public interface StockClient {
	
	@GetMapping("api/price/stockprice/{companyName}")
	public ResponseEntity<Double> getPriceByCompanyName(@PathVariable String companyName);	
}
