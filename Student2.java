class Student2 {
    int rollno;
    String name;
    static String collage = "ITS";
    static void change() {
        collage = "MT";
    }
    Student2(int r, String n) {
        rollno = r;
        name = n;
    }
    void display() {
        System.out.println(rollno + " " + name + " " + collage);
    }
}
     class Student3{
     public static void main(String[] args) {
         Student2 s1 = new Student2(111, "Mura");
         Student2 s2 = new Student2(222, "Murali");
         Student2 s3 = new Student2(333, "Ajay");
         s1.display();
         s2.display();
         s3.display();
     }
}
