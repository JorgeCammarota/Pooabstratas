package Ex1_interface;

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {

        construcao();
    }
    public static void construcao(){
        Scanner in= new Scanner(System.in);
        Fabrica_Lampada lampada = new Fabrica_Lampada();
        Fabrica_Lampada.Incandescente lamp1 = lampada.new Incandescente();
        Fabrica_Lampada.Fluorescente lamp2 = lampada.new Fluorescente();

        lampada.construir();


    }
}
