pluginManagement {
    repositories {
//        google()
//        mavenCentral()
//        gradlePluginPortal()
        mavenLocal()
        maven {
            url = uri("http://bcaartifactory.intra.bca.co.id:8080/artifactory/list/plugins.gradle.org/")
            isAllowInsecureProtocol  = true
        }
        maven {
            isAllowInsecureProtocol  = true
            url = uri("http://bcaartifactory.intra.bca.co.id:8080/artifactory/maven.google.com/")
        }
        maven {
            isAllowInsecureProtocol  = true
            url = uri("http://bcaartifactory.intra.bca.co.id:8080/artifactory/list/central.maven.org/")
        }
        maven {
            isAllowInsecureProtocol  = true
            url = uri("http://bcaartifactory.intra.bca.co.id:8080/artifactory/Repo1Maven")
        }
        maven {
            isAllowInsecureProtocol  = true
            url = uri("http://bcaartifactory.intra.bca.co.id:8080/artifactory/RepositoryDevOps/")
        }
        maven {
            isAllowInsecureProtocol  = true
            url = uri("http://bcaartifactory.intra.bca.co.id:8080/artifactory/maven.fabric.io-public/")
        }
        maven {
            isAllowInsecureProtocol  = true
            url = uri("http://bcaartifactory.intra.bca.co.id:8080/artifactory/jitpack.io/")
        }
        maven {
            isAllowInsecureProtocol  = true
            url = uri("http://bcaartifactory.intra.bca.co.id:8080/artifactory/jcenter.bintray.com/")
        }
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
}

rootProject.name = "My Application2"
include(":app")
 