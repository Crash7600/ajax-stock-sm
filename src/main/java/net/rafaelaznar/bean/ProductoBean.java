/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package net.rafaelaznar.bean;


import java.math.BigDecimal;


/**
 *
 * @author Crash
 */

public class ProductoBean {
    private static final long serialVersionUID = 1L;
    
    private Integer id;
    
    private String codigo;
    
    
    private String descripcion;
    
    
    private BigDecimal precio;
    
    private Integer idTipoproducto;

    public ProductoBean() {
    }

    public ProductoBean(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public BigDecimal getPrecio() {
        return precio;
    }

    public void setPrecio(BigDecimal precio) {
        this.precio = precio;
    }

    public Integer getIdTipoproducto() {
        return idTipoproducto;
    }

    public void setIdTipoproducto(Integer idTipoproducto) {
        this.idTipoproducto = idTipoproducto;
    }

    
    
}
