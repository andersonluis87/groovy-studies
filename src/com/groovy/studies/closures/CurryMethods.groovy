package com.groovy.studies.closures


def log = { String type, Date createdOn, String message ->
    println "$createdOn [$type] - $message"
}

log("DEBUG", new Date(), "This is my first log")

// Curry
def debugLog = log.curry("DEBUG", new Date())
debugLog("Yeah! This is just another message")

// Right Curry
def anotherLog = log.rcurry("This should be the default log message")
anotherLog("DEBUG", new Date())

// Index based currying

def indexedLogExample = log.ncurry(1, new Date())
indexedLogExample("DEBUG", "The date was set to default by index ")