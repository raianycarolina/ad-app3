package service;

import model.Vinil;

public class Estoque {

    public void verificarEstoque(Vinil vinil) {

        if (vinil.getQuantidade() <= 0) {
            System.out.println("O vinil \"" + vinil.getNome() + "\" está ESGOTADO");
        } else if (vinil.getQuantidade() > 0) {
            System.out.println("O vinil \"" + vinil.getNome() + "\" está DISPONÍVEL");
        }

    }
}