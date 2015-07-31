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
import org.bukkit.World;

/**
 * The {@code WeatherUtil} class contains some useful methods for dealing with weather inside the game.
 *
 * @author Zach Ohara
 */
public final class WeatherUtil {
	
	/**
	 * The {@code WeatherUtil} class should not be instantiable.
	 */
	private WeatherUtil() {
		
	}
	
	/**
	 * Sets the weather in all worlds to clear, after checking that weather protection is currently
	 * enabled.
	 */
	public static void autocorrectWeather() {
		if (!InfiniClearPlugin.isProtectionEnabled()) {
			return;
		}
		for (World w : Bukkit.getWorlds()) {
			w.setStorm(false);
		}
	}
	
}
