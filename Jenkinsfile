#!Groovy

nodeLabel = 'linux'

node(nodeLabel) {
	stage('Checkout') {
		deleteDir()
		checkout scm
	}

	gradlePath = "/opt/gradle/gradle-3.4.1/bin"
	stage('Build') {
		result = sh(script: """
			${gradlePath}/gradle clean build
			""",
			returnStdout: true)
	}

	stage('Test') {
		result = sh(script: """
			${gradlePath}/gradle test
			""",
			returnStdout: true)
	}
}