#!/usr/bin/env groovy

pipeline{
	agent{
	  node{
		label 'kube-test'
		customWorkspace WORKSPACE
              }	
	  parameters{
           string(name: 'BRANCH', defaultValue: 'master', description: 'DevOps Repo branch')
          }
 }
}