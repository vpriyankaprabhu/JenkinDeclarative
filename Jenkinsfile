pipeline {
    agent any
    environment{
	     HTTP_PROXY="http://www-proxy-brmdc.us.oracle.com:80"
         HTTPS_PROXY="http://www-proxy-brmdc.us.oracle.com:80"
		 no_proxy=".cluster.local,.us.oracle.com,.oraclecorp.com,10.0.0.0/8,100.0.0.0/8,.oraclevcn.com,10.96.0.1"
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
              git branch: 'main', url: 'https://github.com/niwas1711/JenkinDeclarative.git'
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
        stage('docker Build') {
                    steps {
                        echo "Java home ${JAVA_HOME}"
                           echo "Maven home ${M2_HOME}"
                           echo "Maven home ${PATH}"
                        sh "mvn spring-boot:build-image"
                    }
                }
    }
    
     
    
   
}

