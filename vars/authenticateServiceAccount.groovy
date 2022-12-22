def call(String GCLOUD_CREDS, String PACKAGE_LOC) {
    sh """
        gcloud auth activate-service-account --key-file="$GCLOUD_CREDS"
        gcloud auth configure-docker $PACKAGE_LOC
    """
}
