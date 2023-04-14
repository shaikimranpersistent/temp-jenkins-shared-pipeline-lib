def call() {
    sh """
        rm -rf $REPO_NAME
        gcloud source repos clone $REPO_NAME --project=$PROJECT_ID
    """
}
