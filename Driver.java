public class Driver {
    public static void main(String[] args) {

        //Individual meals
        System.out.println("Meals: ");
        Food[] meal1 = TechDining.createMeal(2);
        String mstr1 = mealToString(meal1);
        System.out.println(mstr1);
        System.out.println(TechDining.mealCost(meal1));

        Food[] meal2 = TechDining.createMeal(5);
        String mstr2 = mealToString(meal2);
        System.out.println(mstr2);
        System.out.println(TechDining.mealCost(meal2));

        Food[] meal3 = TechDining.createMeal(0);
        String mstr3 = mealToString(meal3);
        System.out.println(mstr3);
        System.out.println(TechDining.mealCost(meal3));

        System.out.println("Orders: ");

        //Orders
        Food[][] order1 = TechDining.createOrder(3);
        String ords1 = orderToString(order1);
        System.out.println(ords1);
        System.out.println(TechDining.orderCost(order1));

        Food[][] order2 = TechDining.createOrder(4);
        String ords2 = orderToString(order2);
        System.out.println(ords2);
        System.out.println(TechDining.orderCost(order2));

        Food[][] order3 = TechDining.createOrder(0);
        String ords3 = orderToString(order3);
        System.out.println(ords3);
        System.out.println(TechDining.orderCost(order3));

    }

    private static String mealToString(Food[] meal) {
        String o = "";
        for (Food i : meal) {
            o += i.toString() + " | ";
        }
        return o;
    }

    private static String orderToString(Food[][] order) {
        String o = "";
        for (Food[] i : order) {
            o += mealToString(i);
            o += "\r\n";
        }
        return o;
    }
}