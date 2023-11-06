package Assignment2.User;

public abstract class User {
    private int id;
    private String name;
    private int age;
    private static double hourlyRate;
    private static int totalCompletedHour;


    public String getName() {
        return name;
    }

    public static double getHourlyRate() {
        return hourlyRate;
    }

    public static int getTotalCompletedHour() {
        return totalCompletedHour;
    }

}







