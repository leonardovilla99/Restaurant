public class RamenShop extends Restaurant implements EatInside{
    private String proteinList;

    // Accessors
    public String getProtein(){
        return proteinList;
    }

    // Mutators
    public void setProtein(String p){
        proteinList = p;
    }

    // Constractors
    public RamenShop(){
        name = "";
        address = "";
        proteinList = "";
    }
    public RamenShop(RamenShop r){
        name = r.name;
        address = r.address;
        proteinList = r.proteinList;
    }
    public RamenShop(String n,String a,String p){
        name = n;
        address = a;
        proteinList = p;
    }

    // ToString
    public String toString(){
        String msg = "The restaurant " + name + " is located " + address + " and the protein list is " + proteinList;
        return msg;
    }

    @Override
    public String basicMenu(){
        return "Delicious ramen";
    };

    @Override
    public String eatInsideRules(){
        return "Wait for Ramen to cooldown a bit";
    }
}
