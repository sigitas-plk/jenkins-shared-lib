#!/usr/bin/en groovy

def call() {
    // Lad script from library
    def bash_script = libraryResource  'com/sigi/nexus_upload'

    // write this script to file
    writeFile file: './upload.sh', text: bash_script

    // run the script
    def exit = sh "./upload.sh ${nexus.REPOSITORY} ${nexus.GROUP_ID}"

    echo exit
}