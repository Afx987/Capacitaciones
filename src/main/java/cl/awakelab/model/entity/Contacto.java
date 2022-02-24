package cl.awakelab.model.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Contacto")
public class Contacto {
    @Id
    @Column(name = "idContacto")
    private Long idContacto;
    private String nombres;
    private String apellidos;
    private String empresa;
    private String direccion;
    private String ciudad;
    private String mail;
    private String telefono;

    public Contacto(){

    }

    public Contacto(String nombres, String apellidos, String empresa, String direccion, String ciudad, String mail, String telefono) {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.empresa = empresa;
        this.direccion = direccion;
        this.ciudad = ciudad;
        this.mail = mail;
        this.telefono = telefono;
    }

    public Contacto(Long idContacto, String nombres, String apellidos, String empresa, String direccion, String ciudad, String mail, String telefono) {
        this.idContacto = idContacto;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.empresa = empresa;
        this.direccion = direccion;
        this.ciudad = ciudad;
        this.mail = mail;
        this.telefono = telefono;
    }

    public Long getIdContacto() {
        return idContacto;
    }

    public void setIdContacto(Long idContacto) {
        this.idContacto = idContacto;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "Contacto{" +
                "idContacto=" + idContacto +
                ", nombres='" + nombres + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", empresa='" + empresa + '\'' +
                ", direccion='" + direccion + '\'' +
                ", ciudad='" + ciudad + '\'' +
                ", mail='" + mail + '\'' +
                ", telefono='" + telefono + '\'' +
                '}';
    }


}
