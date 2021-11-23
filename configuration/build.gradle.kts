plugins {
    id("org.springframework.boot") version "2.6.0"
}
dependencies {
    implementation(project(":common"))
    implementation(project(":app"))
    implementation(project(":web"))
    implementation(project(":persistence"))
    implementation("org.springframework.boot:spring-boot-starter")

    testImplementation("org.junit.jupiter:junit-jupiter-api:5.8.1")
    testImplementation("org.springframework.boot:spring-boot-starter-test")
}

tasks.test {
    useJUnitPlatform()
}