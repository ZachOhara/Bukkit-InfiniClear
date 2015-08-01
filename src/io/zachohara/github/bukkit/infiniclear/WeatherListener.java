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

/**
 * A {@code WeatherListener} listens for changes in the weather of a world, and changes it
 * back to sunshine if protection is enabled.
 *
 * @author Zach Ohara
 */
public class WeatherListener implements Runnable {

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void run() {
		WeatherUtil.autocorrectWeather();
	}
	
}
