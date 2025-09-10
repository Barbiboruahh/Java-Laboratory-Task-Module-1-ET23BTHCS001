import java.util.ArrayList;

class Student {
    private String name;
    private int rollNumber;
    private ArrayList<Integer> marks;

    public Student(String name, int rollNumber, ArrayList<Integer> marks) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.marks = marks;
    }

    public double calculateAverage() {
        int sum = 0;
        for (int mark : marks) {
            sum += mark;
        }
        return marks.size() > 0 ? (double) sum / marks.size() : 0;
    }

    public char getGrade() {
        double average = calculateAverage();
        if (average >= 90) return 'A';
        else if (average >= 80) return 'B';
        else if (average >= 70) return 'C';
        else if (average >= 60) return 'D';
        else return 'F';
    }

    public void printResult() {
        System.out.println("Student Name: " + name);
        System.out.println("Roll Number : " + rollNumber);
        System.out.println("Average Marks: " + calculateAverage());
        System.out.println("Grade: " + getGrade());
    }
}

public class StudentResultDemo {
    public static void main(String[] args) {
        ArrayList<Integer> marks = new ArrayList<>();
        marks.add(85);
        marks.add(78);
        marks.add(92);
        marks.add(88);
        marks.add(76);

        Student student = new Student("Alice", 101, marks);
        student.printResult();
    }
}
