public class Doctor extends Employee {
    public Doctor(String id, String name, String dept, int hours) {
        super(id, name, dept, hours);
    }

    @Override
    public void performDuty() {
        System.out.println("Doctor: examines patients and prescribes treatment.\n");
    }
}