job('Node.js Example') {
    scm {
        git('https://github.com/munawar-netsol/nodejs-express-simple.git')
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