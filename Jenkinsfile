@Library("pre-dev-temp-jenkins-shared-pipeline-lib") _

pipeline {
    agent any
    stages {
        stage("Cloning CSR repo") {
            steps {
                csrCloneRepo("java-app", "devsecops-co-demo")
            }
        }
    }
}