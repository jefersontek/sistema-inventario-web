/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package modal;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

/**
 *
 * @author Jeferson
 */
@Entity
public class Processador implements Serializable {

    @Id
    @Basic(optional = false)
    @SequenceGenerator(name = "seq_processador", sequenceName = "inventario.seq_processador", allocationSize = 1)
    @GeneratedValue(generator = "seq_processador", strategy = GenerationType.AUTO)
    private Long id;
    private String descricao;
    private String fabricante;

    public Processador() {
    }

    public Long getId() {
        return id;
    }

    public String getDescricao() {
        return descricao;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }
}
