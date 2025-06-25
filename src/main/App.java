package main;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

import utils.StudentValidator;

public class App {
    public static void main(String[] args) throws Exception {
        // NO MODIFICAR ESTE CÓDIGO
        var estudiante = StudentValidator.validarDatos();
        System.out.println("👤 Estudiante: " + estudiante.nombre());
        System.out.println("✉️  Correo: " + estudiante.correo());
        // NO MODIFICAR HASTA AQUÍfdsafads
        
        LogicaClasificacion log = new LogicaClasificacion();

        Queue<String> col = new LinkedList<>(Arrays.asList("Ana" , "Luis" , "Pedro"));
        System.out.println("Cola original: " + col);
        Queue<String> inver = new LinkedList<>(Arrays.asList("Pedro", "Luis", "Ana"));
        System.out.println("Cola invertida: " + inver);
        Queue<String> caso1 = new LinkedList<>(Arrays.asList("r", "a", "d", "a", "r"));
        System.out.println("Palindromo: " + log.verificarPalindromoCola(caso1));
        Queue<String> caso4 = new LinkedList<>(Arrays.asList("c", "a", "s", "a"));
        System.out.println("No Palindromo : " + log.verificarPalindromoCola(caso4));

        
        
        

    }
}
