import java.util.Scanner;

public class mayorNmenorN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a, b, c, d;

        int unidades, decenas, centenas, unidadesMillar;

        a = sc.nextInt();
        b = sc.nextInt();

        if (a == b){

        }else{

            c = sc.nextInt();

            if (a == c || b == c){

            }else{

                d = sc.nextInt();

                if (a == d || b == d || c == d){

                }else{

                    if (a > b){
                        if (a > c){
                            if (a > d){
                                unidadesMillar = a;
                            }else{
                                unidadesMillar = d;
                            }
                        }else{
                            if (c > d){
                                unidadesMillar = c;
                            }else{
                                unidadesMillar = d;
                            }
                        }
                    }else{
                        if (b > c){
                            if (b > d){
                                unidadesMillar = b;
                            }else{
                                unidadesMillar = d;
                            }
                        }else{
                            if (c > d){
                                unidadesMillar = c;
                            }else{
                                unidadesMillar = d;
                            }
                        }
                    }
                    }
                }
            }
        }
}

