
package AccesoDatos;

import Entidades.Factura;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class DA_Facturas {
    //"Atributos"
    private String _Mensaje="";
    

    public String getMensaje() {
       return _Mensaje;
    }
    
    //"Constructores"
    public DA_Facturas() {
        _Mensaje="";
    }
    
    public List<Factura> ListarRegistros(String Condicion) throws Exception{
        ResultSet RS=null;
        Factura Entidad;
        List<Factura> listaF = new ArrayList<>();
        Connection _Conexion = null;
        try{
            _Conexion=ClaseConexion.getConnection(); 
            Statement ST = _Conexion.createStatement();
            String Sentencia;

            Sentencia = "SELECT NUM_FACTURA, F.ID_CLIENTE,NOMBRE,FECHA,ESTADO FROM Factura F INNER JOIN CLIENTES ON CLIENTES.ID_CLIENTE=F.ID_CLIENTE" ;
            if (!Condicion.equals("")) {
                Sentencia = String.format("%s WHERE %s", Sentencia, Condicion);
            }

            RS=ST.executeQuery(Sentencia);
            while(RS.next()){
                Entidad = new Factura(RS.getInt("NUM_FACTURA"),
                        RS.getInt("Id_Cliente"),
                        RS.getString("Nombre"), 
                        RS.getDate("Fecha"),
                        RS.getString("Estado"));
                listaF.add(Entidad);
            }
        }catch(Exception ex){
            throw ex;
        }finally{
            if (_Conexion != null) ClaseConexion.close(_Conexion);
        }
        return listaF;
    }
    
    public Factura ObtenerRegistro(String condicion) throws SQLException, Exception {
            ResultSet RsDatos=null;
            Factura Entidad =new Factura();
            String sentencia;
            Connection _Conexion = null;
            sentencia = "SELECT NUM_FACTURA, F.ID_CLIENTE,NOMBRE,FECHA,ESTADO FROM Factura F INNER JOIN CLIENTES ON CLIENTES.ID_CLIENTE=F.ID_CLIENTE";

            if (!condicion.equals("")) {
                sentencia = String.format("%s WHERE %s", sentencia, condicion);
            }

            try{
                _Conexion=ClaseConexion.getConnection();
                Statement ST = _Conexion.createStatement();
                RsDatos = ST.executeQuery(sentencia);
                if(RsDatos.next()){
                    Entidad.setIdFactura(RsDatos.getInt("NUM_FACTURA"));
                    Entidad.setIdCliente(RsDatos.getInt("Id_cliente"));
                    Entidad.setNombreCliente(RsDatos.getString("Nombre"));
                    Entidad.setFecha(RsDatos.getDate("Fecha"));
                    Entidad.setEstado(RsDatos.getString("Estado"));
                    Entidad.setExisteRegistro(false);
                }else{
                   Entidad.setExisteRegistro(false); 
                }
                   
            }catch(Exception ex){
                throw ex;
            }finally{
                if (_Conexion != null) ClaseConexion.close(_Conexion);
            }
            return Entidad;
        }

}
