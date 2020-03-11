package tapan;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//public class Decorator {

//}
interface Food {
    public String prepareFood();
    public double foodPrice();
}
class VegFood implements Food {
    public String prepareFood(){
        return "Veg Food";
    }

    public double foodPrice(){
        return 50.0;
    }
}
abstract class FoodDecorator implements Food{
    private Food newFood;
    public FoodDecorator(Food newFood)  {
        this.newFood=newFood;
    }
    @Override
    public String prepareFood(){
        return newFood.prepareFood();
    }
    public double foodPrice(){
        return newFood.foodPrice();
    }
}
class NonVegFood extends FoodDecorator{
    public NonVegFood(Food newFood) {
        super(newFood);
    }
    public String prepareFood(){
        return super.prepareFood() +" With Roasted Chiken and Chiken Curry  ";
    }
    public double foodPrice()   {
        return super.foodPrice()+150.0;
    }
}
class ChineeseFood extends FoodDecorator{
    public ChineeseFood(Food newFood)    {
        super(newFood);
    }
    public String prepareFood(){
        return super.prepareFood() +" With Fried Rice and Manchurian  ";
    }
    public double foodPrice()   {
        return super.foodPrice()+65.0;
    }
}