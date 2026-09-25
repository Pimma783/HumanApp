package Human;

public class Person {
    private String id;
    private String name;
    private String lastName;
    private String state;

    public Person() { }
    public Person(String name) { this.name = name; }

    public void setId(String id) { this.id = id; }
    public void setName(String name) { this.name = name; }
    public void setLastname(String lastName) { this.lastName = lastName; }
    public void setState(String state) { this.state = state; }

    public String getId() { return id; }
    public String getName() { return name; }
    public String getLastname() { return lastName; }
    public String getState() { return state; }

    public void showInfo(){
        System.out.println("Person info : " + "ID : " + getId() + " , " + "Name : " + getName() + " , " + "LastName : " + getLastname() + ";");
    }

    public int giveReward(){
        return 1000;
    }
}
