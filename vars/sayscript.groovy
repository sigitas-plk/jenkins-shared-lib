#!/usr/bin/en groovy

def call(String animal = 'cat') {
    // Lad script from library
    def bash_script = libraryResource  'com/sigi/say'

    // create a file with bash_script content
      writeFile file:  './say.sh', text: bash_script

    // run the script
    sh("'./say.sh' ${animal}")
}