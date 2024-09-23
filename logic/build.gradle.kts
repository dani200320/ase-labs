

plugins{
    id("hu.bme.mit.ase.shingler.gradle.java")
}

dependencies {
    implementation(libs.slf4j.api)
    implementation(libs.picocli)
    implementation(libs.slf4j.logback.impl)
    implementation(libs.junit.jupiter.core)
    implementation(libs.junit.jupiter.engine)

    api(project(":lib"))

}
