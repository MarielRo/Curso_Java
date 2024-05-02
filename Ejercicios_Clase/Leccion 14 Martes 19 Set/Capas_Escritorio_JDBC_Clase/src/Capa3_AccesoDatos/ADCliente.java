// Mariel Rojas
package Capa3_AccesoDatos;

import java.sql.Connection;
import java.sql.DriverManager;
import Config.Config;
import java.sql.PreparedStatement;
import java.sql.Statement;
import Capa_Entidades.Cliente;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ADCliente {
    // Atributos
    private Connection _cnn;
    private String _mensaje;
    
    
    
    // Constructor
    public ADCliente()throws Exception{
        try {
            String url = Config.getConnectionString();
            _cnn = DriverManager.getConnection(url);
            _mensaje = "";
            
        } catch (Exception e) {
            throw e;
        }
    }
    
    
    
    // getter /
    public String getMensaje(){
        return _mensaje;
    }

    //////////METODOS /////////////
    // Metodos para unsertat un cliente
    public int Insertar(Cliente cliente) throws Exception{
        int id_cliente = -1;
        String sentencia = "Insert into Clientes(nombre,telefono,direccion) values(?,?,?)";
        try {
            PreparedStatement ps = _cnn.prepareStatement(sentencia,Statement.RETURN_GENERATED_KEYS);
            ps.setString(1,cliente.getNombre());
            ps.setString(2,cliente.getTelefono());
            ps.setString(3,cliente.getDireccion());
            ps.execute();
            ResultSet rs = ps.getGeneratedKeys();
            if(rs !=null && rs.next()){
                id_cliente = rs.getInt(1);
                _mensaje = "Cliente ingresado satisfactoriamente";
            }
        } catch (Exception e) {
            throw e;
        }
        finally{
            _cnn=null;
        }
        return id_cliente;
    }
    
    public ResultSet ListarRegistros(String condicion, String orden)throws SQLException{
         ResultSet rs=null;
        try {
            Statement stm = _cnn.createStatement();
            String sentencia= "Select id_cliente,nombre,telefono,direccion from clientes";
            if(!condicion.equals("")){
                sentencia = String.format("%s where %s", sentencia, condicion);  
            }
            if(!orden.equals("")){
                sentencia = String.format("%s order by %s", sentencia, orden);  
            }
            rs= stm.executeQuery(sentencia);

        } catch (Exception e) {
            throw e;
        }
        finally{
            _cnn= null;
        }
        return rs;
    }
    
    public List<Capa_Entidades.Cliente> ListarRegistros(String condicion)throws SQLException{
        ResultSet rs=null;
        List<Capa_Entidades.Cliente> lista = new ArrayList();
        try {
            Statement stm = _cnn.createStatement();
            String sentencia= "Select id_cliente,nombre,telefono,direccion from clientes";
            if(!condicion.equals("")){
                sentencia = String.format("%s where %s", sentencia, condicion);  
            }
            rs= stm.executeQuery(sentencia);
            while(rs.next()){
                lista.add(new Capa_Entidades.Cliente(rs.getInt("id_cliente"),rs.getString("nombre"),
                rs.getString("direccion"),rs.getString("telefono")));
            }
            
        } catch (Exception e) {
            throw e;
        }
        finally{
            _cnn= null;
        }
        return lista;
    }   
    
    // metodo para obtener un registro en la capa de acceso a datos
    public Cliente ObtenerRegisto(String condicion)throws SQLException{
        Cliente cliente = new Cliente();
        ResultSet rs = null;
        try {
            Statement stm = _cnn.createStatement();
            String sentencia= "Select id_cliente,nombre,telefono,direccion from clientes";
            if(!condicion.equals("")){
                sentencia = String.format("%s where %s", sentencia, condicion);  
            }
            rs= stm.executeQuery(sentencia);
            if(rs.next()){
                cliente.setId_cliente(rs.getInt(1));
                cliente.setNombre(rs.getString(2));
                cliente.setTelefono(rs.getString(3));
                cliente.setDireccion(rs.getString(4));
                cliente.setExiste(true);
            }

        } catch (Exception e) {
            throw e;
        }
        finally{
            _cnn= null;
        }
        return cliente;
    }
    
    
    public int Modificar(Cliente cliente) throws Exception{
        int resultado = 0;
        String sentencia = "update Clientes set nombre=?,telefono=?,direccion=? where id_cliente=?";
        try {
            PreparedStatement ps = _cnn.prepareStatement(sentencia);
            ps.setString(1,cliente.getNombre());
            ps.setString(2,cliente.getTelefono());
            ps.setString(3,cliente.getDireccion());
            ps.setInt(4,cliente.getId_cliente());
            resultado = ps.executeUpdate();
            if(resultado > 0){
                _mensaje = "Registro modificado satisfactoriamente";
            }
        } catch (Exception e) {
            throw e;
        }
        finally{
            _cnn=null;
        }
        return resultado;
    
    
    }

    public int Eliminar(Cliente cliente) throws Exception{
        int resultado = 0;
        String sentencia = "delete Clientes where id_cliente=?";
        try {
            PreparedStatement ps = _cnn.prepareStatement(sentencia);
            ps.setInt(1, cliente.getId_cliente());
            resultado = ps.executeUpdate();
            if(resultado > 0){
                _mensaje = "Registro eliminadoo satisfactoriamente";
            }
        } catch (Exception ex) {
            throw ex;
        }
        finally{
            _cnn=null;
        }
        return resultado;
    
    
    }

        
   
    
    
   
}
