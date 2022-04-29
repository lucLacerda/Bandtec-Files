
package com.mycompany.pet;

public class PetShop {
    private String nome;
    private Double valorFaturado;

    public PetShop(String nome, Double valorFaturado) {
        this.nome = nome;
        this.valorFaturado = 0.0;
    }
    
    
    public void darBanho(Pet petInformado, Double valorInformado) {
        valorFaturado += valorInformado;
        
        this.valorFaturado += valorInformado;
        
        petInformado.setQtdVisitas(petInformado.getQtdVisitas() + 1);
        petInformado.setValorGasto(petInformado.getValorGasto() + valorInformado);
    }
    
        public void darBanho(Pet petInformado, Double valorInformado, Integer desconto) {
            this.valorFaturado += valorInformado;
            
            petInformado.setQtdVisitas(petInformado.getQtdVisitas() + 1);
            petInformado.setValorGasto((petInformado.getValorGasto() + valorInformado)/ desconto);
            
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getValorFaturado() {
        return valorFaturado;
    }

    public void setValorFaturado(Double valorFaturado) {
        this.valorFaturado = valorFaturado;
    }

    @Override
    public String toString() {
        return String.format("Relatorio de Vendas: \n"
                + "Nome do PetShop: %s\n"
                + "Valor total Faturado: %.2f\n",
                nome,
                valorFaturado);
    }
    
    
}
