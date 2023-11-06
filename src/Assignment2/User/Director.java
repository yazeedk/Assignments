package Assignment2.User;

import java.util.ArrayList;
import java.util.List;

import static Assignment2.User.Staff.getStaffName;

public class Director extends User {
    private List<Director> directors;
    private List<Manager> managers;
    private List<Staff> staffs;

    private   int directorId;
    private static String directorName;
    private int directorAge;
    private double directorHourlyRate;
    private int directorTotalCompletedHour;

    public Director(int directorId, String directorName, int directorAge, double directorHourlyRate, int directorTotalCompletedHour){
        this.directorId = directorId;
        this.directorName  = directorName;
        this.directorAge = directorAge;
        this.directorHourlyRate = directorHourlyRate;
        this.directorTotalCompletedHour = directorTotalCompletedHour;
        this.staffs = new ArrayList<>();
    }
    public Director() {
    }
    public int getDirectorList() {
        return directorId;
    }
    public static String getDirectorName() {
        return directorName;
    }
    public static String getStaffList() {
        return getStaffName();
    }
    public void addManager(Manager manager) {
        managers.add(manager);
    }
    public void addStaff(Staff staff) {
        staffs.add(staff);
    }
    public void setManagers(List<Manager> managers) {
        this.managers = managers;
    }
    public int getDirectorId() {
        return directorId;
    }
    public void setDirectorId(int directorId) {
        this.directorId = directorId;
    }
    public Director getManagerList(Director managerName) {
        return managerName;
    }
    public void setDirectorName(String directorName) {
        this.directorName = directorName;
    }
    public int getDirectorAge() {
        return directorAge;
    }
    public void setDirectorAge(int directorAge) {
        this.directorAge = directorAge;
    }
    public double getDirectorHourlyRate() {
        return directorHourlyRate;
    }
    public void setDirectorHourlyRate(double directorHourlyRate) {
        this.directorHourlyRate = directorHourlyRate;
    }
    public int getDirectorTotalCompletedHour() {
        return directorTotalCompletedHour;
    }
    public void setDirectorTotalCompletedHour(int directorTotalCompletedHour) {
        this.directorTotalCompletedHour = directorTotalCompletedHour;
    }
    public void setDirectors(List<Director> directors) {
        this.directors = directors;
    }
    public List<Director> getDirectors() {
        return directors;
    }
    public List<Staff> getStaffs() {
        return staffs;
    }
    public void setStaffs(List<Staff> staffs) {
        this.staffs = staffs;
    }
}