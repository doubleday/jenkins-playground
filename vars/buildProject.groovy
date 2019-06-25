#!/usr/bin/env groovy

def call(Map config = [name: "Not set"]) {
  println("Build called with ${config.name}!")
}
