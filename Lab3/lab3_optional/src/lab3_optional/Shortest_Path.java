package lab3_optional;

/** Vom crea un algoritm pt Disjkstra -> cel mai scurt drum si vom avea nevoie de un graf reprezentat de o matrice ce incorporeaza matricea de adiacenta doar ca in loc de 1 vom avea distanta
 * va trebui sa gasim nodul cu val minima din setul de noduri care nu apartine de arborele cu drum minim
 * va trebui sa initializam minimul cu  valoare cat mai aproape de infinit (Integer.MAXVALUE) pt ca memoria sa poata aloca valorile de care trebuie sa ne ocupam
 * printam array-ul si aratam nodul si valoarea distantei
 * dist[] va pastra distanta minima de la un nod numit de noi la celelalte
 * sd[] -true ddaca nodul e inclus in arborele de drum minim sau daca distanta de la nodul nostru la un nod x e finalizata
 * initializam cu infinit valorile si sd e fals + distanta de la un nod dat la el insusi e 0
 * gasim drumul cel mai scurt si luam cea mai mica dstanta dintre nodurile neparcurse
 * dist[j] isi schimba valoarea atata timp cat nu e in sd, avem muchie intre nodul i si j si daca valoarea data de la nodul nostru la j e mai mica decat dist[j]
 * atunci cand, de ex cautam drumul de la nodul 2, distanta de la nodul 2 la cele anterioare va fi Integer.MAX_VALUE
 * */


public class Shortest_Path {
    int distanta_minima(int[] dist, Boolean[] sd)
    {
        int min=Integer.MAX_VALUE,min_index=-1;
        for(int i=0;i<6;i++){
            if(sd[i]==false && dist[i]<=min){
                min=dist[i];
                min_index=i;
            }
        }
        return min_index;
    }
    void printare(int[] dist, int n){
        System.out.println("Loc Distanta");
        for(int i=0;i<6;i++){
            System.out.println(i+"   "+dist[i]);
        }
    }

    void alg_dijkstra(int loco[][],int path){
        int dist[]=new int[6];
        Boolean sd[]=new Boolean[6];
        for(int i=0;i<6;i++){
            dist[i]=Integer.MAX_VALUE;
            sd[i]=false;
        }
        dist[path]=0;

        for(int i=0;i<5;i++){
            int min_d=distanta_minima(dist,sd);
            sd[min_d]=true;
            for(int j=0;j<6;j++){
                if(!sd[j] && loco[min_d][j]!=0 && dist[min_d]!=Integer.MAX_VALUE && dist[min_d]+loco[min_d][j]<dist[j])
                    dist[j]=dist[min_d]+loco[min_d][j];
            }
        }
        printare(dist,6);
    }
}
