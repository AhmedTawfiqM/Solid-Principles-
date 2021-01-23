import LSP.SetupLSP;
import OCP.OCPSetup;
import OCP.example1.HR;
import OCP.example1.Manager;
import shared.Employee;
import shared.IEmployee;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        //OCP......
        OCPSetup ocpSetup = new OCPSetup();
        ocpSetup.example1();   //ex1
        ocpSetup.example2();   //ex2

        //LSP
        SetupLSP setupLSP = new SetupLSP();
        setupLSP.insertPosts();
    }

}
