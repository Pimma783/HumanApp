package Human;

public class Staff extends Person {
    private int age;

    public Staff(String name, int age) {
        super(name);
        this.age = age;
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("อายุการทำงาน: " + this.age + " ปี");
    }
}
