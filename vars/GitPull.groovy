def call() {
   sh 'Node --version'
    git 'https://github.com/phumutta/react-docker-jenkins.git'  
    echo "========Git Pull=========="
    sh 'ls'
    sh 'cd work'
    sh 'npm install'
    echo "=========install=========="
                
}
