public class notaenletras {
    public static void main(String[] args) {
        if(args.length < 1) return;

        int nota = Integer.parseInt(args[0]);

        if (nota >= 0 && nota < 5 ){
            System.out.println("La nota es insuficiente");
        } else if (nota >=5 && nota < 6 ){
            System.out.println("La nota es suficiente");
        } else if (nota >=6 && nota < 7 ){
            System.out.println("La nota es bien");
        } else if (nota >=7 && nota < 9 ){
            System.out.println("La nota es notable");
        } else if (nota >= 9 && nota < 10){
            System.out.println("La nota es sobresaliente");
        }

}
}