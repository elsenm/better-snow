package com.marvin_elsen.better_snow

import com.marvin_elsen.better_snow.builders.Block
import com.marvin_elsen.better_snow.builders.block
import net.minecraft.block.Blocks
import net.minecraft.block.Material
import net.minecraft.item.ItemGroups
import net.minecraft.sound.BlockSoundGroup
import org.slf4j.Logger
import org.slf4j.LoggerFactory

const val MOD_ID = "better_snow"
val LOGGER: Logger = LoggerFactory.getLogger(MOD_ID)

@Suppress("unused")
fun init() {
    LOGGER.info("Initializing Better Snow")

    BetterSnowItemGroup.init()
    initBlocks()
}

fun initBlocks() {
    LOGGER.debug("Initializing blocks")

    block {
        identifier(BetterSnowIdentifier("packed_snow_block"))
        settings {
            material(Material.SNOW_BLOCK)
            strength(0.3f)
            requiresTool()
            sounds(BlockSoundGroup.SNOW)
        }
        itemGroup(ItemGroups.NATURAL)
    }

    block {
        identifier(BetterSnowIdentifier("packed_snow_slab"))
        type(Block.Type.SLAB)
        settings {
            material(Material.SNOW_BLOCK)
            strength(0.3f)
            requiresTool()
            sounds(BlockSoundGroup.SNOW)
        }
        itemGroup(ItemGroups.NATURAL)
    }

    block {
        identifier(BetterSnowIdentifier("packed_snow_stairs"))
        type(Block.Type.STAIRS)
        blockState(Blocks.SNOW_BLOCK.defaultState)
        settings {
            material(Material.SNOW_BLOCK)
            strength(0.3f)
            requiresTool()
            sounds(BlockSoundGroup.SNOW)
        }
        itemGroup(ItemGroups.NATURAL)
    }
}