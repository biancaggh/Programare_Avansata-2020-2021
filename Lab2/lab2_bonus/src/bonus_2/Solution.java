package bonus_2;

public class Solution extends Problem{
    private int[][] prod;
    private int[][] cost_dest;
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

    public int cost_transport() {
        for (int i = 0; i < prod.length; i++)
            for (int j = 0; j < prod.length; j++) {
                if (prod[i][j] != 0)
                {
                    cost = cost + prod[i][j] * cost_dest[i][j];
                }
            }
        return cost;
    }
}
