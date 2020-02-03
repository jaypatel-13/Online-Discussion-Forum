

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.datacontract.schemas._2004._07.WcfServiceLibrary1.*;
import org.tempuri.IUserCrudProxy;

/**
 * Servlet implementation class UpdateProfileServlet
 */
@WebServlet("/UpdateProfileServlet")
public class UpdateProfileServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdateProfileServlet() {
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
		IUserCrudProxy client = new IUserCrudProxy();
		String username, name, password, email, profession, country;
		String phone =request.getParameter("phone");
		username = request.getSession(false).getAttribute("username").toString();
		name = request.getParameter("name");
		password = request.getParameter("password");
		email = request.getParameter("email");
		profession = request.getParameter("profession");
		country = request.getParameter("country");
		ProfileClass newProfile = new ProfileClass();
		newProfile.setCountry(country);
		newProfile.setUsername(username);
		newProfile.setEmail(email);
		newProfile.setPassword(password);
		newProfile.setPhone(phone);
		newProfile.setProfession(profession);
		newProfile.setName(name);
		client.updateUser(username, newProfile);
		request.getRequestDispatcher("userhome.jsp").forward(request, response);
	}

}
