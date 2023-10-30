
package com.proyectoconstruccion.proyectoconstruccion.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.util.Date;

/**
 *
 * @author Jonathan
 */

@Entity
@Table(name = "Empleado")
public class Empleado {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer codigo;
    private String nombre;
    private String apellidos;
    @Column(unique = true, length = 14)
    private String cedula;
    private Integer edad;
    private String telefono;
    private Date fecha_nacimiento;
    
}
