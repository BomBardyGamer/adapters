plugins {
    java
}

group = "dev.bombardy.adapters"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
    mavenLocal()
}

dependencies {
    implementation(project(":core"))
    compileOnly("org.spigotmc","spigot","1.8.8-R0.1-SNAPSHOT")

    testCompileOnly("junit", "junit", "4.12")
}
