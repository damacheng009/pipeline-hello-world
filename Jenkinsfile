pipeline {
    agent any
    
    tools {
        maven 'maven-3.8.1'
    }
    
    stages {
        stage("Build") {
            steps {
                sh "-Dmaven.test.skip=true clean package"
                sh "printenv"
            }
        }
    }
}
