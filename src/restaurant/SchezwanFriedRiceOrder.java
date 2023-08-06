package restaurant;

public class SchezwanFriedRiceOrder implements Order{
    Restaurant restaurant;
    SchezwanFriedRiceOrder(Restaurant restaurant){
        this.restaurant = restaurant;
    }
    @Override
    public void prepare() {
        restaurant.makeSchezwanFriedRice();
    }
}
