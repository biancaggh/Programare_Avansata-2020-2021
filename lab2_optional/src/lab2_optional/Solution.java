package lab2_optional;

import java.util.Arrays;

public class Solution extends Problem {
    private int[][] prod; /**numarul de produse de la sursa i la destinatia j*/
    private int[][] cost_dest; /**costul*/
    int cost = 0;

    public int[][] getProd() {
        return prod;
    }

    public void setProd(int[][] prod) {
        this.prod=prod;
    }
    public int[][] getCost_dest() {
        return cost_dest;
    }

    public void setCost_dest(int[][] cost_dest) {
        this.cost_dest=cost_dest;
    }

    public int cost_transport() { /**se calculeaza costul cu ajutorul unitatilor transportate de la surse la destinatii*/
        for (int i = 0; i < prod.length; i++) /**sursa i*/
            for (int j = 0; j < prod.length; j++) { /**destinatia j*/
                if (prod[i][j] != 0) /** daca valoarea din matrice!=0 -->atunci inmultim cu costul*/
                {
                    cost = cost + prod[i][j] * cost_dest[i][j];
                }
            }
        return cost; /**returneaza nr de costuri obtinute de la sursa i la destinatia j*/
    }

}
