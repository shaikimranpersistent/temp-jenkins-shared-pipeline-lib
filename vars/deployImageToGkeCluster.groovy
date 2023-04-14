def call() {
    sh """
        gcloud container clusters get-credentials $GKE_CLUSTER_NAME --zone $GKE_CLUSTER_ZONE --project $PROJECT_ID
        cd $REPO_NAME
        kubectl apply -f Service.yaml
        kubectl apply -f Deployment.yaml
    """
}
