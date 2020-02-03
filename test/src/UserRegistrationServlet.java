

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.tempuri.IUserCrudProxy;

/**
 * Servlet implementation class UserRegistrationServlet
 */
@WebServlet("/UserRegistrationServlet")
public class UserRegistrationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public UserRegistrationServlet() {
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
		IUserCrudProxy client = new IUserCrudProxy();
		String username, name, password, email, profession, country;
		String phone =request.getParameter("phone");
		username = request.getParameter("username");
		name = request.getParameter("name");
		password = request.getParameter("password");
		email = request.getParameter("email");
		profession = request.getParameter("profession");
		country = request.getParameter("country");
		boolean status = client.register(username, password, name, email, country, profession, phone);
		if(status)
		{
			HttpSession session = request.getSession();
			session.setAttribute("username", username);
			request.getRequestDispatcher("userhome.jsp").forward(request, response);
		}
		else
		{
			request.getRequestDispatcher("registration.jsp").forward(request, response);
		}
		
	}
	

}
