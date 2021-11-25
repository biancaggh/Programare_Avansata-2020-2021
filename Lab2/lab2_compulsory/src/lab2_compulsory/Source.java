package lab2_compulsory;

public class Source extends Problem {
    @Override
    public String toString() {
        return "Source{" +
                "name='" + name + '\'' +
                ", supply=" + supply +
                '}';
    }

    protected String name; //numele pe care il are sursa
    protected int supply; // capacitatea de produse pe care o poate transporta Sursa catre destinatie

    public String getName(){
        return name;
    }

    void setName(String name){
        this.name=name;
    }

    public int getSupply(){
        return supply;
    }

    void setSupply(int supply){
        this.supply=supply;
    }
}
