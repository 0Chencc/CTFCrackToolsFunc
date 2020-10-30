import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm") version "1.4.10"
}
group = "org.CTFCrackTools"
version = "1.0-SNAPSHOT"

repositories {
    maven(url = "http://maven.aliyun.com/nexus/content/groups/public/")
    maven (url = "https://jitpack.io")
    mavenLocal()
    mavenCentral()
    maven(url = "https://maven.aliyun.com/repository/jcenter")
    maven(url = "https://maven.aliyun.com/repository/central")
}
dependencies {
    "implementation" ("org.jetbrains.kotlin:kotlin-stdlib-jdk8:1.3.61")
    "implementation" ("org.python", "jython", "2.7.1b3")
    "implementation" ("com.google.code.gson", "gson", "2.8.2")
    "implementation" ("commons-codec", "commons-codec","1.10")
    "implementation" ("org.apache.commons","commons-lang3","3.9")
    "implementation" (files("Plugins/beautyeye_lnf.jar"))
    "implementation" ("com.github.atarw:material-ui-swing:v0.9.6")
    "implementation" ("com.weblookandfeel", "weblaf-ui","1.2.9")
    "testImplementation" ("junit", "junit", "4.12")
}
tasks.withType<KotlinCompile>() {
    kotlinOptions.jvmTarget = "1.8"
}