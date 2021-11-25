package lab1_optional;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;
public class Matrice_nr {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Cate noduri va doriti?"); // alegem un numar pentru a forma o matrice de tip nxn
        int n;
        n = s.nextInt();
        System.out.println(" ");
        System.out.println("Vom crea o matrice de adiacenta."); //matricea de adiacenta trebuie sa aiba pe dp 0 si in rest numerele sunt puse random
        System.out.println(" ");
        Random rand = new Random();
        int[][] matrice = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j) {
                    matrice[i][j] = 0; //elementele de pe dp
                } else {
                    matrice[i][j] = rand.nextInt(2); //restul elementelor
                }
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("\t" + matrice[i][j]); //printam elementele matricei
            }
            System.out.println();
        }
        System.out.println(" ");
        System.out.println("Sa verificam daca graful nostru este conex.");
        System.out.println(" ");

        boolean conex = Conex(matrice, n);
        if (conex) {
            System.out.println("Graful nostru este conex."); // daca conex=1 => avem un graf conex
        } else {
            System.out.println("Graful nostru nu e conex."); // daca conex=0 => graful nu e conex
        }
        System.out.println(" ");
        System.out.println("Sa verificam daca e aciclic.");
        System.out.println(" ");

        boolean aciclic = Aciclic(matrice, n);
        if (aciclic) {
            System.out.println("Graful nostru nu e aciclic."); // daca aciclic=1 => avem cicluri ceea ce inseamna ca graful nu e aciclic
        } else {
            System.out.println("Graful nostru e aciclic.");  // aciclic=0 => nu avem cicluri => aciclic
        }

        //pentru a verifica daca un graf are un arbore partial trebuie sa verificam mai intai daca graful e un arbore
        // un graf e un arbore daca este aciclic si conex
        if (!aciclic && conex) {
            System.out.println(" ");
            System.out.println("Graful nostru e un arbore.Este posibil sa avem cel putin un arbore partial.");
            System.out.println(" ");
            System.out.println("Hai sa verificam daca exista vreun arbore partial.");
            boolean partial= Arbore_partial(matrice,n);
            if(partial){
                System.out.println(" ");
                System.out.println("Arborele nostru are un arbore partial");

            }
        } else {
            System.out.println("Graful nostru nu e arbore deci nu exista arbori partiali.");
        }

    }

    private static boolean Conex(int[][] matrice, int n) {  // functia Conex ne arata daca graful reprezentat de matricea de adiacenta e conex
        int vizita[] = new int[n];
        int elm_conexe=0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (matrice[i][j] == 1 && matrice[j][i] == 1 && vizita[i] == 0) { // pt a fi conex avem nevoie de existenta drumului de la i la j dar si de la j la i
                    vizita[i] = 1;
                    System.out.println("De la nodul " + i + " catre nodul " + j + " .");
                    System.out.println("Trecem mai departe.");
                    System.out.println(" ");
                    elm_conexe++;
                }
            }
        }
        System.out.println("Avem " + elm_conexe + " elemente conexe.");
        boolean conex = false;
        System.out.println(Arrays.toString(vizita)); //ne arata pt care noduri avem drum de la i la j dar si de la j la i
        for (int i = 1; i < n; i++) {
            if (vizita[i] == 1) {
                conex = true;  // daca avem vizita de la i=1 inseamna ca nodurile i si j sunt adiacente
            } else {
                conex = false; // in caz contrar nu gasim nodurile
                break;
            }
        }
        return conex;
    }

    public static boolean Aciclic(int[][] matrice, int n) { // pt a demonstra ca un graf e aciclic trebuie sa demonstram ca nu avem lanturi
        int nr_cicluri = 0;
        int vizita[] = new int[n];
        for (int i = 0; i < n; i++) { // un lant poate fi de forma i-> j j->k k->i
            for (int j = 0; j < n; j++) { // daca avem un lant format din cel putin 3 noduri atunci nu mai avem un graf aciclic
                for (int k = 0; k < n; k++) {
                    if (matrice[i][j] == 1 && matrice[j][k] == 1 && matrice[k][i] == 1) {
                        vizita[i] = 1;
                        System.out.println("De la nodul  " + i + " catre nodul  " + j + " spre nodul " + k + " .");
                        System.out.println("Avem un ciclu.");
                        System.out.println(" ");
                        nr_cicluri++;
                    }
                }
            }
        }
        System.out.println("Avem " + nr_cicluri + " cicluri.");
        System.out.println(" ");
        boolean aciclic = false;

        for (int i = 1; i < n; i++) {
            if (vizita[i] == 1) { // daca gasim 3 noduri care formeaza un lant atunci vectorul vizita stocheaza existenta unui lant
                aciclic = true;
            } else {
                aciclic = false; // in caz contrar apare false => nu avem lant
            }
        }
        return aciclic;

    }

    public static boolean Arbore_partial(int[][] matrice, int n) {
        int vizita[] = new int[n];
        Random rand = new Random();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n-i; j++) {
                for (int k = 0; k < n-i; k++) {
                    if (k != i && j != i) {
                        if (matrice[j][k] == 1 && matrice[k][j] == 1 && vizita[j] == 0) {
                            vizita[i] = 1;
                            System.out.println("De la nodul " + j + " catre nodul " + k + " .");
                            System.out.println("Trecem mai departe.");
                            System.out.println(" ");
                        }
                    }
                }
            }
        }
        boolean partial = false;
        System.out.println(Arrays.toString(vizita));
        for (int i = 1; i < n; i++) {
            if (vizita[i] == 1) {
                partial = true;
            } else {
                partial = false;
                break;
            }
        }
        return partial;
    }
}


