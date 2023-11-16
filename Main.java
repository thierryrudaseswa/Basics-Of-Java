import java.io.*;

class CustomSetNumberException extends Exception {
    public CustomSetNumberException(String message) {
        super(message);
    }
}

interface RadioTV {
    void watchTelevision();

    void playRadio();
}

interface AirConditioner {
    void manageTemperature();
}

class Car implements Serializable {
    String color;
    int numberOfSeats;
    int minHeight;
    int maxHeight;

    public Car(String color, int numberOfSeats, int minHeight, int maxHeight) {
        this.color = color;
        this.numberOfSeats = numberOfSeats;
        this.minHeight = minHeight;
        this.maxHeight = maxHeight;
    }
}

class Toyota extends Car implements RadioTV {
    public Toyota(String color, int numberOfSeats, int minHeight, int maxHeight) {
        super(color, numberOfSeats, minHeight, maxHeight);
    }

    @Override
    public void watchTelevision() {
        System.out.println("Watching TV in Toyota");
    }

    @Override
    public void playRadio() {
        System.out.println("Playing radio in Toyota");
    }
}

class Benz extends Car implements AirConditioner, Serializable {
    public Benz(String color, int numberOfSeats) throws CustomSetNumberException {
        super(color, numberOfSeats, 200, 500);

        if (numberOfSeats > 100) {
            throw new CustomSetNumberException("The number of seats is beyond 100");
        }
    }

    @Override
    public void manageTemperature() {
        System.out.println("Managing temperature in Benz");
    }

    // Custom writeObject method to handle the exception during serialization
    private void writeObject(ObjectOutputStream out) throws IOException {
        out.defaultWriteObject();
    }
}

public class Main {
    public static void main(String[] args) {
        try {
            Benz benz = new Benz("Black", 90); // Set number of seats below 100
            Toyota toyota = new Toyota("Blue", 5, 150, 300);

            try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("car_objects.dat"))) {
                objectOutputStream.writeObject(benz);
                objectOutputStream.writeObject(toyota);
            } catch (IOException e) {
                e.printStackTrace();
            }

            try (ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("car_objects.dat"))) {
                while (true) {
                    try {
                        Car car = (Car) objectInputStream.readObject();
                        System.out.println("Car Color: " + car.color + ", Number of Seats: " + car.numberOfSeats +
                                ", Min Height: " + car.minHeight + ", Max Height: " + car.maxHeight);
                    } catch (EOFException e) {
                        break; // Break out of the loop when the end of the file is reached
                    }
                }
            } catch (IOException | ClassNotFoundException e) {
                e.printStackTrace();
            }

        } catch (CustomSetNumberException e) {
            System.err.println("Exception: " + e.getMessage());
        }
    }
}
