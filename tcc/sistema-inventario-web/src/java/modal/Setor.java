/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package modal;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;

/**
 *
 * @author Jeferson
 */
@Entity
public class Setor implements Serializable {
    
    @Id
    @Basic(optional=false)
    @SequenceGenerator(name="seq_setor", sequenceName="inventario.seq_setor", allocationSize=1)
    @GeneratedValue(strategy= GenerationType.AUTO, generator="seq_setor")
    @Column(name="id")
    private Long id;
    
    private String descricao;
    
    @OneToMany(mappedBy="setor")   
    private List<Micro> lstMicro;

    public Setor() {
    }

    public Long getId() {
        return id;
    }

    public List<Micro> getLstMicro() {
        return lstMicro;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setLstMicro(List<Micro> lstMicro) {
        this.lstMicro = lstMicro;
    }
    
    public String getDescricao() {
        return descricao;
    }    

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    
    
    
}
