package System.WL.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Produto {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nome;
    private Double precoUnitario;
    private Double precoTOtal;
    private Integer quantidade;

    public Produto(String nome, Double precoUnitario, Double precoTOtal, Integer quantidade) {
        this.nome = nome;
        this.precoUnitario = precoUnitario;
        this.precoTOtal = precoTOtal;
        this.quantidade = quantidade;
    }

    public Produto() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getPrecoUnitario() {
        return precoUnitario;
    }

    public void setPrecoUnitario(Double precoUnitario) {
        this.precoUnitario = precoUnitario;
    }

    public Double getPrecoTOtal() {
        return precoTOtal;
    }

    public void setPrecoTOtal(Double precoTOtal) {
        this.precoTOtal = precoTOtal;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }
}

