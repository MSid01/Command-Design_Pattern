package restaurant;

public class Customer {
    public static void main(String[] args) {
        Restaurant restaurant = new Restaurant();
        Order omeletteOrder = new OmeletteOrder(restaurant);
        Waiter waiter = new Waiter(omeletteOrder);

//        waiter.sendOrder();

        Order schezwanFriedRiceOrder = new SchezwanFriedRiceOrder(restaurant);
        waiter.takeOrder(schezwanFriedRiceOrder);

//        waiter.sendOrder();

        Order tripleRiceOrder = new TripleRiceOrder(restaurant);
        waiter.takeOrder(tripleRiceOrder);
        waiter.sendOrder();
    }
}
