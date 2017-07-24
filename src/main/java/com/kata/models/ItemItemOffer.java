package com.kata.models;


import com.kata.api.ItemItemPriceStrategy;

public class ItemItemOffer implements Rule {

	private String offerName;

	private String offerId;

	private Integer purchasedItemCount;

	private Integer freeItemCount;

	public String getOfferName() {
		return offerName;
	}

	public String getOfferId() {
		return offerId;
	}

	public void setOfferId(String offerId) {
		this.offerId = offerId;
	}

	public void setOfferName(String offerName) {
		this.offerName = offerName;
	}

	public Integer getPurchasedItemCount() {
		return purchasedItemCount;
	}

	public void setPurchasedItemCount(Integer purchasedItemCount) {
		this.purchasedItemCount = purchasedItemCount;
	}

	public Integer getFreeItemCount() {
		return freeItemCount;
	}

	public void setFreeItemCount(Integer freeItemCount) {
		this.freeItemCount = freeItemCount;
	}

	public Float getTotalCost(ItemItemPriceStrategy itemItemPriceStrategy) {
		return itemItemPriceStrategy.getTotalCost(this);
	}

}
