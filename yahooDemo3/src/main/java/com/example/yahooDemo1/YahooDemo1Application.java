package com.example.yahooDemo1;

import java.io.IOException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import yahoofinance.Stock;
import yahoofinance.YahooFinance;

//https://www.sidmartinbio.org/is-there-an-api-for-yahoo-finance/

@SpringBootApplication
public class YahooDemo1Application {
	
	public Stock getStock(String stockName) throws IOException {
		return YahooFinance.get(stockName);
	}
	

	public static void main(String[] args) throws IOException {
		SpringApplication.run(YahooDemo1Application.class, args);
		
		YahooDemo1Application yahooStockAPI = new YahooDemo1Application();
		
		System.out.println(yahooStockAPI.getStock("GOOG"));
	
	}

}
