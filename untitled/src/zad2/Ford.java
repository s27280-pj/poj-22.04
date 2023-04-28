package zad2;

class Ford extends Car {
    int year;
    int manufacturerDiscount;

    public double getSalePrice() {
        return (super.getSalePrice() - manufacturerDiscount);
    }
}