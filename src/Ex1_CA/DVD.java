package Ex1_CA;

    public class DVD extends Produto{
        private String duracao;
        public DVD(int cod_Barras) {
            super(cod_Barras);
        }

        public void dados (String nome, double preco, String duracao){
            super.dados(nome, preco);
            this.duracao = duracao;
        }


        public String  mostrarDetalhesDoItem(){
            return super.mostrarDetalhesDoItem() + "\nDuração: " + this.duracao;
        }

    }

