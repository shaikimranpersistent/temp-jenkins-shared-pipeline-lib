@Library('pre-dev-temp-jenkins-shared-pipeline-lib') _

pipeline {
    agent any
    environment {
        PROJECT_ID = 'devsecops-co-demo'

        PACKAGE_LOC = 'us-central1-docker.pkg.dev'
        REPO_NAME = 'java-app'
        IMAGE_NAME = 'java-app'
        IMAGE_TAG = 'latest'

        CONTAINER_PATH = "$PACKAGE_LOC/$PROJECT_ID/$REPO_NAME/$IMAGE_NAME"

        KEY_LOCATION = 'global'
        KEYRING = 'binary-authorization-keys'
        KEY_NAME = 'bin-auth-uzair-key-1'
        KEY_VERSION = '1'

        ATTESTOR_ID = 'attestor-uzair-shaikh'
    }

    stages {
        stage('Cloning CSR repo') {
            steps {
                csrCloneRepo($REPO_NAME, $PROJECT_ID)
            }
        }

        stage('Build Docker Image') {
            steps {
                buildDockerImage($REPO_NAME, $BRANCH_NAME, $IMAGE_NAME)
            }
        }
    }
}
