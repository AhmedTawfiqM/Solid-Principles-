package OCP.example2

import shared.IEmployee

class HR(override var id: String) : IEmployee {

    override var name: String = ""

    override fun calculateSalary(): Double {
        return 1.2
    }

    override fun toString(): String {
        return calculateSalary().toString()
    }
}