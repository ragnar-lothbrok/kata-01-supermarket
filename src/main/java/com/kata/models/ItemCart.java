package com.kata.models;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class ItemCart implements Serializable {

	private static final long serialVersionUID = 1L;

	private List<Item> itemList = new ArrayList<Item>();

	public List<Item> getItemList() {
		return itemList;
	}

	public void setItemList(List<Item> itemList) {
		this.itemList = itemList;
	}

}
