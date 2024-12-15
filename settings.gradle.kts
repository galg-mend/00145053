rootProject.buildFileName = "build.gradle.kts"

include(":app")

pluginManagement {
repositories {
maven {
url = uri("https://pkgs.dev.azure.com/galgernitzky/_packaging/galgernitzky/maven/v1")
credentials {
username = System.getenv("AZURE_USERNAME") ?: settings.extra["datev.artifactory.username"]?.toString()
password = System.getenv("AZURE_PASSWORD") ?: settings.extra["datev.artifactory.password"]?.toString()
}
}
}
}