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
public class Rede implements Serializable {
    
    @Id
    @Basic(optional = false)
    @SequenceGenerator(name = "seq_rede", sequenceName = "inventario.seq_rede", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "seq_rede")
    @Column(name = "id")
    private Long id;
    
    @Column(name = "descricao")
    private String descricao;
    
    @Column(name = "mac_address")
    private String mac_address;
    
    @Column(name = "ip")
    private String ip;
    
    @ManyToOne
    @JoinColumn(name = "micro", nullable = false)
    private Micro micro;

    public Rede() {
    }

    public Long getId() {
        return id;
    }

    public String getDescricao() {
        return descricao;
    }

    public String getMac_address() {
        return mac_address;
    }

    public String getIp() {
        return ip;
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

    public void setMac_address(String mac_address) {
        this.mac_address = mac_address;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public void setMicro(Micro micro) {
        this.micro = micro;
    }
 
    
}
