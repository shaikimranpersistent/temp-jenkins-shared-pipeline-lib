def call() {
        stage
        authenticateServiceAccount();
        configureDockerPackageLoc();
        csrCloneRepo();
        buildDockerImage();
        pushImageToArtifactRegistry();
        attestImage();
        // deAuthenticateSericeAccount();
}