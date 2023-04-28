package zad2;


class Truck extends Car {
    int weight;

    public double getSalePrice() {
        if (weight > 2000) {
            return regularPrice * 0.9;
        } else {
            return regularPrice;
        }
    }
}
