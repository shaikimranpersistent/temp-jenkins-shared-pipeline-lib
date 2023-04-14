def call() {
    sh """
        cd $REPO_NAME
        git checkout $BRANCH_NAME 
        docker build -t $IMAGE_NAME:$IMAGE_TAG .
    """
}
