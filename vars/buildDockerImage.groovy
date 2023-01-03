def call() {
    sh """
        cd $WORKSPACE/$REPO_PATH
        git checkout $BRANCH_NAME
        docker build -t $IMAGE_NAME:$IMAGE_TAG .
    """
}
