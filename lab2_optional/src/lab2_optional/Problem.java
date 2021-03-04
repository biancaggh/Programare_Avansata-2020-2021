package lab2_optional;

import java.util.Arrays;

public class Problem {

    public static void main(String[] args) throws Exception {
        Source S1 = new Factory();
        S1.setName("Macada"); /**numele, tipul su cantitatea de produse */
        S1.setType("FACTORY");
        S1.setSupply(10);
        int s1=S1.getSupply();
        System.out.println(S1);

        Source S2= new Warehouse();/**numele, tipul su cantitatea de produse */
        S2.setName("Motovello");
        S2.setType("WAREHOUSE");
        S2.setSupply(35);
        int s2=S2.getSupply();
        System.out.println(S2);

        Source S3= new Warehouse();/**numele, tipul su cantitatea de produse */
        S3.setName("Jamilla");
        S3.setType("WAREHOUSE");
        S3.setSupply(25);
        int s3 = S3.getSupply();
        System.out.println(S3);
        System.out.println(" ");

        Destination D1= new Destination();/**numele,cele 3 costuri si nr_cerere */
        D1.SetName_d("Iasi");
        D1.SetCost(2);
        D1.SetDemand(20);
        int d_1_1 = D1.getCost();
        System.out.println(D1);

        D1.SetCost(3);
        int d_1_2 = D1.getCost();
        D1.SetDemand(20);
        System.out.println(D1);

        D1.SetCost(1);
        int d_1_3 = D1.getCost();
        D1.SetDemand(20);
        int d1=D1.getDemand();
        System.out.println(D1);
        System.out.println(" ");

        Destination D2= new Destination(); /**numele,cele 3 costuri si nr_cerere */
        D2.SetName_d("Suceava");
        D2.SetCost(5);
        int d_2_1 = D2.getCost();
        D2.SetDemand(25);
        System.out.println(D2);


        D2.SetCost(4);
        int d_2_2 = D2.getCost();
        D2.SetDemand(25);
        System.out.println(D2);


        D2.SetCost(8);
        int d_2_3 = D2.getCost();
        D2.SetDemand(25);
        int d2 =D2.getDemand();
        System.out.println(D2);
        System.out.println(" ");

        Destination D3= new Destination(); /**numele,cele 3 costuri si nr_cerere */
        D3.SetName_d("Falticeni");
        D3.SetCost(5);
        int d_3_1 = D3.getCost();
        D3.SetDemand(25);
        System.out.println(D3);

        D3.SetCost(6);
        int d_3_2 = D3.getCost();
        D3.SetDemand(25);
        System.out.println(D3);

        D3.SetCost(8);
        int d_3_3 = D3.getCost();
        D3.SetDemand(25);
        int d3= D3.getDemand();
        System.out.println(D3);
        System.out.println(" ");
        System.out.println("Matricea de cost:");
        int[][] matrice={{2,3,1},
                {5,4,8},
                {5,6,8},
        };

        for (int i = 0; i < matrice.length; i++) {    /**matricea costului */
            for (int j = 0; j < matrice[i].length; j++) {
                System.out.print(matrice[i][j] + " ");
            }
            System.out.println();
        }

        Solution sol=new Solution(); /**se calculeaza costul total*/
        int[][] prod=new int[][]{{0,0,10},{0,25,10},{20,0,5}};
        sol.setProd(new int[][]{{0,0,10},{0,25,10},{20,0,5}});
        int[][] cost_dest=new int[][]{{2,3,1},{5,4,8},{5,6,8}};
        sol.setCost_dest(new int[][]{{2,3,1},{5,4,8},{5,6,8}});
        System.out.println("Cost total: " + sol.cost_transport());
    }

}