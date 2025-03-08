/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MariaLeon.base;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author Maria liz
 */
public class DocumentoIdentidad {
    private String numero;
    private String tipo;
    private Date fechaExpedicion;
    private String lugarExpedicion;
    private String tipoSangre;
    private static Set<String> numerosDocumentosRegistrados = new HashSet<>();

    public static boolean esNumeroDocumentoUnico(String numero) {
        return numerosDocumentosRegistrados.add(numero);
    }

    public DocumentoIdentidad(String numero, String tipo, Date fechaExpedicion, String lugarExpedicion, String tipoSangre) {
        this.numero = numero;
        this.tipo = tipo;
        this.fechaExpedicion = fechaExpedicion;
        this.lugarExpedicion = lugarExpedicion;
        this.tipoSangre = tipoSangre;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Date getFechaExpedicion() {
        return fechaExpedicion;
    }

    public void setFechaExpedicion(Date fechaExpedicion) {
        this.fechaExpedicion = fechaExpedicion;
    }

    public String getLugarExpedicion() {
        return lugarExpedicion;
    }

    public void setLugarExpedicion(String lugarExpedicion) {
        this.lugarExpedicion = lugarExpedicion;
    }

    public String getTipoSangre() {
        return tipoSangre;
    }

    public void setTipoSangre(String tipoSangre) {
        this.tipoSangre = tipoSangre;
    }
    
}
