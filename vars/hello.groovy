#!groovy
def call (){
    sh 'echo Hello World'
    
    def varHere = "Something Else"
    echo "${varHere}"

}