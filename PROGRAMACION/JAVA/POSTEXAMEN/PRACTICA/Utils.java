package POSTEXAMEN.PRACTICA;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;

public class Utils 
{
    public static String[] LeerFichero(String rutaFichero) throws FileNotFoundException, IOException 
    { 
        String cadena; 

        FileReader f = new FileReader(rutaFichero); 

        int numeroLineas = ContarNumeroLineas(rutaFichero);
        BufferedReader b = new BufferedReader(f); 
        String[] resultado = new String[numeroLineas];

        int indice = 0;
        while((cadena = b.readLine())!=null) 
        { 
            resultado[indice] = cadena;
            indice++;
        }

        b.close();
        return resultado; 
    }

    private static int ContarNumeroLineas(String rutaFichero) throws IOException {
        LineNumberReader reader = null;

        try 
        {
            FileReader file = new FileReader(rutaFichero); 

            reader = new LineNumberReader(file);

            while ((reader.readLine()) != null);

            return reader.getLineNumber();
        } catch (Exception ex) 
        {
            return -1;
        } finally 
        { 
            if(reader != null) 
                reader.close();
        }
    }
}
