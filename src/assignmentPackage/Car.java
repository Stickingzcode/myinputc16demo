package assignmentPackage;

public class Car {
    private String carModel;
    private String year;
    private double carPrice;
    public Car (String carModel, String year, double carPrice) {
        this.carModel = carModel;
        this.year = year;
        if (carPrice > 0.0) {
            this.carPrice = carPrice;
        }
    }
        public void setCarModel (String carModel){
            this.carModel = carModel;
        }
        public String getCarModel(){
        return carModel;
        }
        public void setYear(String year){
        this.year = year;
        }
        public String getYear(){
        return year;
        }
        public void setCarPrice(double carPrice){
        this.carPrice = carPrice;
        }
        public void discount(double discount){
        carPrice = carPrice - (carPrice * (discount / 100));
        }
        public double getCarPrice(){
        return carPrice;
        }
    public static void main(String...args){
        Car myFirstCar = new Car("Suv", "2014", 17500000);
        Car mySecondCar = new Car("GWagon", "2021", 25300000);
        System.out.printf("I got my first car, a %s Toyota %s, for %,.2f million naira.", myFirstCar.getYear(),
                myFirstCar.getCarModel(), myFirstCar.getCarPrice());
        System.out.printf("%n My second car, the latest %s %s for %,.2f million naira.", mySecondCar.getYear(),
                mySecondCar.getCarModel(), mySecondCar.getCarPrice());
        myFirstCar.discount(5);
        System.out.printf("%na %s Toyota %s is now sold at a 5percent discount which is: %,.2f ", myFirstCar.getYear(),
                myFirstCar.getCarModel(), myFirstCar.getCarPrice());
        mySecondCar.discount(7);
        System.out.printf("%na %s %s is now sold at a discounted price of %,.2f", mySecondCar.getYear(),
                mySecondCar.getCarModel(), mySecondCar.getCarPrice());
    }
}
