/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cajerocel.controlador;

import cajerocel.modelo.Cuenta;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Query;

/**
 *
 * @author Administrador
 */
public class Consulta_Cuenta {

    Query consulta;
    List<Cuenta> cuentas = new ArrayList<>();
    public static Cuenta cuenta;

    public List<Cuenta> listarCuentas() {
        consulta = GestorDePersistencia.em.createQuery("SELECT c FROM Cuenta c", Cuenta.class);
        cuentas = consulta.getResultList();
        return cuentas;
    }

    public Cuenta obtenerCuenta(String numCuenta) {
        listarCuentas();
        for (Cuenta c : cuentas) {
            if (c.getNcuenta().equals(numCuenta)) {
                cuenta = c;
                return cuenta;
            } else {
                cuenta = null;
            }
        }
        return cuenta;

    }

    public void actualizar(Cuenta c){
      //  GestorDePersistencia.et.begin();
        GestorDePersistencia.em.merge(c);
        GestorDePersistencia.et.commit();
    }
}
