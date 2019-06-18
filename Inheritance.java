class Vehicle {
  protected String brand = "Toyota";         
  public void honk() {                     
    System.out.println("Ruut, ruut!");
  }
}

class Car extends Vehicle {
  private String modelName = "Chevrolet"; 
  public static void main(String[] args) {

   
    Car myCar = new Car();

   
    myCar.honk();

    
    System.out.println(myCar.brand + " " + myCar.modelName); 
  }
}