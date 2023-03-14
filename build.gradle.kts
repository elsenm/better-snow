import org.jetbrains.kotlin.gradle.dsl.JvmTarget
import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

// TODO: Change the project's group and version
group = "com.example"
version = "0.0.1+" + libs.versions.minecraft.get()

val javaVersion = JavaVersion.VERSION_17

// TODO: Double-check whether the Fabric Loom and Kotlin version are up-to-date
plugins {
    java
    kotlin("jvm") version "1.8.10"
    id("fabric-loom") version "1.1-SNAPSHOT"
}

repositories {
    // Add repositories to retrieve artifacts from in here.
    // You should only use this when depending on other mods because
    // Loom adds the essential maven repositories to download Minecraft and libraries from automatically.
    // See https://docs.gradle.org/current/userguide/declaring_repositories.html
    // for more information about repositories.
}

dependencies {
    minecraft(libs.minecraft)

    // Refer to https://melix.github.io/blog/2021/03/version-catalogs-faq.html#_why_cant_i_use_excludes_or_classifiers
    // and https://docs.gradle.org/current/userguide/variant_model.html for an explanation of why we have to use variantOf here
    mappings(variantOf(libs.yarn) { classifier("v2") })

    modImplementation(libs.fabric.loader)
    modImplementation(libs.fabric.api)
    modImplementation(libs.fabric.language.kotlin)
}

kotlin {
    jvmToolchain {
        languageVersion.set(JavaLanguageVersion.of(javaVersion.toString()))
    }
}

java {
    toolchain {
        languageVersion.set(JavaLanguageVersion.of(javaVersion.toString()))
    }
    sourceCompatibility = javaVersion
    targetCompatibility = javaVersion
    withSourcesJar()
    withJavadocJar()
}

tasks {
    withType<JavaCompile> {
        options.encoding = "UTF-8"
    }

    withType<KotlinCompile> {
        compilerOptions {
            jvmTarget.set(JvmTarget.fromTarget(javaVersion.toString()))
        }
    }

    jar {
        from("LICENSE")
    }

    processResources {
        filesMatching("fabric.mod.json") {
            expand(
                mutableMapOf(
                    "modVersion" to project.version,
                    "javaVersion" to javaVersion.toString(),
                    "minecraftVersion" to libs.versions.minecraft.get(),
                    "fabricLoaderVersion" to libs.versions.fabric.loader.get(),
                    "fabricApiVersion" to libs.versions.fabric.api.get(),
                    "fabricLanguageKotlinVersion" to libs.versions.fabric.language.kotlin.get()
                )
            )
        }

        filesMatching("*.mixins.json") {
            expand(
                mutableMapOf(
                    "javaVersion" to javaVersion.toString()
                )
            )
        }
    }
}