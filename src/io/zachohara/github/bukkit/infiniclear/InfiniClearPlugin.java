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

import io.github.zachohara.bukkit.common.command.CommandExecutables;
import io.github.zachohara.bukkit.common.command.CommandRules;
import io.github.zachohara.bukkit.common.plugin.CommonPlugin;

/**
 * The {@code InfiniClearPlugin} class is the entry point for the plugin.
 *
 * @author Zach Ohara
 */
public class InfiniClearPlugin extends CommonPlugin {
	
	private static boolean enabled;
	
	public static boolean isProtectionEnabled() {
		return enabled;
	}
	
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
