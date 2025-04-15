public class TesteProdutoImportado {
    public static void main(String[] args) {
        //criação de instância produto importado
        ProdutoImportado produtoImportado = new ProdutoImportado(); 

        //construção objeto
        produtoImportado.setDescricao("café"); 
        produtoImportado.setPreco(500.0);
        produtoImportado.setTaxa(20.0);
        //produtoImportado.origem = "Colômbia"; OBSOLETO
        produtoImportado.setOrigem("Colômbia");
        //produtoImportado.aliquota = 60.0; OBSOLETO
        produtoImportado.setAliquota(60.0);

        //imprimindo produtoImportado
        System.out.println("\n\t\t\t -- Produto Importado --\n");
        produtoImportado.imprimirProdutoImportado(); 

        //Criação e instância de outro produto importado
        ProdutoImportado outroProdutoImportado = new ProdutoImportado("Sabão", 30.0, 20.0, "Jalapão", 100.0);

        //imprimir outro produto importado
        System.out.println("\n\t\t\t -- Outro Produto Importado\n--");
        outroProdutoImportado.imprimirProduto();
    }
}
