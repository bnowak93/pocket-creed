
dependencies {
    implementation(project(":common"))
    implementation(project(":app"))
    implementation("org.springframework.boot:spring-boot-starter-data-jpa")
    implementation("mysql:mysql-connector-java:8.0.27")
    implementation("org.hibernate:hibernate-core:5.6.1.Final")
    testImplementation("org.junit.jupiter:junit-jupiter-api:5.8.1")
}

tasks.test {
    useJUnitPlatform()
}