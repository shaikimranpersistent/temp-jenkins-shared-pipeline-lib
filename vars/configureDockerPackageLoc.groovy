def call() {
    sh """
        gcloud auth configure-docker $REGISTRY_LOC
    """
}