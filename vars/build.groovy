def call(){
     sh 'pwd'      
     sh 'mvn  clean install package'
}
