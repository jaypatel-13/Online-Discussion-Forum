

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.tempuri.*;

/**
 * Servlet implementation class PostQuestionServlet
 */
@WebServlet("/PostQuestionServlet")
public class PostQuestionServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public PostQuestionServlet() {
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
		IQuestionCrudProxy client = new IQuestionCrudProxy();
		int qId = Integer.parseInt(request.getParameter("qId"));
		String statement = request.getParameter("statement");
		String category = request.getParameter("category");
		int catId=0;
		for(String c : client.getCategories())
		{
			if(c.equalsIgnoreCase(category))
				break;
			catId++;			
		}
		client.postQuestion(qId, statement, request.getSession(false).getAttribute("username").toString(), catId);
		request.getRequestDispatcher("userhome.jsp").forward(request, response);
	} 

}
