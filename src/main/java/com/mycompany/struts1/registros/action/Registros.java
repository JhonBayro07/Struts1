/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.struts1.registros.action;

import com.mycompany.struts1.model.Usuario;
import com.opensymphony.xwork2.ActionSupport;

/**
 *
 * @author FLHORIAN
 */
public class Registros extends ActionSupport {
    
    private static final long serialVersionUID = 1L;
    
    private Usuario usuarioBean;


    public String execute() throws Exception {
        //call Service class to store personBean's state in database
        
        return SUCCESS;
    }

  
    public Usuario getUsuarioBean() {
        return usuarioBean;
    }
    
    public void setUsuarioBean(Usuario usuario) {
        usuarioBean = usuario;
    }

}