package modal;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Jeferson
 */
@Entity
public class Disco implements Serializable {

    @Id
    @Basic(optional = false)
    @SequenceGenerator(name = "seq_disco", sequenceName = "inventario.seq_disco", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "seq_disco")
    @Column(name = "id")
    private Long id;
    @Column(name = "descricao")
    private String descricao;
    @Column(name = "capacidade")
    private double capacidade;
    private String serialNumber;
    @ManyToOne
    @JoinColumn(name = "micro", nullable = false)
    private Micro micro;

    public Disco() {
    }

    public Long getId() {
        return id;
    }

    public String getDescricao() {
        return descricao;
    }

    public double getCapacidade() {
        return capacidade;
    }

    public Micro getMicro() {
        return micro;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setCapacidade(double capacidade) {
        this.capacidade = capacidade;
    }

    public void setMicro(Micro micro) {
        this.micro = micro;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }
}
