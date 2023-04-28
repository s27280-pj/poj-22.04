package zad2;


class Sedan extends Car {
    int length;

    public double getSalePrice() {
        if (length > 20) {
            return regularPrice * 0.95;
        } else {
            return regularPrice * 0.9;
        }
    }
}
