public class Bakery extends Restaurant implements Delivery{
    private String sweetList;

    // Accessors
    public String getSweet(){
        return sweetList;
    }

    // Mutators
    public void setSweet(String s){
        sweetList = s;
    }

    // Constractors
    public Bakery(){
        name = "";
        address = "";
        sweetList = "";
    }
    public Bakery(Bakery b){
        name = b.name;
        address = b.address;
        sweetList = b.sweetList;
    }
    public Bakery(String n,String a,String s){
        name = n;
        address = a;
        sweetList = s;
    }

    // ToString
    public String toString(){
        String msg = "The restaurant " + name + " is located " + address + " and the sweet list is " + sweetList;
        return msg;
    }

    @Override
    public String basicMenu(){
        return "Your favorite Pastry";
    };

    @Override
    public String deliveryRules(){
        return "Be patient";
    }
}
