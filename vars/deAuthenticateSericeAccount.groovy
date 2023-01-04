def call() {
    sh 'gcloud auth revoke ${env.CLIENT_EMAIL}'
}