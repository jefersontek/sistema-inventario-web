package modal;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
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
public class Micro implements Serializable {

    @Id
    @Basic(optional = false)
    @SequenceGenerator(name = "seq_micro", sequenceName = "inventario.seq_micro", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "seq_micro")
    @Column(name = "id")
    private Long id;
    @Column(name = "nome", unique = true)
    private String nome;
    @Column(name = "patrimonio", unique = true)
    private String patrimonio;
    @Column(name = "usuario", unique = true)
    private String usuario;
    @ManyToOne
    @JoinColumn(name = "setor")
    @Basic(optional=true)
    private Setor setor;
    @ManyToOne
    @JoinColumn(name = "placaMae")
    private PlacaMae placaMae;
    @ManyToOne
    @JoinColumn(name = "processador")
    private Processador processador;
    @OneToMany(mappedBy = "micro")
    private List<Inventario> lstInventario;
    @OneToMany(mappedBy = "micro")
    private List<Memoria> lstMemoria;
    @OneToMany(mappedBy = "micro")
    private List<Disco> lstDisco;
    @OneToMany(mappedBy = "micro")
    private List<Software> lstSoftware;
    @OneToMany(mappedBy = "micro")
    private List<Rede> lstRede;

    public Micro() {
    }

    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getPatrimonio() {
        return patrimonio;
    }

    public String getUsuario() {
        return usuario;
    }

    public List<Inventario> getLstInventario() {
        return lstInventario;
    }

    public List<Memoria> getLstMemoria() {
        return lstMemoria;
    }

    public List<Disco> getLstDisco() {
        return lstDisco;
    }

    public List<Software> getLstSoftware() {
        return lstSoftware;
    }

    public List<Rede> getLstRede() {
        return lstRede;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPatrimonio(String patrimonio) {
        this.patrimonio = patrimonio;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public void setLstInventario(List<Inventario> lstInventario) {
        this.lstInventario = lstInventario;
    }

    public void setLstMemoria(List<Memoria> lstMemoria) {
        this.lstMemoria = lstMemoria;
    }

    public void setLstDisco(List<Disco> lstDisco) {
        this.lstDisco = lstDisco;
    }

    public void setLstSoftware(List<Software> lstSoftware) {
        this.lstSoftware = lstSoftware;
    }

    public void setLstRede(List<Rede> lstRede) {
        this.lstRede = lstRede;
    }

    public Setor getSetor() {
        return setor;
    }

    public void setSetor(Setor setor) {
        this.setor = setor;
    }

    public PlacaMae getPlacaMae() {
        return placaMae;
    }

    public void setPlacaMae(PlacaMae placaMae) {
        this.placaMae = placaMae;
    }

    public Processador getProcessador() {
        return processador;
    }

    public void setProcessador(Processador processador) {
        this.processador = processador;
    }
}
