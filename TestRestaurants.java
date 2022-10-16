public class TestRestaurants {
    public static void main(String[] args) {
        Restaurant[] myRestaurants = new Restaurant[3];
        myRestaurants[0] = new Pizzeria("AllPizzas","","Pepperoni and extra cheese");
        myRestaurants[1] = new RamenShop("LoveNoodles", "","Pork and chicken");
        myRestaurants[2] = new Bakery("CakeForEverybody","","Chocolate and Strawberry");

        for(int i =0;i<myRestaurants.length;i++){
            System.out.println(myRestaurants[i].basicMenu());
        }
        System.out.println("-------------");

        Delivery[] myDeliveries = new Delivery[2];
        myDeliveries[0] = new Pizzeria("AllPizzas", "","Pepperoni and extra cheese");
        myDeliveries[1] = new Bakery("CakeForEverybody","","Chocolate and Strawberry");

        for(int i =0;i<myDeliveries.length;i++){
            System.out.println(myDeliveries[i].deliveryRules());
        }
        System.out.println("-------------");

        EatInside[] myInsideEating = new EatInside[2];
        myInsideEating[0] = new Pizzeria("AllPizzas","","Pepperoni and extra cheese");
        myInsideEating[1] = new RamenShop("LoveNoodles", "", "Pork and chicken");

        for(int i =0;i<myInsideEating.length;i++){
            System.out.println(myInsideEating[i].eatInsideRules());
        }
    }
}
