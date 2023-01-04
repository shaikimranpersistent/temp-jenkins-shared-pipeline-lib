def call() {
    sh """
        gcloud auth configure-docker $PACKAGE_LOC
    """
}