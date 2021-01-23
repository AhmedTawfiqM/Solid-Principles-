package OCP.example1

import shared.Employee

class Manager : Employee() {


    override fun calculateSalary(): Double {
        return 30.13
    }
}