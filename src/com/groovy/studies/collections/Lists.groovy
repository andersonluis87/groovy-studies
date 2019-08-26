package com.groovy.studies.collections

final listBase = [1,2,3,4,5,6,7,8,9]

//Lists
List nums = listBase
println(nums)
println nums.class

//add | remove | get | clear
//add--------
nums.push(10)
println nums

nums.add(11)
println nums

def newList = nums + [12,13,14]
println "nums: $nums"
println "New List: $newList"

nums << 15
println "nums: $nums"

//remove-----
nums.pop()
println "nums: $nums"

nums = nums - 15
println "nums: $nums"

println "Last number of the list ${nums.last()}"
nums = nums - nums.last()
println "nums: $nums"

nums.removeAt(0)
println "nums: $nums"

//get------
println "get:"
println nums.getAt(2..5)

//clear------
nums.clear()
println "nums: $nums"

//flatten
nums = listBase
nums << [10,11,12]
nums << [15,16, [45,46]]
println "nums: $nums"
nums = nums.flatten()
println "nums flatten: $nums"

println nums.unique()

//Set
def numbers = [1,2,3,4,5,6,6,6,6,8,7,8,8,8] as Set
println "numbers: $numbers"

def sortedNumbers = [1,8,9,4,5,3,2,1,7,8,4,1,2,4,1,1] as SortedSet
println "sortedNumbers: $sortedNumbers"