package Human;
import Subject.Subject;

public class Student extends Person {
    private int score;
    Subject s = new Subject();

    public void setSubject(Subject subject){
        s = subject;
    }
    public void setScore(int score) { this.score = score; }
    public int getScore() { return score; }

    public void showInfo() {
        System.out.println("Student info: " + "ID : " + super.getId() + " , " + "Name : " + super.getName() + " , " + "LastName : " + super.getLastname() + " , " + "Score : "+ getScore() + ";");
    }

    public String computeGrade(){
        String grade = null;
        if (getScore() >= 80)
                grade = "A";
        else if (getScore() >= 70)
            grade = "B";
        else if (getScore() >= 60)
            grade = "C";
        else if (getScore() >= 50)
            grade = "D";
        else
            grade = "F";
        return grade;
    }

    @Override
    public int giveReward(){
        return 500;
    }
}