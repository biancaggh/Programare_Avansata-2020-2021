package lab2_optional;

public class Factory extends Source{
    @Override
    public String toString() {
        return
                "name='" + name + '\'' +
                        ", type='" + type + '\'' +
                        ", supply=" + supply +
                        '}';
    }
    protected String name; /**numele pe care il are sursa*/
    private String type;
    protected int supply; /**capacitatea de produse pe care o poate transporta Sursa catre destinatie*/

    public String getName(){
        return name;
    }

    void setName(String name){
        this.name=name;
    }

    public String getType() { return type; }

    void setType(String type) {
        this.type = type;
    }

    public int getSupply(){
        return supply;
    }

    void setSupply(int supply){
        this.supply=supply;
    }

}
