public abstract class Employee {
    private String employeeId;
    private String name;
    private String department;
    private int workingHours;

    public Employee(String employeeId, String name, String department, int workingHours) {
        this.employeeId = employeeId;
        this.name = name;
        this.department = department;
        this.workingHours = workingHours;
    }

    public void displayInfo() {
        System.out.println("ID: " + employeeId + " | Name: " + name
                + " | Department: " + department + " | Hours: " + workingHours);
    }

    // Every subclass MUST implement its own duty
    public abstract void performDuty();
}