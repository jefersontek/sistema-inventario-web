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
public class PlacaMae implements Serializable {

    @Id
    @Basic(optional = true)
    @SequenceGenerator(name = "seq_placaMae", sequenceName = "inventario.seq_placaMae", allocationSize = 1)
    @GeneratedValue(generator = "seq_placaMae", strategy = GenerationType.AUTO)
    private Long id;
    private String descricao;
    private String fabricante;
    private String serialNumber;
    

    public PlacaMae() {
    }

    public Long getId() {
        return id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }
    
}
