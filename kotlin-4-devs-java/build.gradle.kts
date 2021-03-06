import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm") version "1.6.20-M1"
}

group = "br.com.erudio"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
    maven(url = "https://jcenter.bintray.com")
}

dependencies {
    // https://www.baeldung.com/kotlin/arrow
    implementation("org.funktionale:funktionale-all:1.2")
    // implementation("io.arrow-kt:arrow-core:1.0.1")
    runtimeOnly("org.jetbrains.kotlin:kotlin-reflect:1.6.10")

    testImplementation(kotlin("test"))
    testImplementation("org.junit.jupiter:junit-jupiter:5.8.2")
    testImplementation("org.amshove.kluent:kluent:1.68")
}

tasks.test {
    useJUnitPlatform()
}

tasks.withType<KotlinCompile> {
    kotlinOptions.jvmTarget = "17"
}