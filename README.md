# jenkins-pipeline-lib

This jenkins pipeline library has been carefully designed to allow to build and perform CD pipelines leveraging 
Kloudtek's best practices.

# Usage

This library provides various build commands which require parameters to be provides. Those parameters must
be provided as a map<string,string>.

# Dependencies

In order to use this library, you must have the following tools and plugins install:

## Tools

maven (default tool name: maven)

## Plugins

* [Pipeline Maven](https://wiki.jenkins.io/display/JENKINS/Pipeline+Maven+Plugin)
* [Config File Provider](https://wiki.jenkins.io/display/JENKINS/Config+File+Provider+Plugin)

# Commands

## mavenBuildSnapshot

