package Ex1_CA;

    public class CD extends Produto{

        private int num_Faixas = 0;

        public CD(int cod_Barras) {
            super(cod_Barras);
        }


        public void dados (String nome, double preco, int num_Faixas){
            super.dados(nome, preco);
            this.num_Faixas = num_Faixas;
        }



        public String mostrarDetalhesDoItem(){
            return super.mostrarDetalhesDoItem() + "\nNúmero de faixas: " + this.num_Faixas;
        }
    }

