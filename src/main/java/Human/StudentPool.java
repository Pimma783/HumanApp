package Human;

import java.util.ArrayList;

public class StudentPool {
    ArrayList<Student> std = new ArrayList<Student>();
    int cnt = 0;
    public void addStudent(Student s) {
        std.add(s);
        //System.out.println("Save student success!!!");
    }

    public double averageScore() {
        double avg = 0; int sum=0,cnt=0;
        for( Student s : std){
            sum+=s.getScore();
            cnt++;
        }
        if (cnt > 0) avg = (double) sum / cnt;
        return avg;
    }

    public void showAllStudents() {
        for (int i = 0; i < std.size(); i++) {
            Student s = std.get(i);
            System.out.println(s.getId() + " " + s.getName() + " " + s.getLastname() + " " + s.getScore());
        }
    }
}