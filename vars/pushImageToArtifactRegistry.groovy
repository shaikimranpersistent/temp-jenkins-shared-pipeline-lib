def call() {
    sh """
        docker tag $IMAGE_NAME $PACKAGE_LOC/$PROJECT_ID/$REPO_NAME/$IMAGE_NAME:$IMAGE_TAG
        docker push $PACKAGE_LOC/$PROJECT_ID/$REPO_NAME/$IMAGE_NAME:$IMAGE_TAG
    """
}
