public class ajedrez {
    public static void main(String[] args) {

        String blanco = "##";
        String negro = "  ";
        int linea = 1;
        int casilla = 0;
        
           /* while (linea <= 8){
                if(linea % 2 == 0){
                    System.out.println(blanco + negro + blanco + negro + blanco + negro + blanco + negro);
                    linea++;
                }else{
                    System.out.println(negro + blanco + negro + blanco + negro + blanco + negro + blanco);
                    linea++;
                }
            }*/ 


            boolean color = true;

            for(linea = 0; linea < 8; linea++){

                for(casilla = 0; casilla < 4; casilla++){
                    if(color){
                        System.out.print(blanco);
                        System.out.print(negro);
                    }else{
                        System.out.print(negro);
                        System.out.print(blanco);
                    }   
                    
                }
                System.out.println("");
                color = !color;
            }

            }


    }
