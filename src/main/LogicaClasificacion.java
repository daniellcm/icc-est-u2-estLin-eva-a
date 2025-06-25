package main;

import java.util.*;

public class LogicaClasificacion {

    /**
     * Invierte el contenido de una cola de nombres utilizando una pila auxiliar.
     * 
     * Ejemplo:
     * Entrada: ["Ana", "Luis", "Pedro"]
     * Salida: ["Pedro", "Luis", "Ana"]
     *
     * @param cola cola original de nombres
     * @return nueva cola con los nombres en orden invertido
     */
    public Queue<String> invertirColaNombres(Queue<String> cola) {
        Stack<String> pila = new Stack<>();
        while (!cola.isEmpty()) {
            pila.push(cola.poll());
        }

        Queue<String> inver = new LinkedList<>();
        while(!pila.isEmpty()) {
            inver.add(pila.pop());
        }
        return inver; // Simulación de resultado
    }

    /**
     * Verifica si la palabra formada por los elementos de una cola es un
     * palíndromo.
     *
     * Se considera que la cola contiene letras individuales como strings.
     * Ejemplo:
     * Entrada: ["r", "a", "d", "a", "r"] → true
     * Entrada: ["c", "a", "s", "a"] → false
     *
     * @param cola Cola de letras en minúsculas
     * @return true si forman un palíndromo, false si no
     */
    public boolean verificarPalindromoCola(Queue<String> cola) {
        List<String> lista = new ArrayList<>(cola);
        int izq = 0;
        int der = lista.size() - 1;

        while(izq < der) {
            if (lista.get(izq).equals(lista.get(der))) {
            return false;
        }
        izq++;
        der--;
    }
        return true;
    }

}
