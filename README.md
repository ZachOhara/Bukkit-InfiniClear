# Bukkit-InfiniClear

Bukkit InfiniClear is a plugin for a Bukkit server that ensures the in-game weather will stay clear and sunny. It is last confirmed to work on Bukkit version 1.7.9-R2. A full list of commands that this plugin adds is included below.

This plugin uses my Bukkit Common Library. The server *must* have that plugin installed for this plugin to work. The Bukkit Common Library can be downloaded from [GitHub](http://github.com/zachohara/bukkit-common)

Along with all of the source code, in the root folder of this repository you'll find [detailed documentation](javadoc) and a compiled .jar version of the project.

I may or may not support this software in the future, but feel free to send a pull request if you think you have a way to improve it. There is no warranty on this software, and I am absolutely not going to do full-time tech support for it, but I will try to be as helpful as I can if you're having problems. Send me an email, or create a new issue.

This entire repository is made available under the GNU General Public License v3.0. A full copy of this license is available as the [LICENSE](LICENSE) file in this repository, or at [gnu.org/licenses](http://www.gnu.org/licenses/).

## Installation

Download the "InfiniClear v___.jar" from the root folder of this repository, or check out the [releases page](https://github.com/ZachOhara/Bukkit-InfiniClear/releases) and download the latest version. Drop either file into the 'plugins' folder on your server.

## Added Commands:

### InfiniClear

Usage: `/infiniclear`

This command will toggle the on / off state of the weather protection that is added in this plugin. A response will be returned indicating if weather protection was turned on or off. If the protection is turned on, the weather will stay clear. If protection is off, the weather may turn to rain periodically as in the vanilla version of the game.
