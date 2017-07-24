package com.kata.models;

import com.kata.api.ItemItemPriceStrategy;

public class ItemPriceOffer implements Rule {

	private String offerName;

	private String offerId;

	private Integer purchasedQuantity;

	private Float cost;

	public String getOfferName() {
		return offerName;
	}

	public void setOfferName(String offerName) {
		this.offerName = offerName;
	}

	public String getOfferId() {
		return offerId;
	}

	public void setOfferId(String offerId) {
		this.offerId = offerId;
	}

	public Integer getPurchasedQuantity() {
		return purchasedQuantity;
	}

	public void setPurchasedQuantity(Integer purchasedQuantity) {
		this.purchasedQuantity = purchasedQuantity;
	}

	public Float getCost() {
		return cost;
	}

	public void setCost(Float cost) {
		this.cost = cost;
	}

	public Float getTotalCost(ItemItemPriceStrategy itemItemPriceStrategy) {
		return itemItemPriceStrategy.getTotalCost(this);
	}

}
