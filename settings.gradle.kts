pluginManagement {
    val kotlinVersion: String by settings
    val ktLintVersion: String by settings

    plugins {
        kotlin("jvm") version kotlinVersion
        id("org.jlleitschuh.gradle.ktlint") version ktLintVersion
    }
}

rootProject.name = "kotlin-project"
include("m1-init")
