/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package modal;

import br.com.caelum.vraptor.ioc.Component;
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
/**
 *
 * @author Jeferson
 */
@Entity
@Component
public class Usuario{
    
    @Id
    @Basic(optional = false)
    @SequenceGenerator(name = "seq_usuario", sequenceName = "inventario.seq_usuario", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "seq_usuario")
    @Column(name = "id")
    private Long id;
    
    private String nome;
    
    private String email;
    
    private String senha;
    
    @ManyToOne
    @JoinColumn(name = "tipoUsuario", nullable = false)
    private TipoUsuario tipoUsuario; 

    public Usuario() {
    }

    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public String getSenha() {
        return senha;
    }

    public TipoUsuario getTipoUsuario() {
        return tipoUsuario;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public void setTipoUsuario(TipoUsuario tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
    }
      
}
