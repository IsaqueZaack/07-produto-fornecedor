package br.fiap.Util;
import br.fiap.fornecedor.Fornecedor;
import br.fiap.produto.Produto;

import static javax.swing.JOptionPane.*;
import static java.lang.Integer.parseInt;
import static java.lang.Long.parseLong;
import static java.lang.Double.parseDouble;

public class Util {
    private Produto[] produto = new Produto[3];
    private Fornecedor[] fornecedor = new Fornecedor[3];
    private int idxProduto = 0;
    private int idxFornecedor = 0;

    // método para exigir o menu de opções
    public void menu() {
        int opcao;
        String msg = "1. Cadastrar produto\n2. Pesquisar produto " +
                "por nome\n3. Pesquisar fornecedor por CNPJ\n4. Finalizar";

        while(true) {
            opcao = parseInt(showInputDialog(msg));
            if(opcao == 4) {
                return;
            }
            switch (opcao) {
                case 1:
                    cadastrarProduto();
                    break;
                case 2:
                    pesquisarProduto();
                    break;
                case 3:
                    pesquisarFornecedor();
                    break;
                default:
                    showMessageDialog(null, "Opção inválida");
            }
        }

    }

    private void cadastrarProduto() {
        // produto[idxProduto] = showInputDialog("Informe o produto");
    }

    private void pesquisarProduto() {

    }

    private Fornecedor pesquisarFornecedor() {
        long cnpj = parseLong(showInputDialog("CNPJ do fornecedor"));
        for(int i = 0; i < idxFornecedor; i++) {
            if (fornecedor[i].getCnpj() == cnpj) {
                return fornecedor[i];
            }
        }
        showMessageDialog(null, "CNPJ: " + cnpj + " não cadastrado");
        return null;
    }
}
