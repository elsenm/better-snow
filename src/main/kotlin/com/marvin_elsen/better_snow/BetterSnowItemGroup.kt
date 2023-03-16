package com.marvin_elsen.better_snow

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup
import net.minecraft.item.ItemGroup
import net.minecraft.item.ItemStack
import net.minecraft.item.Items


object BetterSnowItemGroup {
    val BETTER_SNOW: ItemGroup =
        FabricItemGroup.builder(BetterSnowIdentifier("better_snow")).icon { ItemStack(Items.SNOW_BLOCK) }.build()

    fun init() {
        LOGGER.debug("Initializing item groups")
    }
}