<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
  <head>
    <meta charset="utf-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1" />
    <title>Transferencia Bancaria</title>
	<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css">
  </head>
  <body>
  <nav class="navbar navbar-dark bg-dark">
<a style="color:gold"class="navbar-toggler"><span class="navbar-toggler-icon"></span>Banco Platinum</a>
<div class="dropdown">
<a style="color:gold"href="#"class="nav-link dropdown-toggle" data-toggle="dropdown">Cerrar Sesion</a>
  <div class="dropdown-menu text-center">
  <a><img src="img/user.jpg" height="80px" width="80px"></a><br>
    <p>Usuario:</p>
    <p>user</p>
    <div class="dropdown-divider"></div>   
    <a href="index.jsp"class="dropdown-item">Regresar</a>
  </div>
</div>
</nav><br>
  <div class="container col-lg-4">
  <form action="TransferenciaServlet" method="post">
  <div class="form-group"> 
  <h4 style="text-align:center"><strong>Automatización de Pruebas</strong></h4>
  </div>
  <div class="form-group"> 
  <h5 style="text-align:center"><strong>Banco Platinum</strong></h5>
  </div>
  <div class="form-group">
  <label>Rut Cliente:</label>
  <input class="form-control" type="text" id="rutCliente" name="rutCliente" placeholder="Ingrese Rut Cliente">
  </div>
   <div class="form-group">
  <label>Numero Cuenta:</label>
  <input class="form-control" type="text" id="idCuenta" name="idCuenta" placeholder="Ingrese Numero de cuenta">
  </div>
  <div class="form-group">
  <label>Monto Transferencia:</label>
  <input class="form-control" type="text" id="montoTransferencia" name="montoTransferencia" placeholder="Ingrese Monto transferencia">
  </div>
   <div class="form-group">
  <label>Cuenta Transferencia:</label>
  <input class="form-control" type="text" id="cuentaTransferencia" name="cuentaTransferencia" placeholder="Ingrese Cuenta transferencia">
  </div>
   <div class="form-group">
    <label class="label">Tipo de Cuenta</label>
    <div class="form-control form-control-lg">
     <div class="select">
       <select name="tipoCuenta">
           <option value="cuenta_corriente">Corriente</option>
              <option value="cuenta_vista">Cuenta Vista</option>
                  <option value="cuenta_vista">Cuenta de Ahorro</option>
                  </select>
             </div>
         </div>
   </div> <div></div>
   <div class="container box">
   </div>
   <div class="form-group">
   <label class="label">Seleccione Banco</label>
   <div class="form-control form-control-lg">
   <div class="select">
    <select name="tipoBanco">
        <option value="banco_estado">Banco Estado</option>
          <option value="banco_santander">Banco Santander</option>
           <option value="banco_chile">Banco Chile</option>
            <option value="banco_bci">Banco BCI</option>
         </select>
     </div>
       </div>
          </div><br>
     <input class="btn btn-success btn-block" type="submit" id="accion"name="accion" value="Realizar Transferencia">
    </form>
   </div>       
   <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js"></script>
   <script src="https://cdn.jsdelivr.net/npm/popper.js@1.12.9/dist/umd/popper.min.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/js/bootstrap.min.js"></script>
  </body>
</html>
