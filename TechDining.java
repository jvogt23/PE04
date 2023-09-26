import java.util.Random;
public class TechDining {

    //Creates randomly generated meal of specified size.
    public static Food[] createMeal(int length) {
        int numOptions = Food.values().length;
        Random rand = new Random();
        Food[] meal = new Food[length];
        for (int i = 0; i < length; i++) {
            int option = rand.nextInt(numOptions);
            meal[i] = Food.values()[option];
        }
        return meal;
    }

    //Creates an order, takes in number of meals, and
    //the number of meals also represents the largest meal
    public static Food[][] createOrder(int size) {
        Food[][] order = new Food[size][];
        int j = 0;
        for (int i = size; i >= 1; i--) {
            order[j] = createMeal(i);
            j++;
        }
        return order;
    }

    //Cost of a Food[] array is calculated here
    public static int mealCost(Food[] meal) {
        int finalCost = 0;
        for (int i = 0; i < meal.length; i++) {
            int j = meal[i].ordinal();
            finalCost += (j * i);
        }
        return finalCost;
    }

    //Cost of an entire meal; reuses mealCost
    public static int orderCost(Food[][] order) {
        int finalCost = 0;
        for (int i = 0; i < order.length; i++) {
            finalCost += mealCost(order[i]);
        }
        return finalCost;
    }
}