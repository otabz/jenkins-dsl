job('nodejs-example-dsl') {
    scm {
       github('wardviaene/node-demo-app', 'master')
    }
    wrappers {
        nodejs('nodejs')
    }
    steps {
        shell('npm install')
    }
}