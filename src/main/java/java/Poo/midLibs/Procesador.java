package main.java.java.Poo.midLibs;

/**
 * Created by IntelliJ IDEA.
 * User: saysrodriguez
 * Date: 30/03/12
 * Time: 17:15
 * To change this template use File | Settings | File Templates.
 */
public class Procesador extends peticionDePalabras{

    public static String midLibs;

    public static void main(String [] args){
        buscadorDePalabras();
        pedirPalabras();
        System.out.println(ModificadorMidLibs().toString());


    }

    private static String ModificadorMidLibs(){
        int indiceCorrida = 0;
        String objetoCambio, objetoSustituto;

        while (palabrasDelUsuario.size() > indiceCorrida){
              objetoCambio = palabrasMidLibs.get(indiceCorrida);
              objetoSustituto = palabrasDelUsuario.get(indiceCorrida);

            midLibs = lineaArchivo.replace(objetoCambio,objetoSustituto);
            lineaArchivo = midLibs;
        }
        return midLibs;
    }


}
