def call() {
    sh """
        docker push $REGISTRY_LOC/$PROJECT_ID/$ARTIFACT_REG/$IMAGE_NAME:$IMAGE_TAG
    """
}
