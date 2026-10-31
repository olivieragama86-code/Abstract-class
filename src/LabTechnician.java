public class LabTechnician extends Employee {
    public LabTechnician(String id, String name, String dept, int hours) {
        super(id, name, dept, hours);
    }

    @Override
    public void performDuty() {
        System.out.println("Lab Technician: tests blood and other samples.\n");
    }
}