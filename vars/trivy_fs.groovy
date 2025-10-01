def call(){
    sh 'trivy fs . -f json -o trivy_scan.json'
}
