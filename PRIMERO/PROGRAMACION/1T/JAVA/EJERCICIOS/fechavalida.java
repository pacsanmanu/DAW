public class fechavalida {
    public static void main(String[] args) {
        if (args.length < 3) return;
    
        int dia = Integer.parseInt(args[0]);
        int mes = Integer.parseInt(args[1]);
        int año = Integer.parseInt(args[2]);
        int diamaximo = 31;

        if (mes == 2){
            diamaximo = 28;
        }else if(mes == 4 || mes == 6 || mes == 9 || mes == 11){
            diamaximo = 30;
        }
        
        if ((mes >= 1 || mes <= 12) && (dia >= 1 && dia <= diamaximo)){
                System.out.println("La fecha " + dia + "-" + mes + "-" + año + "es válida");
        }

    }
}
