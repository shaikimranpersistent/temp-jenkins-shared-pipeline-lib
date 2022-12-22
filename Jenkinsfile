@Library('pre-dev-temp-jenkins-shared-pipeline-lib') _

pipeline {
    agent any

    environment {
        PROJECT_ID = 'devsecops-co-demo'

        PACKAGE_LOC = 'us-central1-docker.pkg.dev'
        REPO_NAME = 'python-app'
        REPO_PATH = "${pwd}/${REPO_NAME}"
        BRANCH_NAME = "master"
        IMAGE_NAME = 'python-app'
        IMAGE_TAG = 'latest'

        CONTAINER_PATH = "${PACKAGE_LOC}/${PROJECT_ID}/${REPO_NAME}/${IMAGE_NAME}"

        KEY_LOCATION = 'global'
        KEYRING = 'binary-authorization-keys'
        KEY_NAME = 'bin-auth-uzair-key-1'
        KEY_VERSION = '1'

        ATTESTOR_ID = 'attestor-uzair-shaikh'
    }

    stages {
        stage {
            authenticateServiceAccount(env.PROJECT_ID, env.ATTESTOR_ID, env.CONTAINER_PATH, env.IMAGE_NAME, env.KEY_LOCATION, env.KEYRING, env.KEY_NAME)
        }

        stage('Cloning CSR repo') {
            steps {
                csrCloneRepo(env.REPO_NAME, env.PROJECT_ID)
            }
        }

        stage('Build Docker Image') {
            steps {
                buildDockerImage(env.REPO_NAME, env.BRANCH_NAME, env.IMAGE_NAME)
            }
        }
    }

    post {
      always {
            sh '''
              rm -rf $REPO_NAME
            '''
        }
    }
}
