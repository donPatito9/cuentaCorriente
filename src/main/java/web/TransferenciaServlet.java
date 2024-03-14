package web;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bean.Transaccion;
import dao.UsuarioDao;

/**
 * Servlet implementation class TransferenciaServlet
 */
public class TransferenciaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public TransferenciaServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		UsuarioDao loginDao = new UsuarioDao();
		//String res = tf.getAllTransaccionesByRut(request.getParameter("nombreUsuario")).toString();
		Transaccion tf = new Transaccion();
		tf.setRutCliente(request.getParameter("rutCliente"));
		tf.setIdCuenta(request.getParameter("idCuenta"));
		tf.setMontoTransferencia(request.getParameter("montoTransferencia"));
		tf.setCuentaTransferencia(request.getParameter("cuentaTransferencia"));
		tf.setTipoCuenta(request.getParameter("tipoCuenta"));
		tf.setTipoBanco(request.getParameter("tipoBanco"));
		//tf.setUsuario(request.getParameter("nombreUsuario"));
		loginDao.insertarTransaccion(tf);
		doGet(request, response);
		
		response.sendRedirect("success.jsp");
				
		}

}
