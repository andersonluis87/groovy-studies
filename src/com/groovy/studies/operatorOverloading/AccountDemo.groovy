package com.groovy.studies.operatorOverloading

import groovy.transform.ToString

@ToString
class Account {
    BigDecimal balance = 0
    String type

    BigDecimal deposit(BigDecimal amount){
        this.balance += amount
    }

    BigDecimal withdraw(BigDecimal amount){
        this.balance -= amount
    }

    BigDecimal plus(Account account) {
        this.balance + account.balance
    }
}

Account checking = new Account(type: "Checking")
checking.deposit(200.00)

println(checking)

Account savings = new Account(type: "Savings")
savings.deposit(100.00)

println(savings)

savings.withdraw(10.00)
println(savings)

BigDecimal total = checking + savings
println("Total is $total")