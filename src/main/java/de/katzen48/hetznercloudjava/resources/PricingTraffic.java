package de.katzen48.hetznercloudjava.resources;

import com.google.gson.annotations.SerializedName;

public class PricingTraffic 
{
	@SerializedName("price_per_tb")
	private PriceTerabyte pricePerTb;

	/**
	 * Get the Price per TeraByte
	 * @return Price per TeraByte
	 */
	public PriceTerabyte getPricePerTb() 
	{
		return pricePerTb;
	}
}
