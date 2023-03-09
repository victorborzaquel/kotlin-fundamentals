plugins {
    kotlin("jvm") version "1.8.0"
    kotlin("plugin.lombok") version "1.8.10"
    id("io.freefair.lombok") version "5.3.0"
    application
}

group = "com.victor"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
    maven("https://jcenter.bintray.com")
}

dependencies {
    // KOTLIN
    testImplementation(kotlin("test"))

    runtimeOnly("org.jetbrains.kotlin:kotlin-reflect:1.8.10")

    implementation("org.funktionale:funktionale-all:1.2")

    // JAVA
    compileOnly("org.projectlombok:lombok:1.18.26")
    annotationProcessor("org.projectlombok:lombok:1.18.26")

    testCompileOnly("org.projectlombok:lombok:1.18.26")
    testAnnotationProcessor("org.projectlombok:lombok:1.18.26")
    implementation(kotlin("reflect"))
}

tasks.test {
    useJUnitPlatform()
}

kotlin {
    jvmToolchain(17)
}

application {
    mainClass.set("MainKt")
}