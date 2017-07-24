
package com.kata.models;

import com.kata.api.ItemItemPriceStrategy;

public interface Rule {

	Float getTotalCost(ItemItemPriceStrategy itemItemPriceStrategy);
}
