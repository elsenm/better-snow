package com.marvin_elsen.better_snow

import com.marvin_elsen.better_snow.builders.Block
import com.marvin_elsen.better_snow.builders.block
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup
import net.minecraft.block.Blocks
import net.minecraft.item.ItemGroup
import net.minecraft.item.ItemStack
import net.minecraft.item.Items
import net.minecraft.util.Identifier
import org.slf4j.Logger
import org.slf4j.LoggerFactory

const val MOD_ID = "better_snow"
val LOGGER: Logger = LoggerFactory.getLogger(MOD_ID)

class BetterSnowIdentifier(path: String) : Identifier(MOD_ID, path)

val ITEM_GROUP_BETTER_SNOW: ItemGroup =
    FabricItemGroup.builder(BetterSnowIdentifier("better_snow")).icon { ItemStack(Items.SNOW_BLOCK) }.build()

@Suppress("unused")
fun init() {
    LOGGER.info("Initializing Better Snow")

    initBlocks()
}

fun initBlocks() {
    LOGGER.debug("Initializing blocks")

    block {
        identifier(BetterSnowIdentifier("snow_slab"))
        type(Block.Type.SLAB)
        settings {
            copyOf(Blocks.SNOW_BLOCK)
        }
        itemGroup(ITEM_GROUP_BETTER_SNOW)
    }

    block {
        identifier(BetterSnowIdentifier("snow_stairs"))
        type(Block.Type.STAIRS)
        blockState(Blocks.SNOW_BLOCK.defaultState)
        settings {
            copyOf(Blocks.SNOW_BLOCK)
        }
        itemGroup(ITEM_GROUP_BETTER_SNOW)
    }

    block {
        identifier(BetterSnowIdentifier("snow_wall"))
        type(Block.Type.WALL)
        settings {
            copyOf(Blocks.SNOW_BLOCK)
        }
        itemGroup(ITEM_GROUP_BETTER_SNOW)
    }

    block {
        identifier(BetterSnowIdentifier("packed_ice_slab"))
        type(Block.Type.SLAB)
        settings {
            copyOf(Blocks.PACKED_ICE)
        }
        itemGroup(ITEM_GROUP_BETTER_SNOW)
    }

    block {
        identifier(BetterSnowIdentifier("packed_ice_stairs"))
        type(Block.Type.STAIRS)
        blockState(Blocks.PACKED_ICE.defaultState)
        settings {
            copyOf(Blocks.PACKED_ICE)
        }
        itemGroup(ITEM_GROUP_BETTER_SNOW)
    }

    block {
        identifier(BetterSnowIdentifier("packed_ice_wall"))
        type(Block.Type.WALL)
        settings {
            copyOf(Blocks.PACKED_ICE)
        }
        itemGroup(ITEM_GROUP_BETTER_SNOW)
    }
}