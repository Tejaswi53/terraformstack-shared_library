def call(String branch,String url) {
    sh "git branch: '${branch}', url: '${url}'"
}