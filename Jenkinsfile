pipeline {
    agent any
    tools {
        maven 'maven_3_9_6'
    }
    stages {
        stage('Build Maven') {
            steps{
              checkout scmGit(branches: [[name: '*/master']], extensions: [], userRemoteConfigs: [[url: 'https://github.com/NitParm123/spring-boot-docker-integration']])
              sh 'mvn clean install'
            }
        }
    }
}

