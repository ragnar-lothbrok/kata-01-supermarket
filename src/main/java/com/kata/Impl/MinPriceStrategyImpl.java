package com.kata.Impl;

import java.util.Collections;
import java.util.Comparator;

import com.kata.api.ItemItemPriceStrategy;
import com.kata.models.Item;
import com.kata.models.ItemItemOffer;

public class MinPriceStrategyImpl implements ItemItemPriceStrategy {

	public Float getTotalCost(ItemItemOffer itemItemOffer) {
		Float totalPrice = 0.0f;
		Collections.sort(itemItemOffer.getItems(), new Comparator<Item>() {

			public int compare(Item o1, Item o2) {
				return o2.getPrice().compareTo(o1.getPrice());
			}
		});

		for (int i = 0; i < itemItemOffer.getPurchasedItemCount(); i++) {
			totalPrice += itemItemOffer.getItems().get(i).getPrice();
		}

		return totalPrice;
	}

}
