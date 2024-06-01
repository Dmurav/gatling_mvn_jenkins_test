# Gatling load test automation example based on Jenkins

## Description:
- Simulations - MainSimulation for load tests, Debug for debug
- LoadGenParams allows you set load type - "debug", "max", "stable", "constantUsers"
- db and csv feeder on your choice, sql file to create db for feeder (postgres)
- simulation.conf for test parameters
- Jenkinsfile for execute load-test from jenkins
- Start job in Jenkins with override parameters in simulation.conf

## Metrics (base statistics)
- Graphite to Telegraf
- Telegraf use plugin socket_listener
- Telegraf send metrics to InfluxDB2
- Grafana use datasource InfluxDB2 и Flux language

## Plugins:
- Maven gatling plugin

## Build tool:
- maven

## Start test local
```chatinput
mvn gatling:test -Dgatling.simulationClass=$simulationClass -Dintensity=$intensity -Dtype=$loadType
```