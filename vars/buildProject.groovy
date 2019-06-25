#!/usr/bin/env groovy

def call(Map config = [name: "Not set"]) {
  println("Build called with ${config.name}!")

  pipeline {
    agent any

    environment {
      SOME_ENV = 'some environment'
    }

    stages {
      stage('Build') {
        steps {
            sh 'printenv'
        }
      }
    }
  }
}
