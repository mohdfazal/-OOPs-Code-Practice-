public class Contractor extends Employee {
    private int workingHour;

    public Contractor(String name, int paymentPerHour, int workingHour) {
        super(name, paymentPerHour);
        this.workingHour = workingHour;
    }
    public int calculateSalary(){
        return getPaymentPerHour() * workingHour;
    }
}
