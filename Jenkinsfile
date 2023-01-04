@Library('pre-dev-temp-jenkins-shared-pipeline-lib') _

pipeline {
    agent any

    environment {
        GCLOUD_CREDS=credentials('devsecops-co-demo-pk')
        // PROJECT_ID = 'devsecops-co-demo'

        // PACKAGE_LOC = 'us-central1-docker.pkg.dev'
        // REPO_NAME = 'python-app'
        // REPO_PATH = "${REPO_NAME}"
        // BRANCH_NAME = "master"
        // IMAGE_NAME = 'python-app'
        // IMAGE_TAG = 'latest'

        // CONTAINER_PATH = "${PACKAGE_LOC}/${PROJECT_ID}/${REPO_NAME}/${IMAGE_NAME}"

        // KEY_LOCATION = 'global'
        // KEYRING = 'binary-authorization-keys'
        // KEY_NAME = 'bin-auth-uzair-key-1'
        // KEY_VERSION = '1'

        // ATTESTOR_ID = 'attestor-uzair-shaikh'
        // DIGEST="""${sh(script: "gcloud container images describe $CONTAINER_PATH:$IMAGE_TAG --format='get(image_summary.digest)'", returnStdout: true).trim()}"""
    }

    stages {
        stage("run Pipeline") {
            steps {
                // authenticateServiceAccount(env.GCLOUD_CREDS)
                // configFileProvider([configFile(fileId: "env_vars.groovy", targetLocation: '/home/shaik_imran/jenkins_temp_resources/', variable: 'ENV_CONFIG')]) {
                //     load "env_vars.groovy"; 
                // }
                println "Hey this is working 1"

                script {
                    println "Hey this is working 2"
                    load '/home/shaik_imran/jenkins_temp_resources/env_vars.groovy'
                    println "Hey this is working 3"
                    runPipeline()
                    println "Hey this is working 4"
                }
                
                println "Hey this is working 5"
            }
        }

        // stage("Configuring docker with package location") {
        //     steps {
        //         configureDockerPackageLoc(env.PACKAGE_LOC)
        //     }
        // }

        // stage("Cloning CSR repo") {
        //     steps {
        //         csrCloneRepo(env.REPO_NAME, env.PROJECT_ID)
        //     }
        // }

        // stage("Build Docker Image") {
        //     steps {
        //         buildDockerImage(env.REPO_NAME, env.BRANCH_NAME, env.IMAGE_NAME)
        //     }
        // }

        // stage("Push to Artifact Registry") {
        //     steps {
        //         pushImageToArtifactRegistry(env.PROJECT_ID, env.REPO_NAME, env.PACKAGE_LOC, env.IMAGE_NAME, env.IMAGE_TAG)
        //     }
        // }

        // stage("Attest Image") {
        //     steps {
        //         attestImage(env.PROJECT_ID, env.ATTESTOR_ID, 
        //                 env.CONTAINER_PATH, env.IMAGE_NAME,
        //                 env.KEY_LOCATION, env.KEYRING, env.KEY_NAME, env.DIGEST)
        //     }
        // }
    }

    post {
      always {
            sh """
              rm -rf ${env.REPO_NAME}
            """
        }
    }
}
