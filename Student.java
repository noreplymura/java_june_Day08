class Student {
    int rollno;
    String name;
    static String collage = "ITS";
    Student(int r, String n) {
        rollno = r;
        name = n;
    }
    void display() {
        System.out.println(rollno + " " + name + " " + collage);
    }
}
class Student1 {
    public static void main(String[] args) {
        Student s1= new Student(111, "Karan");
        Student s2= new Student(222, "Ajay");
        Student.collage = "MT";
        s1.display();
        s2.display();
    }
}
