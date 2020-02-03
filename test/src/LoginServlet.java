

import java.io.IOException;
import org.tempuri.IUserCrudProxy;
import javax.servlet.http.*;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
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

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		IUserCrudProxy client = new IUserCrudProxy();
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		boolean status = client.login(username, password);
		if(status)
		{
			HttpSession session = request.getSession();
			session.setAttribute("username", username); 
			request.getRequestDispatcher("userhome.jsp").forward(request, response);
			
		}
		else
		{
			request.getRequestDispatcher("login.jsp").forward(request, response);
		}
	}

}
