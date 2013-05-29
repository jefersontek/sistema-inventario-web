package modal;


import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Temporal;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jeferson
 */
@Entity
public class Inventario implements Serializable {
    
    @Id
    @Basic(optional = false)
    @SequenceGenerator(name = "seq_inventario", sequenceName = "inventario.seq_inventario", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "seq_inventario")
    @Column(name = "id")
    private Long id;
    
    @Column(name="data")
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date data;
    
    @ManyToOne
    @JoinColumn(name = "micro", nullable = false)
    private Micro micro;

    public Inventario() {
    }

    public Long getId() {
        return id;
    }

    public Date getData() {
        return data;
    }

    public Micro getMicro() {
        return micro;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public void setMicro(Micro micro) {
        this.micro = micro;
    }
    
    
}
