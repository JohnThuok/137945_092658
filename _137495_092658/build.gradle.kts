@file:Suppress("UNUSED_EXPRESSION")

val implementation: Unit = Unit



plugins {
    kotlin("jvm") version "1.9.0"
    kotlin("kotlin-android")
    kotlin("kotlin-android-extensions")
    application
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation(kotlin("stdlib", "1.5.21"))
    implementation("androidx.core:core-ktx:1.6.0")
    implementation("androidx.appcompat:appcompat:1.3.1")
    implementation("androidx.constraintlayout:constraintlayout:2.1.1")
    implementation("androidx.recyclerview:recyclerview:1.2.1")
}

application {
    "MainKt"
}
implementation "androidx.room:room-runtime:2.3.0"
val kapt: Nothing = TODO()

kapt "androidx.room:room-compiler:2.3.0"


android()

fun android() {

}

fun compileSdkVersion() {

}

fun defaultConfig() {

}

fun minSdkVersion() {

}

fun targetSdkVersion() {

}

fun buildTypes() {

}

fun proguardFiles() {

}

fun getDefaultProguardFile() {

}
