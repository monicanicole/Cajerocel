/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cajerocel.modelo;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Administrador
 */
@Entity
@Table(name = "cuenta")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Cuenta.findAll", query = "SELECT c FROM Cuenta c"),
    @NamedQuery(name = "Cuenta.findByIdCuenta", query = "SELECT c FROM Cuenta c WHERE c.cuentaPK.idCuenta = :idCuenta"),
    @NamedQuery(name = "Cuenta.findByNcuenta", query = "SELECT c FROM Cuenta c WHERE c.ncuenta = :ncuenta"),
    @NamedQuery(name = "Cuenta.findByClave", query = "SELECT c FROM Cuenta c WHERE c.clave = :clave"),
    @NamedQuery(name = "Cuenta.findBySaldo", query = "SELECT c FROM Cuenta c WHERE c.saldo = :saldo"),
    @NamedQuery(name = "Cuenta.findByTipo", query = "SELECT c FROM Cuenta c WHERE c.tipo = :tipo"),
    @NamedQuery(name = "Cuenta.findByUsuarioidUsuario", query = "SELECT c FROM Cuenta c WHERE c.cuentaPK.usuarioidUsuario = :usuarioidUsuario")})
public class Cuenta implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected CuentaPK cuentaPK;
    @Basic(optional = false)
    @Column(name = "ncuenta")
    private String ncuenta;
    @Basic(optional = false)
    @Column(name = "clave")
    private String clave;
    @Basic(optional = false)
    @Column(name = "saldo")
    private double saldo;
    @Basic(optional = false)
    @Column(name = "tipo")
    private String tipo;
    @JoinColumn(name = "Usuario_idUsuario", referencedColumnName = "idUsuario", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Usuario usuario;

    public Cuenta() {
    }

    public Cuenta(CuentaPK cuentaPK) {
        this.cuentaPK = cuentaPK;
    }

    public Cuenta(CuentaPK cuentaPK, String ncuenta, String clave, double saldo, String tipo) {
        this.cuentaPK = cuentaPK;
        this.ncuenta = ncuenta;
        this.clave = clave;
        this.saldo = saldo;
        this.tipo = tipo;
    }

    public Cuenta(int idCuenta, int usuarioidUsuario) {
        this.cuentaPK = new CuentaPK(idCuenta, usuarioidUsuario);
    }

    public CuentaPK getCuentaPK() {
        return cuentaPK;
    }

    public void setCuentaPK(CuentaPK cuentaPK) {
        this.cuentaPK = cuentaPK;
    }

    public String getNcuenta() {
        return ncuenta;
    }

    public void setNcuenta(String ncuenta) {
        this.ncuenta = ncuenta;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (cuentaPK != null ? cuentaPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Cuenta)) {
            return false;
        }
        Cuenta other = (Cuenta) object;
        if ((this.cuentaPK == null && other.cuentaPK != null) || (this.cuentaPK != null && !this.cuentaPK.equals(other.cuentaPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "cajerocel.Cuenta[ cuentaPK=" + cuentaPK + " ]";
    }
    
}
