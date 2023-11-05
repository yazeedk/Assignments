package Assignment2;

import Assignment2.DataBase.Database;
import Assignment2.Reports.impl.BudgetReport;
import Assignment2.Reports.impl.StaffReport;
import Assignment2.User.Director;
import Assignment2.User.Manager;
import Assignment2.User.Staff;

public class Main {
    public static void main(String[] args) {

        Database database = getDatabase();

        System.out.println("\nAll Off Users : \n");
        System.out.println(database.getDirector("1").getDirectorName());
        System.out.println(database.getManager("2").getManagerName());
        System.out.println(database.getStaff("3").getStaffName() + "\n");


        System.out.println("Budget Report For Each User :");
        BudgetReport.printDirectorBudget(director);
        BudgetReport.printManagerBudget(manager);
        BudgetReport.printStaffBudget(staff);

        System.out.println("\nStaff Report For Each User :");
        StaffReport.generateStaffForDirectorReport();
        StaffReport.generateStaffForManagerReport();

    }

    static Director director = new Director(1,"Ahmed",30,40, 400);
    public static Manager manager = new Manager(2,"Khalid",33,30, 300);
    static Staff staff = new Staff(3,"Ameer",44,20, 200);
    static Staff staff1 = new Staff(10,"Yazeed",40, 20, 200);
    public static BudgetReport budgetReport = new BudgetReport();
    static StaffReport staffReport = new StaffReport();

    private static Database getDatabase() {
        Database database = new Database();

        database.addDirector(director);
        database.addManager(manager);
        database.addStaff(staff);
        database.addStaff(staff1);
        database.addBudgetReport(budgetReport);
        database.addStaffReport(staffReport);

        return database;
    }
}