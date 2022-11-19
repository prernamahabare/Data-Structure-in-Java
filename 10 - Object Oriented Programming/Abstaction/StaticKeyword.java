public class StaticKeyword {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.Name = "prerna";
        s1.SchoolName = "SVM";

        Student s2 = new Student();
        System.out.println(s2.SchoolName);
        s2.SchoolName = "TVM";
        
        System.out.println(s1.SchoolName);

        // Below is proper way to access static fields, because static fields are not
        // based on objects
        System.out.println(Student.SchoolName); 

    }
}

class Student {
    String Name;
    int RollNo;
    static String SchoolName;

}
