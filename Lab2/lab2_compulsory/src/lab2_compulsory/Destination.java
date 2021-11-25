package lab2_compulsory;

public class Destination extends Problem{
    @Override
    public String toString() {
        return "Destination{" +
                "name_d='" + name_d + '\'' +
                ", cost=" + cost +
                ", demand=" + demand +
                '}';
    }

    protected String name_d;
    protected int cost;
    protected int demand;

    public String getName_d(){
        return name_d;
    }

    void SetName_d(String name_d){
        this.name_d=name_d;
    }

    public int getCost(){
        return cost;
    }

    void SetCost(int cost){
        this.cost=cost;
    }

    public int getDemand(){
        return demand;
    }

    void SetDemand(int demand){
        this.demand=demand;
    }
}
