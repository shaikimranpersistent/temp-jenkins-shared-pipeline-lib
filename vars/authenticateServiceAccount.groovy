def call() {
    sh 'gcloud auth activate-service-account --key-file="$GCLOUD_CREDS"'
}
