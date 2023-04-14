def call() {
    sh 'gcloud auth revoke ${CLIENT_EMAIL}'
}
