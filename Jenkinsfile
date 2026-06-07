pipeline {
    agent any

    triggers {
        cron('30 0 * * *')
    }

    stages {

        stage('Checkout') {
            steps {
                git branch: 'main',
                    url: 'https://github.com/mohapatrasumit70/SeleniumSimpleGitHubActions'
            }
        }

        stage('Build & Execute Tests') {
            steps {
                bat 'mvn clean test -DsuiteXmlFile=testng.xml'
            }
        }

        stage('Show Reports') {
            steps {
                bat 'dir reports'
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

Selenium automation execution has completed.

Job Name : ${JOB_NAME}
Build Number : ${BUILD_NUMBER}
Build Status : ${currentBuild.currentResult}

Regards,
Sumit Kumar Mohapatra
""",
                to: "sumitkumarmohapatra21@gmail.com",
                attachmentsPattern: 'reports/*.html'
            )
        }
    }
}
