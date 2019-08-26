package com.groovy.studies.collections.examples

def map = [:]

println map
println map.getClass().getName()

def person = [username: "andersonluis87", email: "andersonluis87@gmail.com", team: "Vasco da Gama"]
person.age = 32
println person

def dateOfBirthKey = "DateOfBirth"
def user = [username: "anderson.silva", email:"asilva@test.com", (dateOfBirthKey): "1987-07-19"]
println user

println person.size()
println person.sort()

//looping
for (entry in person) {
    println person
}

for (key in person.keySet()) {
    println "key: $key, value: ${person[key]}"
}