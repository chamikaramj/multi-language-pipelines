#!/bin/bash
cd java/
mvn clean
mvn package -DskipTests
cd target
java -jar java-prefix-bundled-0.1.jar 12345
