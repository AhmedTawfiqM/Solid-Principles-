package OCP.example2

import shared.IEmployee

class Manager(override var id: String, override var name: String) : IEmployee {

    override fun calculateSalary(): Double {
        return 3.4
    }

    override fun toString(): String {
        return calculateSalary().toString()
    }
}