/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.consultic.Starter.controller;


import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * @author roberto
 */
@org.springframework.web.bind.annotation.RestController
@RequestMapping("/rest")
public class RestController {
    
    private final Log log = LogFactory.getLog(RestController.class);
    
    @GetMapping("/login")
    public ResponseEntity<String> login()
    {
        return new ResponseEntity<String>("ok",HttpStatus.OK);
    }
    
    @PostMapping("/loginParametros")
    public ResponseEntity<Boolean> loginParametros(@RequestParam(value = "user", required = true) String user, 
                        @RequestParam(value = "password", required = true) String password)
    {
        log.info("user: " + user + " password: " + password);
        if(user.equals("hitzu") && password.equals("hitzu"))
            return new ResponseEntity<>(true, HttpStatus.OK);
        return new ResponseEntity<>(false, HttpStatus.OK);
    }
    
    @PostMapping("/loginParametrosB")
    public @ResponseBody String loginParametrosb(@RequestParam(value = "user", required = true) String user, 
                        @RequestParam(value = "password", required = true) String password)
    {
        log.info("user: " + user + " password: " + password);
        String response = "{\",\"firstname\":\"FirstName\",\"lastname\":\"LastName\",\"address\":\"Some Address\",\"age\":\"SomeNo\",\"email\":\"sometext@gmail.com\"}";
        return response;
    }
}
