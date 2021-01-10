plugins {
    java
}

group = "dev.bombardy"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()

    maven("https://hub.spigotmc.org/nexus/content/repositories/snapshots/")
}

dependencies {
    compileOnly("org.spigotmc","spigot-api","1.16.2-R0.1-SNAPSHOT")

    testCompileOnly("junit", "junit", "4.12")
}
