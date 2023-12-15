def call(){
    def customImage = docker.build('ahmedwahi314/petclinic', "./docker")
    docker.withRegistry('https://ahmed314.azurecr.io', 'acr') {
    customImage.push("${env.BUILD_NUMBER}")
}
