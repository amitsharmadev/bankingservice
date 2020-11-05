package com.example.demo;

public class DiscountService {

	public String getDiscount(Integer price) {
		if(price>5000 && price <10001) 
			return "20%";
		else if(price>10001)
			return "30%";
		else
			return "NA";
	}

}
