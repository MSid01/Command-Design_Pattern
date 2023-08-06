package restaurant;

public class TripleRiceOrder implements Order{
    Restaurant restaurant;

    TripleRiceOrder(Restaurant restaurant){
        this.restaurant = restaurant;
    }
    @Override
    public void prepare() {
        restaurant.makeSchezwanFriedRice();
        restaurant.makeOmelette();
        restaurant.makeSoup();
        System.out.println("Triple Rice prepared!! 🥳");
    }
}
