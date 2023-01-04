def call() {
        printStageStartMsg("Authenitcation");
        authenticateServiceAccount();

        printStageStartMsg("Configuring Docker Package Loc");
        configureDockerPackageLoc();

        printStageStartMsg("CSR repo cloning");
        csrCloneRepo();

        printStageStartMsg("Building Docker Image");
        buildDockerImage();

        printStageStartMsg("Pushing Image to Artifact Registry");
        pushImageToArtifactRegistry();

        printStageStartMsg("Attest Image");
        attestImage();
}