package com.groovy.studies.collections

/**
 * Range Exercise
 */
enum DayOfWeek {
    sunday, monday, tuesday, wednesday, thursday, friday, saturday
}

// Create a range from that enum
def d = DayOfWeek.sunday..DayOfWeek.saturday

//Print the size of the Range
println "Size of Range: ${d.size()}"

//Use the contains method to see if Wednesday is in that Range
println "Range CONTAINS Wednesday? ${d.contains(DayOfWeek.wednesday)}"

//Print the from element of this range
println "Range (FROM): ${d.from}"

//Print the to element of this range
println "Range (TO): "  + d.to


/**
 * Lists Excercise
 */
//Create a list days (Sun - Sat)
def days = [ 'sunday', 'monday', 'tuesday', 'wednesday', 'thursday', 'friday', 'saturday']
//Print out the list
println "Days: $days"
//Print the size of the list
println "Days (SIZE): ${days.size()}"
//Remove Saturday from the list
days.removeAt(6) //or days.pop()

println "Days: $days"
//Add Saturday back by appending it to the list
days = days + 'saturday' //or days << 'saturday'
println "Days: $days"
//Print out the Wednesday using its index
println "Find Wed: ${days.getAt(3)}"

/**
 * Maps Exercise
 * */
//Create a map of days of the week
def daysOfTheWeek = d.indexed(1)
//Print out the map
println "Days of Week: ${daysOfTheWeek}"
//Print out the class name of the map
println daysOfTheWeek.getClass().getName()
//Print the size of the map
println "Size: ${daysOfTheWeek.size()}"
//Is there a method that would easily print out all of the days (values)?
println daysOfTheWeek.values()
//or
/*
println daysOfTheWeek.each {
    println "day: $it.value"
}
*/