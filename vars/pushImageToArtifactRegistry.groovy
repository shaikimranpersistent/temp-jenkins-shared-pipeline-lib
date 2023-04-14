def call() {
    sh """
        docker push $CONTAINER_PATH_TAGGED
    """
}
