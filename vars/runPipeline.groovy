def call() {
        authenticateServiceAccount();
        configureDockerPackageLoc();
        csrCloneRepo();
        buildDockerImage();
        pushImageToArtifactRegistry();
        attestImage();
        // deAuthenticateSericeAccount();
}