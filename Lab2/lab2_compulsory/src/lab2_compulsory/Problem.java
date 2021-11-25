package lab2_compulsory;

enum SourceType {
    S1("FACTORY"),
    S2("WAREHOUSE"),
    S3("WARESOUSE");

    private String type;

    private SourceType(String t) {
        t = type;
    }

    public String getType() {
        return type;
    }

    void SetType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "SourceType{" +
                "type='" + type + '\'' +
                '}';
    }
}

public class Problem {
    public static void main(String[] args) {
        Source S1 = new Source();
        S1.setName("Macada");
        S1.setSupply(10);
        int s1=S1.getSupply();

        Source S2= new Source();
        S2.setName("Motovello");
        S2.setSupply(35);
        int s2=S2.getSupply();

        Source S3= new Source();
        S3.setName("Jamilla");
        S3.setSupply(25);
        int s3 = S3.getSupply();

        Destination D1= new Destination();
        D1.SetName_d("Iasi");
        D1.SetCost(2);
        int d_1_1 = D1.getCost();
        D1.SetCost(3);
        int d_1_2 = D1.getCost();
        D1.SetCost(1);
        int d_1_3 = D1.getCost();
        D1.SetDemand(20);
        int d1=D1.getDemand();

        Destination D2= new Destination();
        D2.SetName_d("Suceava");
        D2.SetCost(5);
        int d_2_1 = D2.getCost();
        D2.SetCost(4);
        int d_2_2 = D2.getCost();
        D2.SetCost(8);
        int d_2_3 = D2.getCost();
        D2.SetDemand(25);
        int d2 =D2.getDemand();

        Destination D3= new Destination();
        D3.SetName_d("Falticeni");
        D3.SetCost(5);
        int d_3_1 = D3.getCost();
        D3.SetCost(6);
        int d_3_2 = D3.getCost();
        D3.SetCost(8);
        int d_3_3 = D3.getCost();
        D3.SetDemand(25);
        int d3= D3.getDemand();

        // luam s1-->d3
        int s1_d3=0;
        if(s1<d3) {
            s1_d3 = s1 * d_1_3;
        }
        else if(d3<s1)
        {
            s1_d3=d3*d_3_3;
            s1=s1-d3;
        }
        System.out.println("S1-->D3: "+ s1 +" * "+ d_3_3 + " = " + s1_d3);

        //luam s2-->d2
        int s2_d2=0;
        if(s2<d2) {
            s2_d2 = s2 * d_2_2;
        }
        else if(d2<s2)
        {
            s2_d2=d2*d_2_2;
            s2=s2-d2;
        }
        System.out.println("S2-->D2:" + s2 + " * " + d_2_2 + " = " + s2_d2);

        //luam s2-->d3
        int s2_d3=0;
        if(s2<d3) {
            s2_d3 = s2* d_2_3;
        }
        else if(d3<s2)
        {
            s2_d3=d3*d_2_3;
            s2=s2-d3;
        }
        System.out.println("S2-->D3: " + s2 + " * " + d_2_3 + " = " + s2_d3);

        //luam s3-->d1
        int s3_d1=0;
        if(s3<d1) {
            s3_d1 = s3 * d_3_1;
            System.out.println("S3-->D1: " + s3 + " * " + d_3_1 + " = " + s3_d1);
        }
        else if( d1 < s3) {
            s3_d1 = d1 * d_3_1;
            s3 = s3 - d1;
            System.out.println("S3-->D1: " + d1 + " * " + d_3_1 + " = " + s3_d1);
        }

        //luam s3-->d3
        int s3_d3=0;
        if(s3<d3) {
            s3_d3 = s3 * d_3_3;
        }
        else if(d3<s3)
        {
            s3_d3=d3*d_3_3;
            s3=s3-d3;
        }
        System.out.println("S3-->D3: "+ s3 + " * " + d_3_3 + " = " + s3_d3);

        int cost_t=s1_d3+s2_d3+s2_d2+s3_d3+s3_d1;
        System.out.println("Total cost: "+ cost_t);

    }

}
