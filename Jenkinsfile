pipeline {
    agent any

    triggers {
        cron('30 0 * * *')
    }

    tools {
        maven 'Maven3'
        jdk 'JDK21'
    }

    stages {

        stage('Checkout') {
            steps {
                git branch: 'main',
                    url: 'https://github.com/mohapatrasumit70/SeleniumSimpleGitHubActions.git'
            }
        }

        stage('Build & Execute Tests') {
            steps {
                bat 'mvn clean test -DsuiteXmlFile=testng.xml'
            }
        }
    }

    post {
        always {
            archiveArtifacts artifacts: 'reports/*.html', fingerprint: true

            emailext(
                subject: "Selenium Automation Report - Build #${BUILD_NUMBER}",
                body: """
Hi Team,

Selenium execution completed.

Project: ${JOB_NAME}
Build Number: ${BUILD_NUMBER}
Build Status: ${currentBuild.currentResult}

Regards,
Jenkins
""",
                to: "sumitkumarmohapatra21@gmail.com"           
            )
        }
    }
}
