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
public class Software implements Serializable {
    
    @Id
    @Basic(optional = false)
    @SequenceGenerator(name = "seq_software", sequenceName = "inventario.seq_software", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "seq_software")
    @Column(name = "id")
    private Long id;
    
    @Column(name = "descricao")
    private String descricao;
    
    @Column(name = "licenca")
    private String licenca;
    
    @ManyToOne
    @JoinColumn(name = "micro", nullable = false)
    private Micro micro;

    public Software() {
    }

    public Long getId() {
        return id;
    }

    public String getDescricao() {
        return descricao;
    }

    public String getLicenca() {
        return licenca;
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

    public void setLicenca(String licenca) {
        this.licenca = licenca;
    }

    public void setMicro(Micro micro) {
        this.micro = micro;
    }
    
    
}
