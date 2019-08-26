package com.groovy.studies.collections

//Range
Range r = 1..10
println "$r"
println r.contains(10)
println r.getFrom()
println r.getTo()
println([1, 2, 3, 4, 5].first())

//Range with Dates
Date today = new Date()
Date oneWeekAway = today + 7
println "Today is $today"
println "One week from today is $oneWeekAway"
println "All days from today to one week away: ${today..oneWeekAway}"

//Range with Letters
Range letters = 'a'..'f'
println "$letters"