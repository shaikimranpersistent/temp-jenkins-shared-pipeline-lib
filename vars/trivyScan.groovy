def call() {
    sh '''
        mkdir -p reports
        trivy image -o ./reports/trivy_scan_${BUILD_NUMBER} $CONTAINER_PATH
        trivy image --severity HIGH,CRITICAL --exit-code 1  $CONTAINER_PATH 
        trivy image --scanners secret --exit-code 1 $CONTAINER_PATH
    '''
}
