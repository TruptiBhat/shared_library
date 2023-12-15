def call(Map config = [:]){
    def customImage = docker.build(${config.buildImage}, "${config.filePath}")
    docker.withRegistry('https://ahmed314.azurecr.io', 'acr') {
    customImage.push("${env.BUILD_NUMBER}")
}
