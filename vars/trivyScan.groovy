def call() {
    sh '''
        mkdir -p reports
        trivy image -o ./reports/trivy_scan_${BUILD_NUMBER} $CONTAINER_PATH_TAGGED
        trivy image --severity HIGH,CRITICAL --exit-code 1  $CONTAINER_PATH_TAGGED
        trivy image --scanners secret --exit-code 1 $CONTAINER_PATH_TAGGED
    '''
}
