package com.palmergames.bukkit.towny.event;

import com.palmergames.bukkit.towny.exceptions.NotRegisteredException;
import com.palmergames.bukkit.towny.object.Nation;
import com.palmergames.bukkit.towny.object.WorldCoord;
import org.bukkit.Location;
import org.bukkit.entity.Player;

/**
 * An event called when nation spawns occur.
 * 
 * Deprecated as of 0.96.3.4, use {@link com.palmergames.bukkit.towny.event.teleport.NationSpawnEvent} instead.
 * @author Suneet Tipirneni (Siris)
 */
@Deprecated
public class NationSpawnEvent extends SpawnEvent {
	
	private Nation toNation;
	private Nation fromNation;

	/**
	 * Called when a player is teleported to a nation.
	 * 
	 * @param player The player being teleported.
	 * @param from The location the player is teleporting from.
	 * @param to The location the player is going to.
	 */
	public NationSpawnEvent(Player player, Location from, Location to) {
		super(player, from, to);
		try {
			fromNation = WorldCoord.parseWorldCoord(from).getTownBlock().getTown().getNation();
		} catch (NotRegisteredException ignored) {}

		try {
			toNation = WorldCoord.parseWorldCoord(to).getTownBlock().getTown().getNation();
		} catch (NotRegisteredException ignored) {}
	}

	/**
	 * Gets the nation that the player to spawning to.
	 *
	 * @return The nation being spawned to.
	 */
	public Nation getToNation() {
		return toNation;
	}

	/**
	 * Gets the nation the player is spawning from.
	 * 
	 * @return null if the player is not standing in a nation owned townblock, the nation otherwise.
	 */
	public Nation getFromNation() {
		return fromNation;
	}
}
