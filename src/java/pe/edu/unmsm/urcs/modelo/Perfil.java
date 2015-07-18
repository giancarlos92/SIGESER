package pe.edu.unmsm.urcs.modelo;
// Generated 11/07/2015 09:19:57 PM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Perfil generated by hbm2java
 */
public class Perfil  implements java.io.Serializable {


     private Integer idPerfil;
     private String descripcion;
     private Set<Usuario> usuarios = new HashSet<Usuario>(0);
     private Set<Opcion> opcions = new HashSet<Opcion>(0);

    public Perfil() {
    }

    public Perfil(String descripcion, Set<Usuario> usuarios, Set<Opcion> opcions) {
       this.descripcion = descripcion;
       this.usuarios = usuarios;
       this.opcions = opcions;
    }
   
    public Integer getIdPerfil() {
        return this.idPerfil;
    }
    
    public void setIdPerfil(Integer idPerfil) {
        this.idPerfil = idPerfil;
    }
    public String getDescripcion() {
        return this.descripcion;
    }
    
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public Set<Usuario> getUsuarios() {
        return this.usuarios;
    }
    
    public void setUsuarios(Set<Usuario> usuarios) {
        this.usuarios = usuarios;
    }
    public Set<Opcion> getOpcions() {
        return this.opcions;
    }
    
    public void setOpcions(Set<Opcion> opcions) {
        this.opcions = opcions;
    }




}


