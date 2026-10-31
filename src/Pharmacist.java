public class Pharmacist extends Employee {
    public Pharmacist(String id, String name, String dept, int hours) {
        super(id, name, dept, hours);
    }

    @Override
    public void performDuty() {
        System.out.println("Pharmacist: prepares and dispenses medicines.\n");
    }
}