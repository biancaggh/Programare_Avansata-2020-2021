package bonus_2;

public class Warehouse extends Source{
    @Override
    public String toString() {
        return
                "name='" + name + '\'' +
                        ", type='" + type + '\'' +
                        ", supply=" + supply +
                        '}';
    }
    protected String name;
    private String type;
    protected int supply;

    public String getName(){
        return name;
    }

    void setName(String name){
        this.name=name;
    }

    public String getType() {
        return type;
    }

    void SetType(String type) {
        this.type = type;
    }

    public int getSupply(){
        return supply;
    }

    void setSupply(int supply){
        this.supply=supply;
    }
}
