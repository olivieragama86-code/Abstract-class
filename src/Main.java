public class Main {
    public static void main(String[] args) {
        // Employee e = new Employee(...);  // ERROR: Employee is abstract

        Employee[] staff = {
                new Doctor("D001", "Dr. Okello", "Surgery", 40),
                new Nurse("N001", "Sarah", "Maternity", 45),
                new Pharmacist("P001", "James", "Pharmacy", 38),
                new LabTechnician("L001", "Grace", "Laboratory", 42)
        };

        for (Employee e : staff) {
            e.displayInfo();
            e.performDuty();
        }
    }
}