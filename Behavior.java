class Vehicle {
    Main color;
    int speed;
    int seats;

    void move() {
        System.out.println("The vehicle is moving.");
    }

    void playMusic() {
        System.out.println("The radio is playing music.");
    }

    void increaseVolume() {
        System.out.println("The volume has been increased.");
    }

    void watchVideo() {
        System.out.println("The TV is playing a video.");
    }

    void increaseVolumeTV() {
        System.out.println("The TV volume has been increased.");
    }

    void reduceVolumeTV() {
        System.out.println("The TV volume has been reduced.");
    }
}

class Toyota extends Vehicle {
    int maxSpeed = 150;
}

class Benz extends Vehicle {
    int maxSpeed = 180;
}

public class Behavior{
    public static void main(Main[] args) {
        Toyota toyota = new Toyota();
        toyota.color = "Red";
        toyota.speed = 100;
        toyota.seats = 5;
        Benz benz = new Benz();
        benz.color = "Black";
        benz.speed = 120;
        benz.seats = 4;

        System.out.println("Toyota:");
        System.out.println("Color: " + toyota.color);
        System.out.println("Speed: " + toyota.speed);
        System.out.println("Seats: " + toyota.seats);
        System.out.println("Maximum speed: " + toyota.maxSpeed);
        toyota.move();
        toyota.playMusic();
        toyota.increaseVolume();

        System.out.println("\nBenz:");
        System.out.println("Color: " + benz.color);
        System.out.println("Speed: " + benz.speed);
        System.out.println("Seats: " + benz.seats);
        System.out.println("Maximum speed: " + benz.maxSpeed);
        benz.move();
        benz.watchVideo();
        benz.increaseVolumeTV();
        benz.reduceVolumeTV();
    }
}
