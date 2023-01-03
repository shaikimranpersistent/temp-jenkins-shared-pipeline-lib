def call() {
    authenticateServiceAccount();
    csrCloneRepo();
    buildDockerImage();
}