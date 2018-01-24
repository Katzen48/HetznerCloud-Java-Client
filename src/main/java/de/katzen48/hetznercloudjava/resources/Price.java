package de.katzen48.hetznercloudjava.resources;

import com.google.gson.annotations.SerializedName;

public class Price 
{
	private String location;
	@SerializedName("price_hourly")
	private PriceHourly priceHourly;
	@SerializedName("price_monthly")
	private PriceMonthly priceMonthly;
	
	public String getLocation() 
	{
		return location;
	}
	
	public PriceHourly getPriceHourly() 
	{
		return priceHourly;
	}
	
	public PriceMonthly getPriceMonthly() 
	{
		return priceMonthly;
	}
}