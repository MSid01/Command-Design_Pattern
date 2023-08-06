package restaurant;

public class Waiter {
    Order order;

    Waiter(Order order){
        this.order = order;
    }

    void takeOrder(Order order){
        this.order = order;
    }

    void sendOrder(){
        order.prepare();
    }
}
