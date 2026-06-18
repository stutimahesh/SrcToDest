pipeline{
	agent any
	tools{
		maven 'Maven'
	}
	stages{
	 stage('CheckOut'){
	 	steps{
	 		git branch:'master',
	 		url: 'https://github.com/stutimahesh/SrcToDest.git'
	 	}
	 }
	 stage('Build'){
	 	steps{
	 		sh 'mvn clean package'
	 	}
	 }
	 stage('Test'){
	 	steps{
	 		sh 'mvn test'
	 	}
	 }stage('Run'){
	 	steps{
	 		sh 'mvn exec:java -Dexec.mainClass="com.example.App'
	 	}
	 }
	}
	post{
		success{
			echo 'Build and Deploy success"
		}failure{
			echo 'Build fail'
		}
	}
}
