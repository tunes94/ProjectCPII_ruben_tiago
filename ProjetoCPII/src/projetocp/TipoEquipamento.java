package projetocp;

import java.io.Serializable;

public class TipoEquipamento implements Serializable {
    public static int numero;
    private String designacao;
    private int numEquipamentoPorEquipamento; // variavel para estatisticas , for na main/gestao para calcular o numero por designacao??

    public TipoEquipamento(String designacao) {
        numero++;
        this.designacao = designacao;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getDesignacao() {
        return designacao;
    }

    public void setDesignacao(String designacao) {
        this.designacao = designacao;
    }

    @Override
    public String toString() {
        StringBuilder str =new StringBuilder();
        str.append("Tipo de Equipamento:");
        str.append("\n\tDesignação do Tipo de Equipamento: ").append(designacao);
        return str.toString();
    }

}
