grails.project.work.dir = 'target'

grails.project.dependency.resolver = 'maven'
grails.project.dependency.resolution = {

    inherits 'global'
    log 'warn'

    repositories {
        grailsCentral()
        mavenLocal()
        mavenCentral()
    }

    dependencies {
        build 'org.asciidoctor:asciidoctor-java-integration:0.1.4' // this tracks the version of asciidoctor
    }

    plugins {
        build ':release:3.0.1', ':rest-client-builder:1.0.3', {
            export = false
        }
    }
}
