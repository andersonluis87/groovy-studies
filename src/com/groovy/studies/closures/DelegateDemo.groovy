package com.groovy.studies.closures

def writer = {
    append 'Anderson'
    append 'Silva'
}

def append(String s) {
    println "append() called with argument $s"
}

StringBuffer sb = new StringBuffer() //https://docs.oracle.com/javase/8/docs/api/java/lang/StringBuffer.html

writer.resolveStrategy = Closure.DELEGATE_FIRST
writer.delegate = sb

writer()


