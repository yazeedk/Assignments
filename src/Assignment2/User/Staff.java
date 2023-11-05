package Assignment2.User;

public class Staff extends User {

    private static int staffId = 0;
    private static String staffName;
    private int staffAge;
    private double staffHourlyRate;
    private int staffTotalCompletedHour;

public Staff(int staffId, String staffName, int staffAge, double staffHourlyRate, int staffTotalCompletedHour){
    this.staffId = staffId;
    this.staffName = staffName;
    this.staffAge = staffAge;
    this.staffHourlyRate = staffHourlyRate;
    this.staffTotalCompletedHour = staffTotalCompletedHour;
}

    public String getStaffList() {
        return staffName;
    }
    public static String getStaffName() {
        return staffName;
    }
    public static int getStaffId() {
        return staffId;
    }

    public double getStaffHourlyRate() {
        return staffHourlyRate;
    }

    public int getStaffTotalCompletedHour() {
        return staffTotalCompletedHour;
    }
}