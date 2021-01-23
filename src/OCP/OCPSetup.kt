package OCP

import OCP.example1.HR
import OCP.example1.Manager
import shared.Employee
import shared.IEmployee
import java.util.ArrayList

class OCPSetup {

    fun example1() {

        //OCP ex1...............
        val hr = HR()
        val manager: Employee = Manager()
        println("ex1:: $hr : $manager")

    }

    fun example2() {

        //OCP ex2.............
        val hr2: IEmployee = OCP.example2.HR("")
        val manager2 = OCP.example2.Manager("", "")
        println("ex2:: $hr2 : $manager2")


    }
}