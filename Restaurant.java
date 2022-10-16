public abstract class Restaurant {
    public String name,address;

    // Accessors
    public String getName(){
        return name;
    }
    public String getAddress(){
        return address;
    }

    // Mutators
    public void setName(String n){
        name = n;
    }
    public void setAddress(String a){
        address = a;
    }

    // Constructors
    public Restaurant(){
        name = "";
        address = "";
    }
    public Restaurant(Restaurant r){
        name = r.name;
        address = r.address;
    }
    public Restaurant(String n,String a){
        name = n;
        address = a;
    }

    // ToString
    public String toString(){
        String msg = "The restaurant " + name + " is located " + address;
        return msg;
    }

    // Abstract
    public abstract String basicMenu();
}
