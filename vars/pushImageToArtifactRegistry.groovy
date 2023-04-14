def call() {
    sh """
        docker tag $IMAGE_NAME $REGISTRY_LOC/$PROJECT_ID/$ARTIFACT_REG/$IMAGE_NAME:$IMAGE_TAG
        docker push $REGISTRY_LOC/$PROJECT_ID/$ARTIFACT_REG/$IMAGE_NAME:$IMAGE_TAG
    """
}
