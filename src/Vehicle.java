public class Vehicle {
    int price;
    int seater;
    String color;
    String brand;
    int designNumber;

    public Vehicle(int price, int seater, String color) {
        this.price = price;        // ( attributes / variable / data member )
        this.seater = seater;      // (     "           "           "       )
        this.color = color;        // (     "           "           "       )
    }
    public Vehicle(int price, int seater, String color, String brand) {
//        this.price = price;
//        this.seater = seater;
//        this.color = color;
//        avoid repeating code use already initialize value in another constructor
//        avoid reinitializing value of attributes which are already initialized in another constructor
          this(price, seater, color);
          this.brand = brand;
    }

    public Vehicle(int price, int seater, String color, String brand, int designNumber ) {
        // don't repeat code
        this(price, seater, color, brand);
        this.designNumber = designNumber;
    }
}
