

plugins{
    id("hu.bme.mit.ase.shingler.gradle.application")
}

dependencies {
    implementation(project(":logic"))
    implementation(libs.slf4j.api)
    implementation(libs.picocli)
    implementation(libs.slf4j.logback.impl)
    implementation(libs.junit.jupiter.core)
    implementation(libs.junit.jupiter.engine)
}

application {
    mainClass = "hu.bme.mit.ase.shingler.similarity.SimilarityApp"
}
