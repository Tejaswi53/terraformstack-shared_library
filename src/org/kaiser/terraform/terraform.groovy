package org.kaiser.terraform
class terraform {
    def stack
    terraform(stack) {
        this.stack = stack
    }

    def format(string Customer) {
        stack.sh "
          cd ${stack.env.WORKSPACE}/stacks/${Customer}
          sudo terraform fmt -check
        "
    }
    

}