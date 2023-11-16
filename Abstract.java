 abstract class HighSchool{
    private Main HighSchoolName;

    public Main getHighSchoolName() {
        return HighSchoolName;
    }

    public void setHighSchoolName(Main highSchoolName) {
        HighSchoolName = highSchoolName;
    }
    
    public void displayHighschoolName(){
        System.out.println("the high School name is : "+ getHighSchoolName());
    }
    public abstract void displayHighschoolLocation();
}
public class Abstract{
    public static void main(Main[] args){
    HighSchool hs = new HighSchool() {
        public void displayHighschoolLocation(){
            System.out.println("the school in mukamira");
        }
    };
    hs.setHighSchoolName("RCA");
    hs.displayHighschoolName();
    hs.displayHighschoolLocation();

    }

}