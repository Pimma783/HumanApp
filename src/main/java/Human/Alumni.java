package Human;

public class Alumni extends Person {
    private int salary;

    public int setSalary(int salary) { this.salary = salary; return salary; }
    public int getSalary() { return salary; }

    public void showInfo() {
        System.out.println("Alumni info: " + "ID : " + super.getId() + " , " + "Name : " + super.getName() + " , " + "LastName : "  + super.getLastname() + " , " + "Salary : " + getSalary() + ";");
    }

    public int computeBonus(int bonus, String type) {
        salary += bonus;
        if (type.equalsIgnoreCase("manager")) salary += 2000;
        return salary;
    }

    @Override
    public int giveReward(){
        return 1000;
    }
}
