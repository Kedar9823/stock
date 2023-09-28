package in.practice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import in.practice.entity.StockPrice;

public interface IStockRepository extends JpaRepository<StockPrice, Integer> {
	public StockPrice findByCompanyName(String companyName);
}
