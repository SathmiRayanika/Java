class Student {
    private String name;
    private int age;
    private char grade;

    // Task 2:
    public Student() {
        name = "John Doe";
        age = 0;
        grade = 'N';
    }

    // Task 2:
    public Student(String name, int age, char grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    // Task 3:
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Grade: " + grade);
    }
}

public class Main1 {
    public static void main(String[] args) {
        // Task 5:
        Student student1 = new Student();
        System.out.println("Student 1 Information:");
        student1.displayInfo();
        System.out.println();

        // Task 6:
        Student student2 = new Student("Alice", 20, 'A');
        System.out.println("Student 2 Information:");
        student2.displayInfo();
        System.out.println();

        // Task 7:
        Student student3 = new Student("Bob", 22);
        System.out.println("Student 3 Information:");
        student3.displayInfo();
    }
}
