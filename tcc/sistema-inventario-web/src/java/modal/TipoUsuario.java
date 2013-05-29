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
public class TipoUsuario implements Serializable {
    
    @Id
    @Basic(optional = false)
    @SequenceGenerator(name = "seq_tipoUsuario", sequenceName = "inventario.seq_tipoUsuario", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "seq_tipoUsuario")
    @Column(name = "id")
    private Long id;
    
    private String descricao;
    
    @OneToMany(mappedBy="tipoUsuario")
    private List<Usuario> lstUsuario;

    public TipoUsuario() {
    }

    public Long getId() {
        return id;
    }

    public String getDescricao() {
        return descricao;
    }

    public List<Usuario> getLstUsuario() {
        return lstUsuario;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setLstUsuario(List<Usuario> lstUsuario) {
        this.lstUsuario = lstUsuario;
    }
    
    
}
