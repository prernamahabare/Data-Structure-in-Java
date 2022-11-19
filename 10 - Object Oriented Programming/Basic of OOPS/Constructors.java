public class Constructors {
    public static void main(String[] args) {

        // Constructor Overloading
        student s1 = new student();

        student s2 = new student("prerna");
        System.out.println(s2.name);
        s2.marks[0] = 99;
        s2.marks[1] = 87;
        s2.marks[2] = 89;

        student s3 = new student(1);
        System.out.println(s3.roll);

        // Student s4 = new Student("Yash", 18); (Will give error as we haven't
        // initialize any constructor which matches this parameter)

        // Copy constructor
        student s4 = new student(s2);
        // System.out.println(s4.name); // Yash
        System.out.println(s4.marks[0]); // 99
        System.out.println(s4.marks[1]); // 87
        System.out.println(s4.marks[2]); // 89

        s2.marks[1] = 100; // This is written after the Copy constructor as it should not change marks in
                           // obj s4, but it will change as our entire array is not copied , its refrence
                           // is copied(shallow copy)

        System.out.println(s4.marks[1]); // 100
    }
}

class student {
    int roll;
    String name;
    int marks[];

    // Copy Constructor
    
    // shalow copy
    // student(student s2) {
    //     marks = new int[3];
    //     this.name = s2.name;
    //     this.marks = s2.marks;
    // }

    // Deep copy
    student(student s2){
        marks = new int[3];
        this.name = s2.name;
        // this.marks = s2.marks;
        for (int i = 0; i < marks.length; i++) {
            marks[i]= s2.marks[i];
        }
    }

    // Non-parameterized Constructor
    student() {
        marks = new int[3];
        System.out.println("constructor is called......");
    }

    // Parameterized Constructor
    student(String newName) {
        marks = new int[3];
        name = newName;
    }

    student(int newRoll) {
        marks = new int[3];
        roll = newRoll;
    }

}