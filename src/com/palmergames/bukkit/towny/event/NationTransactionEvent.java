package com.palmergames.bukkit.towny.event;

import com.palmergames.bukkit.towny.object.Nation;
import com.palmergames.bukkit.towny.object.Transaction;

/**
 * Deprecated as of 0.96.3.4 use {@link com.palmergames.bukkit.towny.event.economy.NationTransactionEvent} instead

 * @author Siris
 */
@Deprecated
public class NationTransactionEvent extends BankTransactionEvent {
	
	final Nation nation;
	
	public NationTransactionEvent(Nation nation, Transaction transaction) {
		super(nation.getAccount(), transaction);
		this.nation = nation;
	}

	public Nation getNation() {
		return nation;
	}
}
