package shared

abstract class Employee {

    var id: String = ""
        get() = field + "1"
        set(value) {
            if (value != "")
                field = value
        }

    var name: String = ""
        get() = field
        set(value) {
            field = value
        }

    abstract fun calculateSalary(): Double

    override fun toString(): String {
        return calculateSalary().toString() + id + name
    }
}


