/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LogicaNegocio;

import AccesoDatos.DA_Detalle;
import Entidades.DetalleFactura;
import java.util.List;

/**
 *
 * @author marie
 */
public class BL_Detalle {
    private String _Mensaje;

    public String getMensaje() {
        return _Mensaje;
    }
    
    public List<DetalleFactura> ListarRegistros(String condicion) throws Exception{
        List<DetalleFactura> Datos;
        DA_Detalle AccesoDatos;
        try{
            AccesoDatos = new DA_Detalle();
            Datos = AccesoDatos.ListarRegistros(condicion);
        }catch (Exception ex){
            Datos=null;
            throw ex;
        }
        return Datos;
    } // fin listar registros
    
}
