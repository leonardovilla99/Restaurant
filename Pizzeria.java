public class Pizzeria extends Restaurant implements Delivery, EatInside{
    private String toppingList;

    // Accessors
    public String getTopping(){
        return toppingList;
    }

    // Mutators
    public void setTopping(String t){
        toppingList = t;
    }

    // Constructors
    public Pizzeria(){
        name = "";
        address = "";
        toppingList = "";
    }
    public Pizzeria(Pizzeria p){
        name = p.name;
        address = p.address;
        toppingList = p.toppingList;
    }
    public Pizzeria(String n,String a,String t){
        name = n;
        address = a;
        toppingList = t;
    }

    // ToString
    public String toString(){
        String msg = "The restaurant " + name + " is located " + address + " and the topping list is " + toppingList;
        return msg;
    }

    @Override
    public String basicMenu(){
        return "All types of pizzas";
    };

    @Override
    public String deliveryRules(){
        return "Tip well";
    }

    @Override
    public String eatInsideRules(){
        return "Choose your table";
    }
}
