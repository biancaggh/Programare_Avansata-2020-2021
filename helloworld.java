class Hello_world{
    public static void main (String[] args){
        System.out.print("Hello World!");
        }
    }
class Languages {
    public static void main(String[] args) {
        int s;
        String[] language = {"C", "C++", "C#", "Python", "Go", "Rust", "JavaScript", "PHP", "Swift", "Java"};
        for (s=0;s< language.length;s++) System.out.println(language[s]);

        int n;
        n = (int) (Math.random() * 1_000_000);
        System.out.println("Numarul random e:");
        System.out.println(n);

        int multiply = n *3;
        System.out.println("Daca il inmultim cu 3 avem:");
        System.out.println(multiply);

        String binary="10101";
        int number = Integer.parseInt(binary,2);
        int result = multiply + number;
        System.out.println("Daca adaugam 10101 vom avea:");
        System.out.println(result);

        String hexa="FF";
        int alt_number = Integer.parseInt(hexa,16);
        int sum = result + alt_number;
        System.out.println("Daca la ce am obtinut adunam FF vom avea:");
        System.out.println(sum);

        int suma_tot= sum*6;
        System.out.println("Mai inmultim inca o data cu 6 si avem:");
        System.out.println(suma_tot);

        int suma_digits=0;
        int b = Integer.toString(suma_tot).length();
        int[] v = new int[b];
        for (int index = 0; index < b; index++) {
            v[index] = suma_tot % 10;
            suma_tot = suma_tot / 10;
            suma_digits=suma_digits+v[index];
        }
        System.out.println("Suma cifrelor este:");
        System.out.println(suma_digits);

        int suma_fin_d=0;
        int c = Integer.toString(suma_digits).length();
        int[] u = new int[c];
        for (int index = 0; index < c; index++) {
            u[index] = suma_digits % 10;
            suma_digits = suma_digits / 10;
            suma_fin_d=suma_fin_d+u[index];
        }
        System.out.println("Suma finala a cifrelor e:");
        System.out.println(suma_fin_d);

        System.out.printf("Willy-nilly, this semester I will learn " + language[suma_fin_d]);

    }
}
