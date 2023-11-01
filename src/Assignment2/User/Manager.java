package Assignment2.User;

import java.util.List;

public class Manager extends User {

    private static List<Staff> staffs;
    private final int managerId;
    private static String managerName;
    private final int managerAge;
    private double managerHourlyRate;
    private int managerTotalCompletedHour;

    public Manager(int managerId, String managerName, int managerAge, double managerHourlyRate, int managerTotalCompletedHour){
        this.managerId = managerId;
        this.managerName  = managerName;
        this.managerAge = managerAge;
        this.managerHourlyRate = managerHourlyRate;
        this.managerTotalCompletedHour = managerTotalCompletedHour;
    }

    public int getManagerList() {
        return managerId;
    }

    public static List<Staff> getStaffs() {
        return staffs;
    }

    public static String getManagerName() {
        return managerName;
    }


    public void addStaff(Staff staff) {
        staffs.add(staff);
    }



    public void setStaffs(List<Staff> staffs) {
        this.staffs = staffs;
    }

    public double getManagerHourlyRate() {
        return managerHourlyRate;
    }

    public int getManagerTotalCompletedHour() {
        return managerTotalCompletedHour;
    }
}
