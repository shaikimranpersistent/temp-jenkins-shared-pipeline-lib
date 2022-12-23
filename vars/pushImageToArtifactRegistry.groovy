def call(String PROJECT_ID, String REPO_NAME, String PACKAGE_LOC, String IMAGE_NAME, String IMAGE_TAG) {
    sh """
        docker tag $IMAGE_NAME $PACKAGE_LOC/$PROJECT_ID/$REPO_NAME/$IMAGE_NAME:$IMAGE_TAG
        docker push $PACKAGE_LOC/$PROJECT_ID/$REPO_NAME/$IMAGE_NAME:$IMAGE_TAG
    """
}
