package com.marvin_elsen.better_snow.builders

import net.fabricmc.fabric.api.`object`.builder.v1.block.FabricBlockSettings
import net.minecraft.block.AbstractBlock
import net.minecraft.block.Material
import net.minecraft.sound.BlockSoundGroup

class BlockSettings {
    lateinit var settings: FabricBlockSettings

    fun strength(strength: Float) {
        settings.strength(strength)
    }

    fun material(material: Material) {
        settings = FabricBlockSettings.of(material)
    }

    fun requiresTool() {
        settings.requiresTool()
    }

    fun sounds(blockSoundGroup: BlockSoundGroup) {
        settings.sounds(blockSoundGroup)
    }

    fun copyOf(block: AbstractBlock) {
        settings = FabricBlockSettings.copyOf(block)
    }
}

fun blockSettings(init: BlockSettings.() -> Unit): FabricBlockSettings {
    val blockSettings = BlockSettings()
    blockSettings.init()
    return blockSettings.settings
}