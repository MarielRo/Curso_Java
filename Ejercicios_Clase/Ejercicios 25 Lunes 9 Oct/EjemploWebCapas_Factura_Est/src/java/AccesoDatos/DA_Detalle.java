
package AccesoDatos;

import Entidades.DetalleFactura;
import Entidades.Factura;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class DA_Detalle {
    
    //"Atributos"
    private String _Mensaje="";
    

    public String getMensaje() {
       return _Mensaje;
    }
    
    //"Constructores"
    public DA_Detalle() {
        _Mensaje="";
    }
    
    public List<DetalleFactura> ListarRegistros(String Condicion) throws Exception{
        ResultSet RS=null;
        DetalleFactura Entidad;
        List<DetalleFactura> lista = new ArrayList<>();
        Connection _Conexion = null;
        try{
            _Conexion=ClaseConexion.getConnection(); 
            Statement ST = _Conexion.createStatement();
            String Sentencia;

            Sentencia = "SELECT NUM_FACTURA,DETALLE_FACTURA.ID_PRODUCTO,DESCRIPCION,CANTIDAD,PRECIO_VENTA FROM DETALLE_FACTURA "
                    + "INNER JOIN PRODUCTOS ON DETALLE_FACTURA.ID_PRODUCTO = PRODUCTOS.ID_PRODUCTO" ;
            if (!Condicion.equals("")) {
                Sentencia = String.format("%s WHERE %s", Sentencia, Condicion);
            }

            RS=ST.executeQuery(Sentencia);
            while(RS.next()){
                Entidad = new DetalleFactura(RS.getInt("NUM_FACTURA"),
                        RS.getInt("ID_PRODUCTO"),
                        RS.getString("DESCRIPCION"), 
                        RS.getInt("CANTIDAD"),
                        RS.getInt("PRECIO_VENTA"));
                lista.add(Entidad);
            }
        }catch(Exception ex){
            throw ex;
        }finally{
            if (_Conexion != null) ClaseConexion.close(_Conexion);
        }
        return lista;
    }
}
