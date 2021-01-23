package OCP.example1

import shared.Employee

class HR : Employee() {

    override fun calculateSalary(): Double {
        return 10.12
    }
}