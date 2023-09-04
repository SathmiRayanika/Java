class Student {
    private String name;

    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

class Main {
    public static void main(String[] args) {
        // Create two student objects with names "Sam" and "John"
        Student sam = new Student("Sam");
        Student john = new Student("John");

        // Print the names of the students
        System.out.println("Student 1: " + sam.getName());
        System.out.println("Student 2: " + john.getName());
    }
}

