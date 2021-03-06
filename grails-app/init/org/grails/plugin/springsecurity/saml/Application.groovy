package org.grails.plugin.springsecurity.saml

import grails.boot.GrailsApp
import grails.boot.config.GrailsAutoConfiguration

import static grails.util.Metadata.getCurrent
import static grails.util.Metadata.getCurrent
import static grails.util.Metadata.getCurrent

import static grails.util.Metadata.current as metaInfo

class Application extends GrailsAutoConfiguration {
    static void main(String[] args) {

        println "App version ${metaInfo.getApplicationVersion()}"
        println "App name ${metaInfo.getApplicationName()}"
        println "Grails version ${metaInfo.getGrailsVersion()}"
        println "Groovy version ${GroovySystem.version}"
        println "JVM version ${System.getProperty('java.version')}"


        GrailsApp.run(Application, args)
    }
}