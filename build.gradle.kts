plugins {
    `java-library`
}

dependencies {
    implementation("aopalliance:aopalliance:1.0")
    implementation("org.apache.axis:axis:1.4")
    implementation("commons-cli:commons-cli:1.2")
    implementation("commons-validator:commons-validator:1.4.0")
    implementation("org.apache.velocity:velocity:1.7")
    implementation("org.springframework:spring-core:3.0.0.RELEASE")
}

java {
    sourceCompatibility = JavaVersion.VERSION_11
    targetCompatibility = JavaVersion.VERSION_11
}
