def call(String PACKAGE_LOC) {
    sh """
        gcloud auth configure-docker $PACKAGE_LOC
    """
}