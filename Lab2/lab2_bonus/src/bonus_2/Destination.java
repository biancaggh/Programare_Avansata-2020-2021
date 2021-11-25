package bonus_2;

import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Destination that = (Destination) o;
        return cost == that.cost && demand == that.demand && Objects.equals(name_d, that.name_d);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name_d, cost, demand);
    }
}
