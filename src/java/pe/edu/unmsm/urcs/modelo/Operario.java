package pe.edu.unmsm.urcs.modelo;
// Generated 11/07/2015 09:19:57 PM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Operario generated by hbm2java
 */
public class Operario  implements java.io.Serializable {


     private Integer idOperario;
     private Area area;
     private String nombre;
     private String apPaterno;
     private String apMaterno;
     private String telefono;
     private String anexo;
     private String correo;
     private Set<Solicitud> solicituds = new HashSet<Solicitud>(0);

    public Operario() {
    }

	
    public Operario(Area area) {
        this.area = area;
    }
    public Operario(Area area, String nombre, String apPaterno, String apMaterno, String telefono, String anexo, String correo, Set<Solicitud> solicituds) {
       this.area = area;
       this.nombre = nombre;
       this.apPaterno = apPaterno;
       this.apMaterno = apMaterno;
       this.telefono = telefono;
       this.anexo = anexo;
       this.correo = correo;
       this.solicituds = solicituds;
    }
   
    public Integer getIdOperario() {
        return this.idOperario;
    }
    
    public void setIdOperario(Integer idOperario) {
        this.idOperario = idOperario;
    }
    public Area getArea() {
        return this.area;
    }
    
    public void setArea(Area area) {
        this.area = area;
    }
    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApPaterno() {
        return this.apPaterno;
    }
    
    public void setApPaterno(String apPaterno) {
        this.apPaterno = apPaterno;
    }
    public String getApMaterno() {
        return this.apMaterno;
    }
    
    public void setApMaterno(String apMaterno) {
        this.apMaterno = apMaterno;
    }
    public String getTelefono() {
        return this.telefono;
    }
    
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    public String getAnexo() {
        return this.anexo;
    }
    
    public void setAnexo(String anexo) {
        this.anexo = anexo;
    }
    public String getCorreo() {
        return this.correo;
    }
    
    public void setCorreo(String correo) {
        this.correo = correo;
    }
    public Set<Solicitud> getSolicituds() {
        return this.solicituds;
    }
    
    public void setSolicituds(Set<Solicitud> solicituds) {
        this.solicituds = solicituds;
    }




}


