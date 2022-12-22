def call(String repoName, String projectId) {
    sh """
        gcloud source repos clone ${repoName} --project=${projectId}
    """
}
