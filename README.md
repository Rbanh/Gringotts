Gringotts
=========

[![Join the chat at https://gitter.im/MinecraftWars/Gringotts](https://badges.gitter.im/Join%20Chat.svg)](https://gitter.im/MinecraftWars/Gringotts?utm_source=badge&utm_medium=badge&utm_campaign=pr-badge&utm_content=badge)
[![Build Status](https://travis-ci.org/nikosgram/Gringotts.svg?branch=master)](https://travis-ci.org/nikosgram/Gringotts)
[![Jit Pack](https://jitpack.io/v/nikosgram/Gringotts.svg)](https://jitpack.io/#nikosgram/Gringotts)

Gringotts is an item-based economy plugin for the Bukkit Minecraft server platform. Unlike earlier economy plugins, all currency value and money transactions are based on actual items in Minecraft, per default emeralds. The goals are to add a greater level of immersion, a generally more Minecraft-like feeling, and in the case of a PvP environment, making the currency itself vulnerable to raiding.


Get Gringotts 
[from BukkitDev](https://dev.bukkit.org/projects/gringotts)
or
[from Spigot](https://www.spigotmc.org/resources/gringotts.42071/)!

Features
--------
* Item-backed economy (configurable, default emeralds)
* Multiple denominations with automatic conversion (for example, use emeralds and emerald blocks)
* Storage of currency in chests and other containers, player inventory and ender chests (configurable)
* Direct account-to-account transfers commands
* Optional transaction taxes
* Fractional currency values (fixed decimal digits)
* Account support for [Factions](http://dev.bukkit.org/server-mods/factions/), [Towny](http://dev.bukkit.org/server-mods/towny-advanced/) and [WorldGuard](http://dev.bukkit.org/server-mods/worldguard/)
* [Vault](http://dev.bukkit.org/server-mods/vault/) integration

Usage
-----
Storing money in an account requires a Gringotts vault. A vault consists of a container, which can be either chest, dispenser or furnace, and a sign above or on it declaring it as a vault. A player or faction may claim any number of vaults. Vaults are not protected from access through other players. If you would like them to be, you may use additional plugins such as [LWC](http://dev.bukkit.org/server-mods/lwc/) or [WorldGuard](http://dev.bukkit.org/server-mods/worldguard/).

For full usage documentation, please see [the usage page](https://github.com/nikosgram/Gringotts/blob/master/doc/usage.md)

### Player vaults ###

Place a sign above a container block, with `[vault]` written on the first line. If it was created correctly, the sign will display your name on the third line and you will receive a message that the vault has been created.

### Faction vaults ###

Place a sign above a container block, with `[faction vault]` written on the first line. If it was created correctly, the sign will display your faction's tag on the third line and you will receive a message that the vault has been created.

### Towny vaults ###

* To make a vault for your town: place a sign above a container block, with `[town vault]` written on the first line. 
* To make a vault for your nation: place a sign above a container block, with `[nation vault]` written on the first line. 
If it was created correctly, the sign will display your town's or nation's tag on the third line and you will receive a message that the vault has been created.

Commands
--------
See [Usage](https://github.com/nikosgram/Gringotts/blob/master/doc/usage.md#commands).

Installation and Configuration
------------------------------
Download [Gringotts](http://dev.bukkit.org/server-mods/gringotts/files/) and place it in your craftbukkit/plugins folder

Please see the [Configuration and Permissions](https://github.com/nikosgram/Gringotts/blob/master/doc/configuration.md) document on how to configure Gringotts.

Problems? Questions?
--------------------
Have a look at the [Wiki](https://github.com/nikosgram/Gringotts/wiki). You're welcome to improve it, too!

Development
-----------
Would you like to make changes to Gringotts yourself? Fork it!
Pull requests are very welcome, but please make sure your changes fulfill the Gringotts quality baseline:

* new features, settings, permissions are documented
* required dependencies are all added to the build by Maven, not included in the repo
* the project builds with Maven out-of-the-box

Gringotts uses the [Maven 3](http://maven.apache.org/) build system. Build a working plugin jar with the command

    mvn compile package
    
This shades in some dependencies (such as plugin metrics). For this reason, creating a jar package manually or from an IDE may not work correctly.


Maven/Gradle repo
-----------

#### Step 1
Add the JitPack repository to your build file

##### Maven
```xml
	<repositories>
		<repository>
		    <id>jitpack.io</id>
		    <url>https://jitpack.io</url>
		</repository>
	</repositories>
```

##### Gradle
```groovy
	allprojects {
		repositories {
			maven { url 'https://jitpack.io' }
		}
	}
```

#### Step 2
Add the dependency

##### Maven
```xml
	<dependency>
	    <groupId>com.github.nikosgram</groupId>
	    <artifactId>Gringotts</artifactId>
	    <version>-SNAPSHOT</version>
	</dependency>
```

##### Gradle
```groovy
	dependencies {
	        implementation 'com.github.nikosgram:Gringotts:-SNAPSHOT'
	}
```

That's it!

Metrics
-------
![Gringotts Metrics](https://bstats.org/signatures/bukkit/Gringotts.svg)

License
-------
All code within Gringotts is licensed under the BSD 2-clause license. See `license.txt` for details.
