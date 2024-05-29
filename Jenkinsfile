pipeline {
    agent any

    parameters { // определяем параметры
        choice(name: 'loadType', choices: ['max', 'stable', 'debug'], description: 'load type')
        string(name: 'intensity', defaultValue: '5', description: 'intensity')
        string(name: 'simulationClass', defaultValue: 'simulation.MainSimulation', description: 'simulation class')
    }

    options {
        timestamps() // проставляет временные метки стадиям
    }

    tools {
        // Install the Maven version configured as "M3" and add it to the path.
        maven "maven-3.9.7"
        git "Default"
    }
    stages {
        stage("Build Gatling executable") {
            steps {
                git branch: 'master', credentialsId: 'Git token', url: 'https://github.com/Dmurav/gatling_mvn_jenkins_test.git'
                sh 'mvn -B clean package'
            }
        }

        stage("Run Gatling test") {
            steps {
                sh 'mvn gatling:test -Dgatling.simulationClass=$simulationClass -Dintensity=$intensity -Dtype=$loadType'
            }
            post {
                always {
                    gatlingArchive()
                }
            }
        }
    }
}