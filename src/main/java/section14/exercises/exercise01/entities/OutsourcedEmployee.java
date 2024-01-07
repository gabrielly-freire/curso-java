package section14.exercises.exercise01.entities;

public class OutsourcedEmployee extends Employee{
    private Double addtionalChange;

    public OutsourcedEmployee() {

    }

    public OutsourcedEmployee(String name, Integer hours, Double valuePerHours, Double addtionalChange) {
        super(name, hours, valuePerHours);
        this.addtionalChange = addtionalChange;
    }

    @Override
    public double payment() {
        double addtional = addtionalChange * 1.1;
        return super.payment()+addtional;
    }
}
