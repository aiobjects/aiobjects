#!/usr/bin/env groovy

pipeline{
	agent{
	  node{
		label 'kube-test1'
		customWorkspace WORKSPACE
              }	
	  parameters{
           string(name: 'BRANCH', defaultValue: 'master', description: 'DevOps Repo branch')
          }
 }
}