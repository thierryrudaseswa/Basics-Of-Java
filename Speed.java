class Car{
    int maxSpeed = 180;
}
class Toyota extends Car{
    int maxSpeed = 120;
    void showSpeed(){
        System.out.println("the max speed of acar is:"+super.maxSpeed);
        System.out.println("the toyota speed is: "+maxSpeed);
    }
}

public class Speed{
    public static void main(String[] args){
        Toyota car = new Toyota();
        car.showSpeed();

    }
}