package com.groovy.studies.regularExpressions

def pattern = ~/a\b/
println pattern.class

println "--------------------"

def text = "Anderson Luis Silva está aprendendo Groovy Language"
def pattern2 = ~/Anderson Luis Silva/
def finder = text =~ pattern2 //returns the Matcher object
def matcher = text ==~ pattern2 //returns a boolean (expects the exact pattern)

println finder
println "Total of matches: ${finder.size()}"
println matcher

println "--------------------"

def text3 = "Anderson Luis Silva"
def pattern3 = ~/Anderson Luis Silva/
def matcher3 = text3 ==~ pattern3

println matcher3
println "--------------------"

def text4 = "Vasco da Gama é um time do Rio de Janeiro"
def pattern4 = ~/Vasco da Gama/
text4 = text4.replaceFirst(pattern4, "Botafogo")
println text4