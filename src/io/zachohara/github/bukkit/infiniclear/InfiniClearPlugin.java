/* Copyright (C) 2015 Zach Ohara
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package io.zachohara.github.bukkit.infiniclear;

import org.bukkit.Bukkit;

import io.github.zachohara.bukkit.common.command.CommandExecutables;
import io.github.zachohara.bukkit.common.command.CommandRules;
import io.github.zachohara.bukkit.common.plugin.CommonPlugin;

/**
 * The {@code InfiniClearPlugin} class is the entry point for the plugin.
 *
 * @author Zach Ohara
 */
public class InfiniClearPlugin extends CommonPlugin {
	
	/**
	 * {@code true} if weather protection through this plugin is currently enabled; {@code false} otherwise.
	 */
	private static boolean enabled;
	
	/**
	 * Determines if weather protection through this plugin is currently enabled.
	 *
	 * @return {@code true} if weather protection through this plugin is currently enabled; {@code false} otherwise.
	 * @see #enabled
	 */
	public static boolean isProtectionEnabled() {
		return enabled;
	}
	
	/**
	 * Toggles the on/off state of weather protection. Weather protection will be turned on if it
	 * was previously off, or turned off if it was previously on. After the protection status has
	 * been toggled, returns the new status from {@link #isProtectionEnabled()}.  
	 *
	 * @return the new status of weather protection.
	 */
	public static boolean toggleProtectionEnabled() {
		enabled = !enabled;
		return isProtectionEnabled();
	}
	
	/**
	 * {@inheritDoc}
	 */
	@Override
	public void onEnable() {
		enabled = false;
		this.getLogger().info("Weather protection is currently off");
		Bukkit.getScheduler().scheduleSyncRepeatingTask(this, new WeatherListener(), 0L, 20L);
	}
	
	/**
	 * {@inheritDoc}
	 */
	@Override
	public Class<? extends CommandRules> getCommandRuleSet() {
		return Rules.class;
	}
	
	/**
	 * {@inheritDoc}
	 */
	@Override
	public Class<? extends CommandExecutables> getCommandExecutableSet() {
		return Executables.class;
	}
	
}
