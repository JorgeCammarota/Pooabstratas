package Ex1_CA;

public class Produto {
    private String nome;
    private double preco;
    private int cod_Barras;


    public Produto (int cod_Barras){
        this.cod_Barras = cod_Barras;
    }

    public void dados (String nome, double preco){
        this.nome = nome;
        this.preco = preco;
    }


    public String mostrarDetalhesDoItem(){
        return "\nCodigo de Barra: " + this.cod_Barras
                +  "\nNome: " + this.nome +
                "\nPreco: " + this.preco;
    }


    public int GetCod_Barras(){
        return this.cod_Barras;
    }
}
