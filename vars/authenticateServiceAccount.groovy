def call() {
    sh'''
        gcloud auth activate-service-account --key-file="$SECRET_FILE"
        gcloud auth configure-docker $REGISTRY_LOC
        print something
    '''
}
