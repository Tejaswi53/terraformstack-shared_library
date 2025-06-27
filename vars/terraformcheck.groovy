import org.kaiser.terraform 

def call(Map pipelineParams) {

    terraform terraform = new terraform(this)

    pipeline {
      agent any

        parameters { 
            string(name: 'Customer', defaultValue: 'kasier', description: 'Enter the customer name')
        }

        stage('Git Checkout') {
            steps {
                script {
                    git branch: 'main', url: 'https://github.com/Tejaswi53/terraform_stack.git'
                }                
            }
        }

        stage('terraform fmt') {
            steps {
                script {
                    terraform.format(params.Customer)
                }
            }
        }
    }    
}



