package com.groovy.studies.closures

def a = { }

println a.class.name
println a instanceof Closure

//Closures, unlike methods are objects and can be passed around in your program
def sayHello = { name ->
    println "Hello, $name"
}
sayHello("Anderson Silva")

//Closures are objects and last params
def tenTimesNum(num, multiply) {
    multiply(num * 10)
}

tenTimesNum(2, {println it})
tenTimesNum(10) { result ->
    println result
}

Integer num = 10
num.times {
    println it
}

Random randomNumber = new Random()
3.times {
    println "Random Number: ${randomNumber.nextInt()}"
}

// Closures with NO params
def hello = { ->
    println "No params..."
}
//hello("Teste")


//closures with typed arguments
def heyThere = {String name, Integer age ->
    println "Hey there, $name. You are $age years old"
}
heyThere("Anderson", 32)

//closures with default arguments
def greet = {String greeting, String name = "you" ->
    println "$greeting, $name"
}
greet("Hello", "Anderson")
greet("Good Morning")

//Closures with unlimited arguments
def concat = { String... args ->
    args.join(", ")
}
println concat('banana','apple','avocado','grape','orange')


def someMethod(Closure c) {
    println "..."
    println "Maximum Parameters: $c.maximumNumberOfParameters"
    println "Parameter Types: ${c.parameterTypes}"
}

def someClosure = { String name, int age -> }
someMethod { someClosure('teste', 32) }

//each and eachWithIndex
List names = ['Anderson', 'Rodrigo', 'Taiane', 'Mario']
names.each {
    println it
}
names.eachWithIndex{ String entry, int i -> println "$i : $entry"}

//findAll
List users = ['andersonluis', 'rpfernandes', 'taianes', 'mariop']
List results = users.findAll {
    it.startsWith("anderson")
}
println users
println results

//collect
List nums = [1,2,3,5,6,8,8,9]
List numsTimesTen = nums.collect { it * 10}
println nums
println numsTimesTen

