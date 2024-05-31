# Gatling load test automation example based on Jenkins

## Description:
- Simulations - MainSimulation for load tests, Debug for debug
- LoadGenParams allows you set load type - "debug", "max", "stable", "constantUsers"
- db and csv feeder on your choice, sql file to create db for feeder (postgres)
- simulation.conf for test parameters, you can override in pipeline
- Jenkinsfile for execute load-test from jenkins
- Возможность выставлять параметры в сборке при запуске тестов

## Jenkins Plugins for Jenkinsfile pipeline:
- Gatling Jenkins Plugin
- Git plugin

## Build tool:
- maven