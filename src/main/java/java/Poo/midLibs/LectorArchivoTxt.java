package main.java.java.Poo.midLibs;

/**
 * Created by IntelliJ IDEA.
 * User: saysrodriguez
 * Date: 30/03/12
 * Time: 17:17
 * To change this template use File | Settings | File Templates.
 */

import java.util.*;
import java.io.*;

public class LectorArchivoTxt {

    public static String lineaArchivo;
    public static ArrayList<String> palabrasMidLibs;

    public static void LectorArchivoTxt(){

        try{
            File archivoALeer = new File("archivo.txt");
            FileReader  leerArchivo = new FileReader(archivoALeer);
            BufferedReader stackMemoria = new BufferedReader(leerArchivo);
            while ((lineaArchivo = stackMemoria.readLine()) != null){
                 lineaArchivo = lineaArchivo+"\n";
            }

        } catch (Exception e){
            e.printStackTrace();
        }
    }



    public static void buscadorDePalabras(){
        int indiceCorrida = 0;
        String palabraClave = null;

        LectorArchivoTxt();

        while (lineaArchivo.length() > indiceCorrida){
            if (lineaArchivo.charAt(indiceCorrida) == '('){
                indiceCorrida++;
                if (lineaArchivo.charAt(indiceCorrida) == '('){
                    indiceCorrida++;
                    while (lineaArchivo.charAt(indiceCorrida) != ')'){
                        palabraClave = palabraClave + lineaArchivo.charAt(indiceCorrida);
                        indiceCorrida++;
                    }
                    palabrasMidLibs.add(palabraClave);
                }

            }
            indiceCorrida++;
        }

    }

}
