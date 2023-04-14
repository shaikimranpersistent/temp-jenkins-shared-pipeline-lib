def call() {
    sh """
        cd $REPO_NAME
        git checkout $BRANCH_NAME 
        docker build -t $REGISTRY_LOC/$PROJECT_ID/$ARTIFACT_REG/$IMAGE_NAME:$IMAGE_TAG .
    """
}
