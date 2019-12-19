#!/usr/bin/env bash

#mvn clean \
#    org.jacoco:jacoco-maven-plugin:prepare-agent \
#    test \
#    compile \
#    org.jacoco:jacoco-maven-plugin:report \
#    -pl common \
#    -am \
#    -DfailIfNoTests=false \
#    -D user.timezone=Asia/Seoul

mvn clean \
    org.jacoco:jacoco-maven-plugin:prepare-agent \
    test \
    compile \
    org.jacoco:jacoco-maven-plugin:report \
    -pl component1 \
    -am \
    -DfailIfNoTests=false \
    -D user.timezone=Asia/Seoul
