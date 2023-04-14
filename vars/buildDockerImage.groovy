def call() {
    sh """
        cd $REPO_NAME
        git checkout $BRANCH_NAME 
        docker build -t $CONTAINER_PATH_TAGGED .
    """
}
