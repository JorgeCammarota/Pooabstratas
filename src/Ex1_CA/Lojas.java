package Ex1_CA;

import java.util.ArrayList;
import java.util.Scanner;

public class Lojas {
    static int cod_Barras;


    public static void main(String[] args) {


        ArrayList<Produto> produtos = new ArrayList<Produto>();


        CD cd0 = new CD(596895);
        cd0.dados("Nirvana", 80.00, 30);


        CD cd1 = new CD(859612);
        cd1.dados("Nevermind", 55.00, 10);

        DVD dvd0 = new DVD(125847523);
        dvd0.dados("Velozes e Furiosos", 50.00, "2:00");

        Livros livro0 = new Livros(745558841);
        livro0.dados("Pai Rico, Pai Pobre", 51.00, "Robert Kiyosak");

        Livros livro1 = new Livros(258041258);
        livro1.dados("Do Mil ao Milhão. Sem Cortar o Cafezinho", 45.00, "Thiago Nigro");


        produtos.add(cd0);
        produtos.add(cd1);
        produtos.add(dvd0);
        produtos.add(livro0);
        produtos.add(livro1);


        for (Produto produto : produtos){
            System.out.println(produto.mostrarDetalhesDoItem());
        }



        Scanner entrada = new Scanner(System.in);
        System.out.println("\nInforme o código de barras do produto: ");

        cod_Barras = entrada.nextInt();
        Lojas.LocalizaProd(produtos, cod_Barras);

    }

    public static void LocalizaProd(ArrayList<Produto> produtos, int cod_Barras)
    {
        for (Produto produto : produtos){
            if (produto.GetCod_Barras() == cod_Barras){
                System.out.println(produto.mostrarDetalhesDoItem());
                return;
            }
        }
        System.out.println("Produto não encontrado.");
    }
}
