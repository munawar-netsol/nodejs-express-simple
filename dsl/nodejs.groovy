job('Node.js Example') {
    scm {
        git('git://github.com/munawar-netsol/nodejs-express-simple.git') { node ->
            node / gitConfigName('munawersheikh.')
            node / gitConfigEmail('munawersheikh@gmail.com')
        }
    }
    triggers {
        scm('H/5 * * * * *')
    }
    wrappers {
        nodejs('Node.js Latest')
    }
    steps {
        shell("npm install")
    }
}