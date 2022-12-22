def call(String REPO_PATH, String BRANCH_NAME = "main", String IMAGE_NAME) {
    sh """
        cd $REPO_PATH
        git checkout $BRANCH_NAME
        docker build -t $IMAGE_NAME .
    """
}
