class Student {
    String firstName;
    String lastName;
    String dob;
    String gender;
    String studentClass;
    String address;
    static int count = 0;
    public Student(String firstName, String lastName, String dob, String gender, String studentClass, String address){
        this.firstName= firstName;
        this.lastName = lastName;
        this.dob = dob;
        this.gender = gender;
        this.studentClass = studentClass;
        this.address = address;
        count++;
    }}

    public class ObjectCount{
        public static void main(String[] args){
            Student st1 = new Student("John", "Doe", "01/01/2000", "Male", "10th", "123 Main St.");
            Student st2 = new Student("John", "Doe", "01/01/2000", "Male", "10th", "123 Main St.");
            Student st3= new Student("John", "Doe", "01/01/2000", "Male", "10th", "123 Main St.");

            System.out.println("number of students created:"+Student.count);
        }

    }