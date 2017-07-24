package com.kata.api;

import com.kata.models.ItemItemOffer;
import com.kata.models.ItemPriceOffer;

public interface ItemItemPriceStrategy {

	Float getTotalCost(ItemItemOffer itemItemOffer);

	default public Float getTotalCost(ItemPriceOffer itemPriceOffer) {
		return itemPriceOffer.getCost();
	}

}
