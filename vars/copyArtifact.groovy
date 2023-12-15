def call(){
  sh 'pwd'
  sh 'cp -r target/*.jar docker'
}
