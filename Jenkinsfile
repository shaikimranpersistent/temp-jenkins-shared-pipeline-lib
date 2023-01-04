@Library('pre-dev-temp-jenkins-shared-pipeline-lib') _

pipeline {
    agent any

    environment {
        GCLOUD_CREDS=credentials('devsecops-co-demo-pk')
        CLIENT_EMAIL=credentials('devsecops-co-demo-email')
    }

    stages {
        stage("run Pipeline") {
            steps {
                script {
                    load '/home/shaik_imran/jenkins_temp_resources/java_env_vars.groovy'
                    runPipeline()
                }
            }
        }
    }

    post {
      always {
            sh """
              rm -rf ${env.REPO_NAME}
            """
            deAuthenticateSericeAccount()
        }
    }
}
