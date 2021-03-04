package lab2_optional;


import java.util.Objects;

abstract class Source {
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Source source = (Source) o;
        return supply == source.supply && Objects.equals(name, source.name) && Objects.equals(type, source.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, type, supply);
    }

    @Override
    public String toString() {
        return "Source{" +
                "name='" + name + '\'' +
                "type='" + type + '\'' +
                ", supply=" + supply +
                '}';
    }

    protected String name;
    protected String type;
    protected int supply; /** capacitatea de produse pe care o poate transporta Sursa catre destinatie*/

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
