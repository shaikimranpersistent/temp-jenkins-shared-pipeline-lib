def call(String repoName, String projectId) {
    sh """
        printf "\n\n\nCLONING REPO ${repoName}\n\n\n"
        gcloud source repos clone ${repoName} --project=${projectId}
        printf "\n\n\nCLONED REPO ${repoName}\n\n\n"
    """
}
