public class Car{
    String color;
    int wheels;
    int price;
    float kilometer;
    String model;
    float fuelInLiters;
    int currentFuelInLiters;
    
    public void start(){
        if(currentFuelInLiters == 0){
            System.out.println("Car is out of fuel, can't start");

        } else if(currentFuelInLiters < 5){
            System.out.println("Car is in reserved mood, please refuel");

        } else {
            System.out.println("Car is start");
            currentFuelInLiters--;
        }
        
    }

    public void drive(){
        currentFuelInLiters--;
        System.out.println("Car is driving");
    }

    public void addFuel(float fuelInLiters){
        currentFuelInLiters += fuelInLiters;
    }
}