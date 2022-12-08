public class mes {
    public static void main(String[] args) {
        if (args.length < 1) return;

        int mes = Integer.parseInt(args[0]);

        String[] meses = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto",
        "Septiembre", "Octubre", "Noviembre", "Diciembre"};
    
        if (mes <= 12){
            System.out.println(meses[mes - 1]);
        }else{
            System.out.println("Introduzca un mes válido");
        }
    }          
}
