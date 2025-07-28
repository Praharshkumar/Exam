import java.util.*;

class Student {
    String name;
    int marks;
    
    public Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }
}

public class StudentSorter {
    public static void printStudentTable(List<Student> students) {
        System.out.println("\n+---------------------+-------+");
        System.out.println("| Student Name        | Marks |");
        System.out.println("+---------------------+-------+");
        
        for (Student s : students) {
            System.out.printf("| %-19s | %5d |\n", s.name, s.marks);
        }
        
        System.out.println("+---------------------+-------+");
    }
    
    public static void main(String[] args) {
       
        List<Student> students = new ArrayList<>();
        students.add(new Student("Rahul", 88));
        students.add(new Student("Priya", 92));
        students.add(new Student("Amit", 76));
        students.add(new Student("Neha", 95));
        students.add(new Student("Vikram", 82));
        
       
        students.sort((s1, s2) -> s2.marks - s1.marks);
        
        // Print the sorted table
        System.out.println("Students sorted by marks :");
        printStudentTable(students);
    }
}
