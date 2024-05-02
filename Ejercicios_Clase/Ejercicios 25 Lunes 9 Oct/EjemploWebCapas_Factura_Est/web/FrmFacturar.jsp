<%-- 
    Document   : FrmFacturar
    Created on : 09-oct-2023, 21:48:44
    Author     : marie
--%>


<%@page import="java.util.Date"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="Entidades.*"%>
<%@page import="java.util.List"%>
<%@page import="LogicaNegocio.*"%>

<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8" />
        <meta name="viewport" content="width=device-width, initial-scale=1.0" />
        <title>Facturación</title>
        <link href="lib/bootstrap-datepicker/css/bootstrap-datepicker3.standalone.min.css" rel="stylesheet" type="text/css"/>
        <link href="lib/bootstrap/dist/css/bootstrap.min.css" rel="stylesheet" type="text/css"/>
        <link href="lib/fontawesome-free-5.14.0-web/css/all.min.css" rel="stylesheet" type="text/css"/>
        
    </head>
    
    <body>
        <header>
            <nav class="navbar navbar-expand-sm navbar-toggleable-sm navbar-light bg-white border-bottom box-shadow mb-3">
                <div class="container">
                    <a class="navbar-brand" href="index.html">Sistema Facturación <i class="fas fa-tasks"></i></a>
                    <button class="navbar-toggler" type="button" data-toggle="collapse" data-target=".navbar-collapse"
                        aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
                        <span class="navbar-toggler-icon"></span>
                    </button>
                    <div class="navbar-collapse collapse d-sm-inline-flex flex-sm-row-reverse">
                        <ul class="navbar-nav flex-grow-1">
                            <li class="nav-item">
                                <a class="nav-link text-dark" href="index.html">Inicio</a>
                            </li>
                            <li class="nav-item">
                                <a class="nav-link text-dark" href="Frm_ListarProductos.jsp">Productos</a>
                            </li>
                            <li class="nav-item">
                                <a class="nav-link text-dark" href="FrmListarClientes.jsp">Clientes</a>
                            </li>
                            <li class="nav-item">
                                <a class="nav-link text-dark" href="FrmListarFacturas.jsp">Facturación</a>
                            </li>
                        </ul>
                    </div>
                </div>
            </nav>
        </header>
        
        <div class="container">  <!-- container y card-header son clases de BOOTSTRAP -->

            <div class="row"> 
                <div class="col-10"><h1>Facturación</h1></div>
            </div> <!-- fin del row--> 
            
            <%
            int numFactura =-1;
            double total = 0;
            Factura EntidadFactura;
            BL_Factura logicaFactura = new BL_Factura();
            BL_Detalle logicaDetalle = new BL_Detalle();
            List<DetalleFactura> DatosDetalle = null;
            if (request.getParameter("txtnumFactura") != null && Integer.parseInt(request.getParameter("txtnumFactura")) != -1){
                numFactura = Integer.parseInt(request.getParameter("txtnumFactura"));
                EntidadFactura = logicaFactura.ObtenerRegistro("Num_Factura=" + numFactura);
                DatosDetalle = logicaDetalle.ListarRegistros("Num_Factura=" + numFactura);
            } else {
                EntidadFactura = new Factura();
                EntidadFactura.setIdFactura(-1);
                Date fecha = new Date();
                java.sql.Date fechasql = new java.sql.Date(fecha.getTime());
                EntidadFactura.setFecha(fechasql);
            }
            %>
            
            <br/>
            
            <form action="FrmListarFacturas.jsp" method="post">
                <div class="form-group float-right">
                    
                    <div class="input-group">
                        <!-- el for de este label lo unico que hace asociar esa etiqueta con el input -->
                        <label for="txtnumFactura" class="form-control" >Num. Factura</label>
                        <input type="text" id="txtnumFactura" name="txtnumFactura" value="<%=EntidadFactura.getIdFactura()%>" readonly class="form-contol"/>
                    </div> <!-- fin input group -->
                    
                    <div class="input-group">
                        <!-- el for de este label lo unico que hace asociar esa etiqueta con el input -->
                        <label for="txtFechaFactura" class="form-control" >Fecha</label>
                        <input type="text" id="txtnFechaFactura" name="txtFechaFactura" readonbly value="<%=EntidadFactura.getFecha()%>" required class="datepicker form-control"/>
                    </div> <!-- fin input group -->
                    
                    </div> <!-- fin form group -->
                    <br><!-- comment -->

                    <div class="form-group">

                    <div class="input-group">
                        <input type="hidden" id="txtIdCliente" name="txtIdCliente" value="<%=EntidadFactura.getIdCliente()%>" readonly="" class="form-control"/>
                        <input type="text" id="txtNombreCliente" name="txtNombreCliente" value="<%=EntidadFactura.getNombreCliente()%>" readonly="" class="form-control"                                    placeholder="Seleccione un cliente" /> &nbsp; &nbsp;
                        <a id="btnBuscar" clas="btn btn-success" data-toggle ="modal" data-target="#buscarCliente"> <i class="fas fa-search"></i></a> 
                    </div>
                </div> <!-- fin form group -->
                <hr><!-- comment -->
                <div clas="form-group"><!-- comment -->
                    
                    <div class="input-group"><!-- comment -->
                        
                        
                    </div> <!-- fin form group -->    
                        
                </div> <!-- fin form group -->
                
                
            </form>
                    
            
    <hr>
            
            
            
            
            
            
            
            
            
            
            
            
            
            <table class="table">
                <thead>
                    <tr>
                        <th style="text-align: left">Num. Factura</th>
                        <th style="text-align: left">Cliente</th>
                        <th style="text-align: left">Fecha</th>
                        <th style="text-align: left">Estado</th>
                        <th style="text-align: left">Opciones</th>
                    </tr>
                </thead>
                
                <tbody>
                    <%
                    String fecha; // la vamos a llenar con lo que traiga la solicitud
                    String condicion = "";
                    if (request.getParameter("txtfecha") != null
                            && !request.getParameter("txtfecha").equals("")) {
                        fecha = request.getParameter("txtfecha");
                        condicion = condicion + "FECHA = '"+ fecha +"'";
                    }
                    BL_Factura logica = new BL_Factura();
                    List<Factura> datos;
                    datos = logica.ListarRegistros(condicion);
                    for (Factura registro : datos) {

                    %>
                    <tr>
                        <%int num = registro.getIdFactura();%>
                        
                        <td><%= num%></td>
                        <td><%= registro.getNombreCliente()%></td> -->
                        <td><%=registro.getFecha()%></td>
                        <td><%=registro.getEstado()%></td>
                        <td>
                            <a href="Frm_Facturar.jsp?txtnumFactura=<%= num%>"><i class="fas fa-cart-plus"></i></a> 
                        </td>
                    </tr>
                    <% } // fin del For %>
                    
                </tbody>
            </table>
            <br>
            <a href="Frm_Facturar.jsp?txtnumFactura=-1" class="btn btn-primary">Nueva Factura</a>
        </div> <!-- class container -->
        
        <script src="lib/jquery/dist/jquery.min.js" type="text/javascript"></script>
        <script src="lib/bootstrap/dist/js/bootstrap.bundle.min.js" type="text/javascript"></script>
        <script src="lib/bootstrap-datepicker/js/bootstrap-datepicker.min.js" type="text/javascript"></script>
        <script src="lib/bootstrap-datepicker/locales/bootstrap-datepicker.es.min.js" type="text/javascript"></script>
    </body> <!-- fin de body -->
    
    <script>
        $('.datepicker.').datepicker({
            format: 'yyyy-mm-dd',
            autoclose: true,
            language: 'es'   
        });
    </script>  
</html>
