job('nodejs-example-dsl') {
    scm {
       github('wardviaene/node-demo-app', 'master')
    }
    steps {
        shell('npm install')
    }
}