package br.fastfood.facade;

import br.fastfood.model.*;

public class ComboFacade {
    private Combo combo;

    /**
     * Cria um combo baseado no código fornecido
     * @param codigo número do combo (1, 2 ou 3)
     */
    public void criarCombo(int codigo) {
        switch (codigo) {
            case 1:
                // TODO: Criar Combo Master
                // Big Cheddar (R$ 18.00) + Coca-Cola (R$ 8.00) + Sundae (R$ 9.90)
                break;
            case 2:
                // TODO: Criar Super Combo
                // Mega Bacon (R$ 16.00) + Guaraná (R$ 7.50) + Torta de Maçã (R$ 9.00)
                break;
            case 3:
                // TODO: Criar Combo Kids
                // Mini Burger (R$ 12.00) + Suco Laranja (R$ 6.00) + Sorvete (R$ 4.90)
                break;
            default:
                System.out.println("Código de combo inválido!");
                break;
        }
    }

    /**
     * Exibe todos os itens do combo
     */
    public void exibirItens() {
        if (combo == null) {
            System.out.println("Nenhum combo criado ainda!");
            return;
        }

        System.out.println("\n=== Detalhes do Pedido ===");
        // TODO: Exibir burger
        // TODO: Exibir bebida
        // TODO: Exibir sobremesa
        System.out.println("==========================");
    }

    /**
     * Retorna o preço total do combo
     * @return preço total
     */
    public double getPrecoTotal() {
        // TODO: Retornar o preço total do combo
        // Dica: use combo.getPrecoTotal()
        return 0.0; // SUBSTITUIR
    }
}