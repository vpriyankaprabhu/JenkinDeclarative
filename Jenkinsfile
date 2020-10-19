pipeline {
    agent any
    environment{
         JAVA_HOME="/usr/lib/jvm/jdk-11.0.5/"
         M2_HOME="/opt/apache-maven-3.6.3"
         M2="/opt/apache-maven-3.6.3/bin"
         PATH="$JAVA_HOME:$M2:$PATH"
    }
    
    stages {
        stage('Welcome') {
            steps {
                echo 'Welcome to first declarative stage'
            }
        }
        stage('Git checkout') {
            steps {
                echo 'Welcome Git Checkout stage'
               git 'https://github.com/niwas1711/JenkinDeclarative.git'
            }
        }
        stage('Maven Build') {
            steps {
                echo "Java home ${JAVA_HOME}"
                   echo "Maven home ${M2_HOME}"
                   echo "Maven home ${PATH}"
                sh "mvn clean package"  
            }
        }
    }
    
     
    
   
}

