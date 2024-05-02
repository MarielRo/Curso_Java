package LogicaNegocio;

import AccesoDatos.DA_Facturas;
import Entidades.Factura;
import java.util.List;



public class BL_Factura {
    
    private String _Mensaje;

    public String getMensaje() {
        return _Mensaje;
    }
    
    public List<Factura> ListarRegistros(String condicion) throws Exception{
        List<Factura> Datos;
        try{
            DA_Facturas DA = new DA_Facturas();
            Datos = DA.ListarRegistros(condicion);
        }catch (Exception ex){
            Datos=null;
            throw ex;
        }
        return Datos;
    } // fin listar registros
    
    
    public Factura ObtenerRegistro(String condicion) throws Exception{
        Factura Entidad=null;
        try{
            DA_Facturas DA = new DA_Facturas();
            Entidad = DA.ObtenerRegistro(condicion);
        }catch (Exception ex){
            throw ex;
        }
        return Entidad;
    } // fin metodo que retorna una factura
    
}
