def call() {
        p = new printingMethods()

        p.printStageStartMsg("Authenitcation");
        authenticateServiceAccount();
        p.printStageSuccessMsg("Authenitcation")

        p.printStageStartMsg("Configuring Docker Package Loc");
        configureDockerPackageLoc();
        p.printStageSuccessMsg("Configuring Docker Package Loc");

        p.printStageStartMsg("CSR repo cloning");
        csrCloneRepo();
        p.printStageSuccessMsg("CSR repo cloning");

        p.printStageStartMsg("Building Docker Image");
        buildDockerImage();
        p.printStageSuccessMsg("Building Docker Image");

        p.printStageStartMsg("Pushing Image to Artifact Registry");
        pushImageToArtifactRegistry();
        p.printStageSuccessMsg("Pushing Image to Artifact Registry");

        p.printStageStartMsg("Attest Image");
        attestImage();
        p.printStageSuccessMsg("Attest Image");

        p.printStageStartMsg("Deploying Image");
        deployImageToGkeCluster();
        p.printStageSuccessMsg("Deploying Image");
}
