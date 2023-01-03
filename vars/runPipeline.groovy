def call() {
    pipeline {
        agent any

        stages {
            stage("Authenticate Service Account") {
                steps {
                    authenticateServiceAccount()
                }
            }

            stage("Configuring docker with package location") {
                steps {
                    configureDockerPackageLoc()
                }
            }

            stage("Cloning CSR repo") {
                steps {
                    csrCloneRepo()
                }
            }

            stage("Build Docker Image") {
                steps {
                    buildDockerImage()
                }
            }

            stage("Push to Artifact Registry") {
                steps {
                    pushImageToArtifactRegistry()
                }
            }

            stage("Attest Image") {
                steps {
                    attestImage()
                }
            }
        }

        post {
            always {
                    sh """
                    rm -rf $REPO_NAME
                    """
            }
        }
    }
}