pipeline {
  agent any
  stages {
    stage('Build source') {
      steps {
        bat 'mvn clean'
      }
    }

    stage('Run chrome') {
      parallel {
        stage('Run chrome') {
          steps {
            bat 'mvn test -DBROWSER=chrome'
          }
        }

        stage('Run Firefox') {
          steps {
            bat 'mvn test -DBROWSER=firefox'
          }
        }

        stage('Run Edge') {
          steps {
            bat 'mvn test -DBROWSER=edge'
          }
        }

      }
    }

  }
}