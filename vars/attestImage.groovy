def call() {
    sh """
        if gcloud container binauthz attestations list --project="$PROJECT_ID" --attestor="projects/$PROJECT_ID/attestors/$ATTESTOR_ID" --artifact-url="$CONTAINER_PATH@$DIGEST" | grep -q $DIGEST ;
        then
            printf "\n\n\nImage is already attested, skipping attestation!\n\n\n"
        exit 0;

        else
            gcloud beta container binauthz attestations sign-and-create  \
            --artifact-url="$CONTAINER_PATH@$DIGEST" \
            --attestor="$ATTESTOR_ID" \
            --attestor-project="$PROJECT_ID" \
            --keyversion-project="$PROJECT_ID" \
            --keyversion-location="$KEY_LOCATION" \
            --keyversion-keyring="$KEYRING" \
            --keyversion-key="$KEY_NAME" --keyversion="$KEY_VERSION"
        fi

        unset DIGEST
    """
}
