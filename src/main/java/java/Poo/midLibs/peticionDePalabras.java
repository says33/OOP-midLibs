package main.java.java.Poo.midLibs;

/**
 * Created by IntelliJ IDEA.
 * User: saysrodriguez
 * Date: 30/03/12
 * Time: 19:05
 * To change this template use File | Settings | File Templates.
 */
import java.util.*;

public class peticionDePalabras extends LectorArchivoTxt{

    public static Scanner scanner;
    public static ArrayList<String> palabrasDelUsuario = new ArrayList<String>();
    public static String palabraTeclado;

    public static void pedirPalabras() {
        int indiceCorrida = 0;
        while (palabrasMidLibs.size() > indiceCorrida){
            System.out.println("Introduce un(a) "+palabrasMidLibs.get(indiceCorrida));
            palabrasDelUsuario.add(palabraTeclado = scanner.nextLine());
        }
    }


}
