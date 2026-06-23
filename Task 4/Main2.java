abstract class Employee {
    protected String name;

    public Employee (String name){
        this.name = name;
    }
    public abstract void calculateBonus();
}

class FullTimeEmployee extends Employee {
    public FullTimeEmployee (String name) {
        super(name);
    }

    @Override
    public void calculateBonus() {
        System.out.println("Calculating standard employee bonus for " + name);
    }
}

class Contractor extends Employee {
    public Contractor(String name) {
        super(name);
    }

    @Override
    public void calculateBonus(){
        System.out.println("Contractors are not eligible for bonus: " + name);
    }
}


public class Main {
    public static void main(String[] args) {
        Employee e1 = new FullTimeEmployee( "RAHIM");
        Employee e2 = new FullTimeEmployee("karin");

        e1.calculateBonus();
        e2.calculateBonus();
    }
}

