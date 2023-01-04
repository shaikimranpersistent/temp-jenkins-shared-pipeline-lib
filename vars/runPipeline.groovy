def call() {
        p = new printingMethods()
        p.printStageStartMsg("Authenitcation");
        authenticateServiceAccount();

        p.printStageStartMsg("Configuring Docker Package Loc");
        configureDockerPackageLoc();

        p.printStageStartMsg("CSR repo cloning");
        csrCloneRepo();

        p.printStageStartMsg("Building Docker Image");
        buildDockerImage();

        p.printStageStartMsg("Pushing Image to Artifact Registry");
        pushImageToArtifactRegistry();

        p.printStageStartMsg("Attest Image");
        attestImage();
}