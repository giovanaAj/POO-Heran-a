public class TesteProduto{
        public static void main(String[] args) {
            //Criação e instância objeto
            Produto produto = new Produto();

            //Construção objeto produto
            //produto.descricao = "Banana"; OBSOLETO
            produto.setDescricao("Banana");
            //produto.preco = 100.0; OBSOLETO
            produto.setPreco(100.0);
            //produto.taxa = 20.0; OBSOLETO
            produto.setTaxa(20.0);

            //imprimindo dados protudo
            System.out.println("\n\t\t\t -- Produto 1 --\n");
            produto.imprimirProduto();

            //criação e instância produto 2
            Produto outroProduto = new Produto("Chapéu", 300.0, 25.0);

            //impressão do outro produto
            System.out.println("\n\t\t\t -- Outro Produto -- \n");
            outroProduto.imprimirProduto();
        }

            
}