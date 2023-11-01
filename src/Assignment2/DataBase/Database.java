package Assignment2.DataBase;

import Assignment2.Reports.impl.BudgetReport;
import Assignment2.Reports.impl.StaffReport;
import Assignment2.User.Director;
import Assignment2.User.Manager;
import Assignment2.User.Staff;

import java.util.HashMap;
import java.util.Map;

public class Database {


    private static final Map<String, Director> directorMap = new HashMap<>();
    private static final Map<String, Manager> managerMap = new HashMap<String, Manager>();
    private static final Map<String, Staff> staffMap = new HashMap<>();

    private static final Map<String, StaffReport> reportMap = new HashMap<String, StaffReport>();
    private static final Map<String, BudgetReport> budgetMap = new HashMap<String, BudgetReport>();


    public Director getDirector(String directorId) {
        return directorMap.get(directorId);
    }

    public void addDirector(Director director) {
        directorMap.put(String.valueOf(director.getDirectorList()), director);
    }


    public void addManager(Manager manager) {
        managerMap.put(String.valueOf(manager.getManagerList()), manager);
    }

    public Manager getManager(String managerId) {
        return managerMap.get(managerId);
    }


    public Staff getStaff(String staffId) {
        return staffMap.get(staffId);
    }

    public void addStaff(Staff staff) {
        staffMap.put(String.valueOf(staff.getStaffList()), staff);
    }
    public BudgetReport getBudget(String userId) {
        return budgetMap.get(userId);
    }
    public void addBudgetReport(BudgetReport budgetReport) {
        budgetMap.put(String.valueOf(budgetReport.getCalculatedBudget()), budgetReport);
    }

    public void addStaffReport(StaffReport staffReport) {
        reportMap.put(String.valueOf(staffReport.getStaffReport()), staffReport);
    }
}
