package com.palmergames.bukkit.towny.event;

import com.palmergames.bukkit.towny.object.Town;
import com.palmergames.bukkit.towny.object.Transaction;

/**
 * Deprecated as of 0.96.3.4 use {@link com.palmergames.bukkit.towny.event.economy.TownTransactionEvent} instead

 * @author Siris
 */
@Deprecated
public class TownTransactionEvent extends BankTransactionEvent {
	private final Town town;
	
	public TownTransactionEvent(Town town, Transaction transaction) {
		super(town.getAccount(), transaction);
		this.town = town;
	}

	public Town getTown() {
		return town;
	}
}
