

// class Hello {
//     public static void main(String[] args) {
//         // System.out.print("hello world");
//     //     int x =11;
//     //     int result = 0;
//     //     result = x%2==0 ?10 :20;
//     // System.out.println(result);

//     String day = "wed";
//     String result = "";
//        result = switch(day){
//         case "wed" , "wed" : yield "6am";
//         case "thursday", "thursday" : yield "7am";
//         default : yield "55";

        
//     };
//     System.out.println(result);
//     }
// }

// class Hello {
//     public static void main(String[] args) {
//         String day = "wed";
//         String result = "";
//         result = switch(day) {
//             case "wed" -> yield "6am";
//             case "thursday" -> yield "7am";
//             default -> yield "55";
//         };
//         System.out.println(result);
//     }
// }

// class Hello {
//     public static void main(String[] args) {
//         String day = "wed";
//         String result = switch (day) {
//             case "wed" -> "6am";
//             case "thursday" -> "7am";
//             default -> "55";
//         };
//         System.out.println(result);
//     }
// }

// class Calculator {
//     public int add(int a, int b) {
//         int r = a + b;
//         return r;
//     }
// }

// public class Hello {
//     public static void main(String[] args) {
//         int t = 5;
//         int g = 10;

//         Calculator calc = new Calculator();
//         int result = calc.add(t, g);
//         System.out.println(result);
//     }
// }


// jaged and 3d aray/
// class Student {
//     int rollno;
//     String name;
//     int marks;
// }

// public class Demo {
//     public static void main(String a[]) {
//         Student s1 = new Student();
//         s1.rollno = 101;
//         s1.name = "thierry";
//         s1.marks = 84;

//         Student s2 = new Student();
//         s2.rollno = 102;
//         s2.name = "John";
//         s2.marks = 92;

//         Student s3 = new Student();
//         s3.rollno = 103;
//         s3.name = "Alice";
//         s3.marks = 78;

//         Student students[] = new Student[3];

//         // Assign the created Student objects to the array elements
//         students[0] = s1;
//         students[1] = s2;
//         students[2] = s3;

//         for (Student stud : students) {
//             System.out.println(stud.name + ":" + stud.marks);
//         }
//     }
// }



// public class Demo{
//     public static void main(String a[]){
//         String name = new String("thierry");
//         name = name.concat("ivan");
//         System.out.println(name);
//  }
// }

// class Human {
//     private int age;
//     private String name;

//     public String getName() {
//         return name;
//     }

//     public void setName(String a) {
//         name = a;
//     }
// }

// public class Demo {
//     public static void main(String[] args) {
//         Human obj = new Human();
//         obj.setName("THierry");
//         System.out.println(obj.getName()); // Print the name from the Human object
//     }
// }


// class A{
//     public void show1(){
//         System.out.println("in a");
//     }
// }

// class b extends A{
//     public void show2(){
//         System.out.println("show in b");
//     }
// }
// public class Demo{
//     public static void main(String[] args){
//         A obj = (b)new A();
//         obj.show1();

//         b objB = new b();
//         objB.show1();

//     }
// }

// public class Demo{
//     public static void main(String[] args){
//         String str = "12";
//         int i = Integer.parseInt(str);
//         System.out.println(i*2);

//     }
// }


// innerClass dddddddddddddddddddddddddddddddddddddddddddd


// class A{
//     int age;
//     public void showName(){
//         System.out.println("in A ");
        
//     }
//     class B{
//         public void name(){
//             System.out.println("thierry");
//         }
//     }
// }

// public class Demo{
//     public static void main(String[] args){
//     A obj = new A();
//     obj.showName();

//     A.B obj1= obj.new B();
//     obj1.name();
//     }
// }

// aonymous inner class overrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrr/

// class D{
//     public void show(){
//         System.out.println("thierry in the party");
//     }
// }
// class C extends D{
//     public void get(){
//         System.out.println("in the x");
//     }
// }


// public class Demo {
//     public static void main(String[] args){
//         D obj = new D()
//         {
//             public void show(){
//                 System.out.println("thitsi d 3rd");
//             }
//         };
//         obj.show();


//     }
// }



// interface in java overrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrr

// interface A {
//     void show();
//     void show1();
//     void show2();
//     void show3();
// }

// class B implements A{
//     public void show(){
//         System.out.println("in show");
//     }

//       public void show1(){
//         System.out.println("in show");
//     }

//       public void show2(){
//         System.out.println("in show");
//     }

//       public void show3(){
//         System.out.println("in show");
//     }
// }

// class Demo{
//     public static void main(String[] args){
//         A obbj = new B();
//         obbj.show();
//         obbj.show1();
//         obbj.show2();
//         obbj.show3();



//     }
// }




// enumeration in java/


// enum Status{
//     running , Failed, Pending, Success;
// }

// public class Demo{
//     public static void main(String[] args){
        // Status[] ss = Status.values();
        // for(Status s: ss){
        //     System.out.println(s + ":" + s.ordinal());
        // }

//         Status s= Status.running;

//         switch(s){
//             case running:
//             System.out.println("well");
//             break;

//               case Failed:
//             System.out.println("well fa");
//             break;

//               case Pending:
//             System.out.println("well pend");
//             break;
//               case Success:
//             System.out.println("well pend ss");
//             break;

//         }


//     }
// }


// enum LapTop {
//     MacBook(2000), XPS(2200), Surface(400), ThinkPad(4555);

//     private int price;

//     private LapTop(int price) {
//         this.price = price;
//     }

//     public int getPrice() {
//         return price;
//     }
// }

// public class Demo {
//     public static void main(String[] args) {
//         for (LapTop lap : LapTop.values()) {
//             System.out.println(lap + ": $" + lap.getPrice());
//         }
//     }
// }


// interface A{

//     void show();
// }

// class B implements A{
//     public void show(){
//         System.out.println("thierry is the king");
//     }
// }
// public class Demo {
//     public static void main(String[] args){

//         A obj = () ->System.out.println("thierry is the king");
//             obj.show();


//     }
// }


// user inputs

// import java.util.Scanner;

// public class Demo{
//     public static void main(String[] args){
//        System.out.println("Enter the number:");
//        Scanner sc = new Scanner(System.in);
//        int num = sc.nextInt();
//        System.out.println("the num is " + num);
//        sc.close();

//     }
// }


// threads in java

// class A extends Thread{
//     public void  test(){
//         for(int i =1 ;i<=100;i++){
//                  System.out.println("hii");
//                  try{
//                     Thread.sleep(5);
//  }catch( InterruptedException e){
//     e.printStackTrace();

//  }
//         } }
// }

// class B extends Thread{
//     public void  test2(){
//         for(int j = 1; j<=100 ; j++){
//             System.out.println("hthierry");
//         }
        
//   }
// }

// public class Demo{
//     public static void main(String[] args){
//         A obj1 = new A();
//         obj1.test();

//         B objB =new B();
//         objB.test2();

//         obj1.start();
//             try{
//                     Thread.sleep(5);
//  }catch( InterruptedException e){
//     e.printStackTrace();

//  }
//         objB.start();

//     }
// }


// class A implements Runnable {
//     @Override
//     public void run() {
//         for (int i = 1; i <= 100; i++) {
//             System.out.println("hii");
//             try {
//                 Thread.sleep(5);
//             } catch (InterruptedException e) {
//                 e.printStackTrace();
//             }
//         }
//     }
// }

// class B implements Runnable {
//     @Override
//     public void run() {
//         for (int j = 1; j <= 100; j++) {
//             System.out.println("hthierry");
//         }
//     }
// }

// public class Demo {
//     public static void main(String[] args) {
//         A objA = new A();
//         B objB = new B();

//         Thread threadA = new Thread(objA);
//         Thread threadB = new Thread(objB);

//         threadA.start();
//         threadB.start();
//     }
// }


// runnable vs threads in java


// class A implements Runnable {
//     public void run() {
//         for (int i = 1; i <= 5; i++) {
//             System.out.println("hii");
//             try {
//                 Thread.sleep(5);
//             } catch (InterruptedException e) {
//                 e.printStackTrace();
//             }
//         }
//     }
// }

// class B implements Runnable {
//     public void run() {
//         for (int i = 1; i <= 5; i++) {
//             System.out.println("hii34");
//             try {
//                 Thread.sleep(5);
//             } catch (InterruptedException e) {
//                 e.printStackTrace();
//             }
//         }
//     }
// }

// public class Demo {
//     public static void main(String[] args) {

//         Runnable obj = new A();
//         Runnable obj1 = new B();

//         Thread t1 = new Thread(obj);
//         Thread t2 = new Thread(obj1);

//         t1.start();
//         t2.start();
//     }
// }

// import java.util.ArrayList;
// import java.util.Collection;
// import java.util.HashSet;
// import java.util.List;
// import java.util.Set;
// import java.util.Set;


// import javax.print.attribute.SetOfIntegerSyntax;

// public class Demo{
//     public static void main(String[] args){
//         Set<Integer> nums= new HashSet<Integer>(5);
//         nums.add(5);
//         nums.add(3);
//          nums.add(35);
//         nums.add(33);

//         // System.out.println(nums.get(3));
        
//         for(int i : nums){
//             System.out.println(i);
//         }
//         // System.out.println(nums);
//     }
// // }

import java.util.HashMap;
import java.util.Map;

// public class Demo {
//     public static void main(String[] args) {
//         Map<String, Integer> students = new HashMap<>();
//         students.put("thierry", 50);
//         students.put("thierry1", 5);
//         students.put("thierry2", 505);

//         System.out.println("Keys: " + students.keySet()); // Print all keys

//         for (String key : students.keySet()) {
//             System.out.println(key + ":" + students.get(key));
//         }
//     }
// }


// import java.util.Scanner;

// public class Demo {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         System.out.print("Enter a number: ");
//         int number = scanner.nextInt();
//         scanner.close();
//         System.out.println("You entered: " + number);
//     }
// }

// class Person{
//   private String name;
//   private int age;

//   public String getName(){return name;}
//   public void setName(String name){this.name = name;}
//   public int getAge(){return age;}
//   public void setAge(int age){ this.age = age;}
// }

// public class Demo{
//   public static void main(String[] args){
//     Person person = new Person();
//     person.setName("thierry");
//     person.setAge(50);

//     System.out.println("Name: "+ person.getName());
//     System.out.println("age: "+ person.getAge());
//   }
// // }

// import java.util.Scanner;

// class Person {
//     private String name;
//     private int age;

//     public String getName() {
//         return name;
//     }

//     public void setName(String name) {
//         this.name = name;
//     }

//     public int getAge() {
//         return age;
//     }

//     public void setAge(int age) {
//         this.age = age;
//     }
// }

// public class Demo {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
// Person person = new Person();
// System.out.print("Enter Name: ");
//         String inputName = scanner.nextLine(); 
//         person.setName(inputName);

//         System.out.print("Enter Age: ");
//         int inputAge = scanner.nextInt(); 
//         person.setAge(inputAge);

//         System.out.println("Name: " + person.getName());
//         System.out.println("Age: " + person.getAge());
        
//         scanner.close(); 
//     }
// }

import java.util.ArrayList;

class Student {
    private Main name;
    private int age;
    private Main grade;
    private int id;

    public Student(Main name, int age, Main grade, int id) {
        this.name = name;
        this.age = age;
        this.grade = grade;
        this.id = id;
    }

    public Main getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Main getGrade() {
        return grade;
    }

    public int getId() {
        return id;
    }
}

class Teacher {
    private Main name;
    private int age;
    private Main subject;

    public Teacher(Main name, int age, Main subject) {
        this.name = name;
        this.age = age;
        this.subject = subject;
    }

    public Main getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Main getSubject() {
        return subject;
    }
}

class School {
    private ArrayList<Student> students = new ArrayList<>();
    private ArrayList<Teacher> teachers = new ArrayList<>();

    public void addStudent(Student student) {
        students.add(student);
    }

    public void addTeacher(Teacher teacher) {
        teachers.add(teacher);
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public ArrayList<Teacher> getTeachers() {
        return teachers;
    }
}

public class Demo {
  public static void main(Main[] args) {
      School school = new School();

      Student student1 = new Student("John", 15, "10th", 1);
      Student student2 = new Student("Jane", 16, "11th", 2);

      Teacher teacher1 = new Teacher("Mr. Smith", 35, "Math");
      Teacher teacher2 = new Teacher("Ms. Johnson", 28, "English");

      school.addStudent(student1);
      school.addStudent(student2);

      school.addTeacher(teacher1);
      school.addTeacher(teacher2);

      System.out.println("Students:");
      for (Student student : school.getStudents()) {
          System.out.println(student.getName());
      }

      System.out.println("\nTeachers:");
      for (Teacher teacher : school.getTeachers()) {
          System.out.println(teacher.getName());
      }
  }
}




