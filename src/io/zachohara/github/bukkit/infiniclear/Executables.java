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
import io.github.zachohara.bukkit.common.command.CommandInstance;
import io.github.zachohara.bukkit.common.command.Implementation;

/**
 * The {@code Executables} interface represents the set of commands supported by this
 * plugin, and contains an executable object for each command that acts as the main
 * procedure for the command.
 *
 * @author Zach Ohara
 */
public enum Executables implements CommandExecutables {

	INFINICLEAR(new InfiniClear());

	/**
	 * The subclass of {@code Implementation} that contains an implementation for the
	 * command.
	 */
	private Implementation implement;

	/**
	 * Constructs a new constant with the given implementation.
	 *
	 * @param implement the implementation of the command.
	 */
	private Executables(Implementation implement) {
		this.implement = implement;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Implementation getImplementation() {
		return this.implement;
	}

	/**
	 * The implementation for the 'infiniclear' command.
	 */
	private static class InfiniClear extends Implementation {

		/**
		 * {@inheritDoc}
		 */
		@Override
		public String getName() {
			return "infiniclear";
		}

		/**
		 * {@inheritDoc}
		 */
		@Override
		public boolean doPlayerCommand(CommandInstance instance) {
			if (InfiniClearPlugin.toggleProtectionEnabled()) {
				instance.sendMessage("Weather protection is now on\nEnjoy the sun!");
				WeatherUtil.autocorrectWeather();
			} else {
				instance.sendMessage("Weather protection is now off");
			}
			return true;
		}

	}

}
