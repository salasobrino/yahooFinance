package com.example.yahooDemo1;

import java.math.BigDecimal;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@AllArgsConstructor  //?
@NoArgsConstructor   //?

public class StockData {
	
	private String name;
	private BigDecimal price;
	private BigDecimal change;
	private String currency;
	private BigDecimal bid;

}
