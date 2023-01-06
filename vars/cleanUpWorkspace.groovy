def call() {
    sh """
        rm -rf $REPO_NAME
    """
}