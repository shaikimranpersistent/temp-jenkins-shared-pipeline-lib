def call(String GCLOUD_CREDS) {
    sh """
        gcloud auth activate-service-account --key-file="${GCLOUD_CREDS}"
    """
}
