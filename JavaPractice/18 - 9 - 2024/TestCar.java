class Car {
    String model;
    
    // Constructor with parameter 'model'
    public Car(String model) {
        // 'this.model' refers to the instance variable 'model'
        // 'model' without 'this' refers to the parameter passed to the constructor
        this.model = model;
    }

    public void printModel() {
        System.out.println("Car model: " + this.model);
    }
}

public class TestCar {
    public static void main(String[] args) {
        Car myCar = new Car("Tesla");
        myCar.printModel();  // Outputs: Car model: Tesla
    }
}
