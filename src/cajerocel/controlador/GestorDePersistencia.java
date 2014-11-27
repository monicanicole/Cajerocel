/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cajerocel.controlador;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

/**
 *
 * @author Administrador
 */
public class GestorDePersistencia {
     public static final EntityManagerFactory emf = Persistence.createEntityManagerFactory("CajeroCelPU");
    public static final EntityManager em = emf.createEntityManager();
    public static final EntityTransaction et = em.getTransaction();
    
}
