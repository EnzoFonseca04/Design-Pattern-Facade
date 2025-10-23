package br.fastfood.facade;

import br.fastfood.model.*;

public class ComboFacade {
    private Combo combo;


    public boolean criarCombo(int codigo) {
        this.combo = null;
        switch (codigo) {
            case 1:
                ItemCombo masterBurger = new Burger("Big Cheddar", 18.00);
                ItemCombo masterBebida = new Bebida("Coca-Cola", 8.00);
                ItemCombo masterSobremesa = new Sobremesa("Sundae", 9.90);
                this.combo = new Combo(masterBurger, masterBebida, masterSobremesa);
                System.out.println("✅ Combo Master criado (Preço do combo: R$ 35,90)");
                return true;
            case 2:
                ItemCombo superBurger = new Burger("Mega Bacon", 16.00);
                ItemCombo superBebida = new Bebida("Guaraná", 7.50);
                ItemCombo superSobremesa = new Sobremesa("Torta de Maçã", 9.00);
                this.combo = new Combo(superBurger, superBebida, superSobremesa);
                System.out.println("✅ Super Combo criado (Preço do combo: R$ 32,50)");
                return true;
            case 3:
                ItemCombo kidsBurger = new Burger("Mini Burger", 12.00);
                ItemCombo kidsBebida = new Bebida("Suco Laranja", 6.00);
                ItemCombo kidsSobremesa = new Sobremesa("Sorvete", 4.90);
                this.combo = new Combo(kidsBurger, kidsBebida, kidsSobremesa);
                System.out.println("✅ Combo Kids criado (Preço do combo: R$ 22,90)");
                return true;
            default:
                System.out.println("Código de combo inválido!");
                return false;
        }
    }

    public void exibirItens() {
        if (combo == null) {
            System.out.println("Nenhum combo criado ainda!");
            return;
        }

        System.out.println("\n=== Detalhes do Pedido ===");
        System.out.println(this.combo.getBurger());
        System.out.println(this.combo.getBebida());
        System.out.println(this.combo.getSobremesa());
        System.out.println("==========================");
    }

    public double getPrecoTotal() {
        if (this.combo == null) {
            return 0.0;
        }
        return this.combo.getPrecoTotal();
    }
}