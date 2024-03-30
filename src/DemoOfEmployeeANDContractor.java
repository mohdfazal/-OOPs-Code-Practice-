public class DemoOfEmployeeANDContractor {
    public static void main(String[] args) {
        Employee contractor = new Contractor("contractor" , 10, 10);
        System.out.println(contractor.calculateSalary());
    }
}
