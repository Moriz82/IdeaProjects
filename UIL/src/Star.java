import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
public class Star {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(new File("student/star.dat"));
        int rs = scan.nextInt();
        for (int i=0;i<rs;i++) {
            int amnt = scan.nextInt();
            List<Student> students = new ArrayList<>();
            for (int j=0;j<amnt;j++) {
                students.add(new Student(scan.next(), scan.nextInt()));
            }
            Collections.sort(students);
                System.out.println(students.get(0));
        }
    }
}
class Student  implements  Comparable<Student>{
    String name;
    int value;
    public Student(String name, int value) {
        this.name = name;
        this.value = value;
    }
    public int compareTo(Student o) {
        if(o.value == this.value){
            return this.name.compareTo(o.name);
        }
        return o.value - this.value;
    }
    public String toString(){
        return name;
    }
}