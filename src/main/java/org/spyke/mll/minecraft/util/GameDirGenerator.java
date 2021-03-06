/*
 * Copyright 2020-2022 Riane "spykedev" spyke
 *
 * This file is part of MinecraftLaunchLibrary.

 * The MinecraftLaunchLibrary is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * The MinecraftLaunchLibrary is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with the MinecraftLaunchLibrary.  If not, see <http://www.gnu.org/licenses/>.
 */
package org.spyke.mll.minecraft.util;

import java.io.File;

/**
 * The Minecraft Game Dir Generator
 *
 * <p>
 *     This class contains a method to generate the minecraft directory of
 *     the current OS like the default of Minecraft.
 * </p>
 *
 * @author spykedev
 * @version 3.0.2-BETA
 * @since 2.0.0-BETA
 */
public class GameDirGenerator
{
    /**
     * Generate the game directory of the current OS by the given
     * server name, like the default of Minecraft.
     *
     * @param serverName The server name that will be the directory
     *                   name.
     *
     * @return The generated game directory
     */
    public static File createGameDir(String serverName)
    {
        String os = System.getProperty("os.name").toLowerCase();
        if (os.contains("win"))
            return new File(System.getProperty("user.home") + "\\AppData\\Roaming\\." + serverName);
        else if (os.contains("mac"))
            return new File(System.getProperty("user.home") + "/Library/Application Support/" + serverName);
        else
            return new File(System.getProperty("user.home") + "/." + serverName);
    }

}
