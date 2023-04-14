def call() {
    sh '''
        mkdir -p reports
        trivy image -o ./reports/trivy_scan_${BUILD_NUMBER} $IMAGE_NAME
        trivy image --severity HIGH,CRITICAL --exit-code 1  $IMAGE_NAME 
        trivy image --scanners secret --exit-code 1 $IMAGE_NAME
    '''
}
