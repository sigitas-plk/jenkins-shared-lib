#!/usr/bin/en groovy

def call() {
    // Lad script from library
    def bash_script = libraryResource  'com/sigi/nexus_upload'
    // run the script
    sh "bash -c '$bash_script' shellName ${nexus.REPOSITORY} ${nexus.GROUP_ID}"
}