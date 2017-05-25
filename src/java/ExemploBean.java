/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 *
 * @author tiago.lucas
 */
@ManagedBean
@RequestScoped
public class ExemploBean {
private String texto;

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }
    public void caixaAlta(){
        this.texto = this.texto.toUpperCase();
    }

    /**
     * Creates a new instance of ExemploBean
     */
    public ExemploBean() {
    }
    
}
