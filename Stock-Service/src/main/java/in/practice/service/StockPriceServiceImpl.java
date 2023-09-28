package in.practice.service;

import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.practice.entity.StockPrice;
import in.practice.exception.StockNotFoundException;
import in.practice.repository.IStockRepository;

@Service
public class StockPriceServiceImpl implements IStockPriceService {

	@Autowired
	private IStockRepository repo;

	@Override
	public Double findByCompanyName(String companyName) {
		StockPrice stock = repo.findByCompanyName(companyName);

		if(Objects.isNull(stock)) {
			throw new StockNotFoundException("Stock Not Found: "+companyName);
		}
		
		return stock.getStockPrice();
	}

}
