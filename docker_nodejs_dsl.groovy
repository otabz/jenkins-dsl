job('docker-nodejs-example-dsl') {
    scm {
       github('wardviaene/docker-demo', 'master')
    }
    steps {
        dockerBuildAndPublish {
            repositoryName('otabz/nodejs-example')
            tag('${BUILD_TIMESTAMP}-${GIT_REVISION,length=7}')
            registryCredentials('docker-hub')
            skipDecorate()
            skipTagAsLatest(true)
        }
    }
}