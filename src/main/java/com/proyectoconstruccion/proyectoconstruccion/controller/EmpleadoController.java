
package com.proyectoconstruccion.proyectoconstruccion.controller;

import com.proyectoconstruccion.proyectoconstruccion.entity.Empleado;
import com.proyectoconstruccion.proyectoconstruccion.service.EmpleadoService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Jonathan
 */

@RestController
@RequestMapping("/empleados")
public class EmpleadoController {
    
    @Autowired
    private EmpleadoService empleadoservice;
    
    @GetMapping
    public List<Empleado> listar(){
        return empleadoservice.listar();  
    }
}
