package Assignment2.Reports.impl;

import Assignment2.Reports.intf.IReport;
import Assignment2.User.Director;
import Assignment2.User.Manager;
import Assignment2.User.Staff;

public class StaffReport  implements IReport {


    public static String generateStaffForDirectorReport() {
        System.out.println("Staff List for Director " + Director.getDirectorName());
        System.out.println("Staff Name: " + Director.getStaffList()+ "\n");
        return Director.getStaffList();
    }
    public static void generateStaffForManagerReport() {
        System.out.println("Staff List for Manager " + Manager.getManagerName());
            System.out.println("Staff Name: " + Staff.getStaffName()+ "\n");
    }

    public String getStaffReport() {
        return StaffReport.generateStaffForDirectorReport();
    }
}







