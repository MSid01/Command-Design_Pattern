package restaurant;

public class SoupOrder implements Order{
    Restaurant restaurant;
    SoupOrder(Restaurant restaurant){
        this.restaurant = restaurant;
    }
    @Override
    public void prepare() {
        restaurant.makeSoup();
    }
}
