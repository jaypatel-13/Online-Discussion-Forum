

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.tempuri.*;
/**
 * Servlet implementation class PostAnswerServlet
 */
@WebServlet("/PostAnswerServlet")
public class PostAnswerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public PostAnswerServlet() {
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
		String username = (String)request.getSession(false).getAttribute("username");
		int aId =Integer.parseInt(request.getParameter("aId"));
		String statement = request.getParameter("answer");
		int qId =Integer.parseInt(request.getParameter("qId"));
		new IAnswerCrudProxy().postAnswer(aId, statement, qId, username);
		request.getRequestDispatcher("userhome.jsp").forward(request, response);
	}

}
