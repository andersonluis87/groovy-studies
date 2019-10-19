package com.groovy.studies.closures

/*
- Locate the class groovy.lang.Closure and spend a few minutes looking through documentation.
*/
//http://groovy-lang.org/api.html

/*
- Create a Method that accepts a closure as an argument
    - Create a closure that performs some action
    - Call the method and pass the closure to it.
*/

def method(Closure c) {}
def greeting = { String name ->
    println "Hey Hey Hey $name"
}
method(greeting("Anderson"))

/*
- Create a list and use them each to iterate over each item in the list and print it out
    - Hint - You can use the implicit it or use your own variable
*/
def list = ["Anderson", "Maria", "Gabriela", "Jorge", "Paulo", "Rick", "Helio"]
list.each { name-> println name }

/*
- Create a map of data and iterate over it using each method.
    - This method can take a closure that accepts 1 or 2 arguments.
    - Use 2 arguments and print out the key and value on each line.
*/
Map persons = [name: "Anderson", supportingTeam: "Vasco", age: 32]
persons.each { key, value ->
    println "$key: $value"
}

/*
- Demonstrate the use of curry and try to come up with an example different from the one we used in the lecture.
*/

def greeting2 = { String message, String name, int age ->
    println "$message, $name! You are $age years old"
}

greeting2("Hi There", "Anderson", 32)

def sayHello = greeting2.curry("Hello")
sayHello("Anderson", 32)

def sayYou = greeting2.ncurry(1, "you")
sayYou("HI There", 32)

def yourAgeIs = greeting2.rcurry(35)
yourAgeIs("What's up", "Anderson")


/*
Explore the GDK
In the following exercises we are going to explore the GDK to find some methods
that take closures and learn how to use them.
Hint - I would narrow your search to java.util.Collection, java.lang.Iterable & java.util.List

- Search for the find and findAll methods.
    - What is the difference between the two?
    - Write some code to show how they both work.
- Search for the any and every methods.
    - What is the difference between the two?
    - Write some code to show how they both work.
- Search for the method groupBy that accepts a closure
    - What does this method do?
    - Write an example of how to use this method.
*/