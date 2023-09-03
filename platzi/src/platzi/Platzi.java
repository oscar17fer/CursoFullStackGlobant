
package platzi;

import platzi.account.Car;


public class Platzi {

    
    public static void main(String[] args) {
        Car car = new Car();
        car.licencia = "AMQ123";
        car.driver = "Andres Herrera";
        car.passangers = 4;
        
        
        Car car2 = new Car();
        car.licencia = "SGZ465";
        car.driver = "Andres Herrera";
        car.passangers = 3;
        car.printDataCar();
        System.out.println("car linces " + car.licencia );
    }
    
}
