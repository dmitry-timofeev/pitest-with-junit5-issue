#!/usr/bin/env bash

mvn test-compile \
  org.pitest:pitest-maven:mutationCoverage -Dverbose=true
