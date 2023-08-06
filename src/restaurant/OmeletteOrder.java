package restaurant;

public class OmeletteOrder implements Order{
    Restaurant restaurant;
    OmeletteOrder(Restaurant restaurant){
        this.restaurant = restaurant;
    }
    @Override
    public void prepare() {
        restaurant.makeOmelette();
    }
}
