package com.marvin_elsen.better_snow.builders

import net.fabricmc.fabric.api.item.v1.FabricItemSettings
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents
import net.fabricmc.fabric.api.`object`.builder.v1.block.FabricBlockSettings
import net.minecraft.item.BlockItem
import net.minecraft.item.ItemGroup
import net.minecraft.registry.Registries
import net.minecraft.registry.Registry
import net.minecraft.util.Identifier

class Block {
    lateinit var identifier: Identifier
    lateinit var itemGroup: ItemGroup
    lateinit var settings: FabricBlockSettings

    fun identifier(identifier: Identifier) {
        this.identifier = identifier
    }

    fun settings(init: BlockSettings.() -> Unit) {
        settings = blockSettings(init)
    }

    fun itemGroup(itemGroup: ItemGroup) {
        this.itemGroup = itemGroup
    }
}

fun block(init: Block.() -> Unit): net.minecraft.block.Block {
    val block = Block()
    block.init()

    val minecraftBlock = net.minecraft.block.Block(block.settings)
    val registeredBlock = Registry.register(Registries.BLOCK, block.identifier, minecraftBlock)
    val registeredItem =
        Registry.register(Registries.ITEM, block.identifier, BlockItem(minecraftBlock, FabricItemSettings()))

    ItemGroupEvents.modifyEntriesEvent(block.itemGroup).register { it.add(registeredItem) }

    return registeredBlock
}