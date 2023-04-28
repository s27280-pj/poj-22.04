package zad2;

class AutoShop {
    public static void main(String[] args) {
        Sedan sedan = new Sedan();
        sedan.speed = 80;
        sedan.regularPrice = 20000;
        sedan.color = "Red";
        sedan.length = 25;
        System.out.println("SEDAN: " + sedan.getSalePrice());

        Ford ford1 = new Ford();
        ford1.speed = 100;
        ford1.regularPrice = 30000;
        ford1.color = "Blue";
        ford1.year = 2018;
        ford1.manufacturerDiscount = 5000;
        System.out.println("FORD 1: " + ford1.getSalePrice());

        Ford ford2 = new Ford();
        ford2.speed = 120;
        ford2.regularPrice = 40000;
        ford2.color = "Black";
        ford2.year = 2020;
        ford2.manufacturerDiscount = 10000;
        System.out.println("FORD 2: " + ford2.getSalePrice());

        Truck truck = new Truck();
        truck.speed = 60;
        truck.regularPrice = 50000;
        truck.color = "White";
        truck.weight = 3000;
        System.out.println("TRUCK: " + truck.getSalePrice());
    }
}