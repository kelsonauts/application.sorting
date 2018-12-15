#!Groovy

nodeLabel = 'linux'

node(nodeLabel) {
	stage('Checkout') {
		deleteDir()
		checkout scm
	}
	stage('Build') {
		result = sh(script: """
			gradle clean build
			""",
			returnStdout: true)
	}

	stage('Test') {
		result = sh(script: """
			gradle test
			""",
			returnStdout: true)
		}
	}
}