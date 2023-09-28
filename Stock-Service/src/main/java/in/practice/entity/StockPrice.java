package in.practice.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name="STOCK")
public class StockPrice {
	
	@Id
	@Column(name="ID")
	private Integer stockId;
	
	@Column(name="COMPANY_NAME")
	private String companyName;
	
	@Column(name="STOCK_PRICE")
	private Double stockPrice;

}
