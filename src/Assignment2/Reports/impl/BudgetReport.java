package Assignment2.Reports.impl;

import Assignment2.Reports.intf.IReport;
import Assignment2.User.Director;
import Assignment2.User.Manager;
import Assignment2.User.Staff;

public class BudgetReport implements IReport {

    public static double calculateBudget() {
        Director director = new Director();
        return director.getDirectorHourlyRate() * director.getDirectorTotalCompletedHour();
    }
    public int getCalculatedBudget() {
        return (int) (Director.getHourlyRate() * Director.getTotalCompletedHour());
    }


    public static void printDirectorBudget(Director director) {
        double totalBudget = director.getDirectorTotalCompletedHour() * director.getDirectorHourlyRate();
        System.out.println("\nBudget for Director " + director.getName() + ": $" + totalBudget);
    }



    public static void printManagerBudget(Manager manager) {
        double totalBudget = manager.getManagerTotalCompletedHour() * manager.getManagerHourlyRate();
        System.out.println("Budget for Manager " + Manager.getManagerName() + ": $" + totalBudget);
    }

    public static void printStaffBudget(Staff staff) {
        double totalBudget = staff.getStaffTotalCompletedHour() * staff.getStaffHourlyRate();
        System.out.println("Budget for Staff " + Staff.getStaffName() + ": $" + totalBudget+"\n");
    }

}