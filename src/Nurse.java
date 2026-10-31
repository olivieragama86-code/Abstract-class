public class Nurse extends Employee {
    public Nurse(String id, String name, String dept, int hours) {
        super(id, name, dept, hours);
    }

    @Override
    public void performDuty() {
        System.out.println("Nurse: monitors patients and gives daily care.\n");
    }
}