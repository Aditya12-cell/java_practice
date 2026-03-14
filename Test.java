class Student {

    public int rollno;
    public String name;
    public static String college;

    public Student(int rollno, String name) {
        this.rollno = rollno;
        this.name = name;
        college = "Arya College";
    }

    public Student(Student s) {
        this.rollno = s.rollno;
        this.name = s.name;
    }

    public void printstd() {
        System.out.println("rollno: " + rollno);
        System.out.println("name: " + name);
        System.out.println("college: " + college);
    }
}
public class Test {
    public static void main(String[] args) {
        Student s1 = new Student(111, "Aditya");
        Student s2 = new Student(s1);
        s1.printstd();
        s2.printstd();
    }
}