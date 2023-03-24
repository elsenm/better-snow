package com.marvin_elsen.better_snow

import com.marvin_elsen.better_snow.builders.Block
import com.marvin_elsen.better_snow.builders.block
import net.fabricmc.api.EnvType
import net.fabricmc.api.Environment
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup
import net.minecraft.block.Blocks
import net.minecraft.client.render.RenderLayer
import net.minecraft.item.ItemGroup
import net.minecraft.item.ItemStack
import net.minecraft.item.Items
import net.minecraft.util.Identifier
import org.slf4j.Logger
import org.slf4j.LoggerFactory

const val MOD_ID = "better_snow"
val LOGGER: Logger = LoggerFactory.getLogger(MOD_ID)
lateinit var ice_slab: net.minecraft.block.Block
lateinit var ice_stairs: net.minecraft.block.Block
lateinit var ice_wall: net.minecraft.block.Block

class BetterSnowIdentifier(path: String) : Identifier(MOD_ID, path)

val ITEM_GROUP_BETTER_SNOW: ItemGroup =
    FabricItemGroup.builder(BetterSnowIdentifier("better_snow")).icon { ItemStack(Items.SNOW_BLOCK) }.build()

@Suppress("unused")
fun init() {
    LOGGER.info("Initializing Better Snow")

    initBlocks()
}

@Suppress("unused")
@Environment(EnvType.CLIENT)
fun initClient() {
    BlockRenderLayerMap.INSTANCE.putBlock(ice_slab, RenderLayer.getTranslucent())
    BlockRenderLayerMap.INSTANCE.putBlock(ice_stairs, RenderLayer.getTranslucent())
    BlockRenderLayerMap.INSTANCE.putBlock(ice_wall, RenderLayer.getTranslucent())
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
        identifier(BetterSnowIdentifier("snow_bricks"))
        settings {
            copyOf(Blocks.SNOW_BLOCK)
        }
        itemGroup(ITEM_GROUP_BETTER_SNOW)
    }

    block {
        identifier(BetterSnowIdentifier("snow_brick_slab"))
        type(Block.Type.SLAB)
        settings {
            copyOf(Blocks.SNOW_BLOCK)
        }
        itemGroup(ITEM_GROUP_BETTER_SNOW)
    }

    block {
        identifier(BetterSnowIdentifier("snow_brick_stairs"))
        type(Block.Type.STAIRS)
        blockState(Blocks.SNOW_BLOCK.defaultState)
        settings {
            copyOf(Blocks.SNOW_BLOCK)
        }
        itemGroup(ITEM_GROUP_BETTER_SNOW)
    }

    block {
        identifier(BetterSnowIdentifier("snow_brick_wall"))
        type(Block.Type.WALL)
        settings {
            copyOf(Blocks.SNOW_BLOCK)
        }
        itemGroup(ITEM_GROUP_BETTER_SNOW)
    }

    block {
        identifier(BetterSnowIdentifier("chiseled_snow_bricks"))
        settings {
            copyOf(Blocks.SNOW_BLOCK)
        }
        itemGroup(ITEM_GROUP_BETTER_SNOW)
    }

    ice_slab = block {
        identifier(BetterSnowIdentifier("ice_slab"))
        type(Block.Type.SLAB)
        settings {
            copyOf(Blocks.ICE)
        }
        itemGroup(ITEM_GROUP_BETTER_SNOW)
    }

    ice_stairs = block {
        identifier(BetterSnowIdentifier("ice_stairs"))
        type(Block.Type.STAIRS)
        blockState(Blocks.ICE.defaultState)
        settings {
            copyOf(Blocks.ICE)
        }
        itemGroup(ITEM_GROUP_BETTER_SNOW)
    }

    ice_wall = block {
        identifier(BetterSnowIdentifier("ice_wall"))
        type(Block.Type.WALL)
        settings {
            copyOf(Blocks.PACKED_ICE)
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

    block {
        identifier(BetterSnowIdentifier("packed_ice_bricks"))
        settings {
            copyOf(Blocks.PACKED_ICE)
        }
        itemGroup(ITEM_GROUP_BETTER_SNOW)
    }

    block {
        identifier(BetterSnowIdentifier("packed_ice_brick_slab"))
        type(Block.Type.SLAB)
        settings {
            copyOf(Blocks.PACKED_ICE)
        }
        itemGroup(ITEM_GROUP_BETTER_SNOW)
    }

    block {
        identifier(BetterSnowIdentifier("packed_ice_brick_stairs"))
        type(Block.Type.STAIRS)
        blockState(Blocks.PACKED_ICE.defaultState)
        settings {
            copyOf(Blocks.PACKED_ICE)
        }
        itemGroup(ITEM_GROUP_BETTER_SNOW)
    }

    block {
        identifier(BetterSnowIdentifier("packed_ice_brick_wall"))
        type(Block.Type.WALL)
        settings {
            copyOf(Blocks.PACKED_ICE)
        }
        itemGroup(ITEM_GROUP_BETTER_SNOW)
    }

    block {
        identifier(BetterSnowIdentifier("chiseled_packed_ice_bricks"))
        settings {
            copyOf(Blocks.PACKED_ICE)
        }
        itemGroup(ITEM_GROUP_BETTER_SNOW)
    }

    block {
        identifier(BetterSnowIdentifier("blue_ice_slab"))
        type(Block.Type.SLAB)
        settings {
            copyOf(Blocks.BLUE_ICE)
        }
        itemGroup(ITEM_GROUP_BETTER_SNOW)
    }

    block {
        identifier(BetterSnowIdentifier("blue_ice_stairs"))
        type(Block.Type.STAIRS)
        blockState(Blocks.BLUE_ICE.defaultState)
        settings {
            copyOf(Blocks.BLUE_ICE)
        }
        itemGroup(ITEM_GROUP_BETTER_SNOW)
    }

    block {
        identifier(BetterSnowIdentifier("blue_ice_wall"))
        type(Block.Type.WALL)
        settings {
            copyOf(Blocks.BLUE_ICE)
        }
        itemGroup(ITEM_GROUP_BETTER_SNOW)
    }

    block {
        identifier(BetterSnowIdentifier("blue_ice_bricks"))
        settings {
            copyOf(Blocks.BLUE_ICE)
        }
        itemGroup(ITEM_GROUP_BETTER_SNOW)
    }

    block {
        identifier(BetterSnowIdentifier("blue_ice_brick_slab"))
        type(Block.Type.SLAB)
        settings {
            copyOf(Blocks.BLUE_ICE)
        }
        itemGroup(ITEM_GROUP_BETTER_SNOW)
    }

    block {
        identifier(BetterSnowIdentifier("blue_ice_brick_stairs"))
        type(Block.Type.STAIRS)
        blockState(Blocks.BLUE_ICE.defaultState)
        settings {
            copyOf(Blocks.BLUE_ICE)
        }
        itemGroup(ITEM_GROUP_BETTER_SNOW)
    }

    block {
        identifier(BetterSnowIdentifier("blue_ice_brick_wall"))
        type(Block.Type.WALL)
        settings {
            copyOf(Blocks.BLUE_ICE)
        }
        itemGroup(ITEM_GROUP_BETTER_SNOW)
    }

    block {
        identifier(BetterSnowIdentifier("chiseled_blue_ice_bricks"))
        settings {
            copyOf(Blocks.BLUE_ICE)
        }
        itemGroup(ITEM_GROUP_BETTER_SNOW)
    }
}