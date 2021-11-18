pipeline {
	agent any 
	
	environment { 
        registry = "dockertcheagj/devops" 
        registryCredential = 'dockerHub'
        dockerImage = '' 
    }


	stages{
			
			stage('Clean Package Test'){
					steps{
						bat "cd TimesheetProject"
						bat "mvn clean package"
						bat "mvn test"
					}				
				}
			stage('Test'){
					steps{
						bat "cd TimesheetProject"
						bat "mvn test"
					}				
				}
				
			stage('Sonar Analyse'){
				steps{
					bat "cd TimesheetProject"
                    bat "mvn sonar:sonar"
                  }
            }

        stage('Nexus'){
            steps {
            	bat "cd TimesheetProject"
                bat "mvn clean install package -Dmaven.test.failure.ignore=true deploy:deploy-file -DgroupId=tn.esprit.spring -DartifactId=timesheet -Dversion=0.3 -DgeneratePom=true -Dpackaging=jar -DrepositoryId=deploymentRepo -Durl=http://localhost:8081/repository/maven-releases/ -Dfile=target/timesheet-0.3.jar"
            }
        }

			stage('Building Image'){
				steps{
					script{
						dockerImage = docker.build registry + ":$BUILD_NUMBER"
					}
				}				
			}

			stage('Deploy Image'){
				steps{
					script{
						docker.withRegistry( '', registryCredential ) 
                        {dockerImage.push()}
					}
				}
			}
		}
	} 