plugins {
    `java-library`
    `maven-publish`
}

group = "com.github.ktgw0316"
version = "6.1.13.0"

configure<JavaPluginConvention> {
    sourceCompatibility = JavaVersion.VERSION_1_8
    targetCompatibility = JavaVersion.VERSION_1_8
}

repositories {
    mavenLocal()
    maven("https://jitpack.io")
}

publishing {
    publications {
        create<MavenPublication>("mavenJava") {
            pom {
                licenses {
                    license {
                        name.set("GNU GENERAL PUBLIC LICENSE, Version 2")
                        url.set("https://www.gnu.org/licenses/old-licenses/gpl-2.0.html")
                    }
                }
                developers {
                    developer {
                        name.set("Gnu Classpath team")
                        email.set("gnu@gnu.org")
                    }
                }
            }
            from(components["java"])
        }
    }
}