def call(String Project, String DockerHubUser, String ImageTag){
  with Credentials([(credentialsId: 'dockerHubCred', passwordVariable: 'dockerHubPass', usernameVariable:'dockerHubUser')]) {
  sh "docker login -u ${dockerkHubUser} -p${dockerhubpass"}
}
  sh "docker push ${dockerHubUser}/${Project}:${ImageTag}"
  }
  
