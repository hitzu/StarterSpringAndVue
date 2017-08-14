/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.consultic.Starter.servicio;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import mx.com.consultic.Starter.StarterApplication;
import mx.com.consultic.Starter.model.Usuario;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author roberto
 */
@RestController
@RequestMapping(value="/rest/usuario")
public class UsuarioServicio {
    
    @RequestMapping(value="/listUsers", method= RequestMethod.GET)
    public List<Usuario> getAllUsers()
    {
        List<Usuario> usuarios = new LinkedList<>();
        usuarios.add(new Usuario(0,"hitzu","nardos","22","24"));
        
        return usuarios;
    }
    
    @RequestMapping(value="/sayHello", method=RequestMethod.GET)
    public String hello()
    {
        return "HOLI";
    }
    
    @RequestMapping(value="/login" , method=RequestMethod.POST)
    public String login(@RequestParam(value = "user", required = true) String user, 
                        @RequestParam(value = "password", required = true) String password)
    {
        return "user: "+ user + " password: " + password;
    }
    
}
