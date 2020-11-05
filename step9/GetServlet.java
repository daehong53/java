import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class GetServlet
 */
@WebServlet("/GetServlet")
public class GetServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public GetServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub

		PrintWriter out = response.getWriter();
		String name = request.getParameter("id");
//		String pwd = request.getParameter("pwd");
		
//		String sql = "select * from member where id = " 
//		+ name + " and password = " + pwd;
		// select count(*) from member where id='abc' and password = '123';
		// sql실행하는 메서드
		// 실행한 결과를 true/false 
		// if( count값이 1이면) { 로그인 html }
		// else{ 아이디 비밀번호 틀렸으니 새로 로그인해 이자식아 }
		
		out.println("<html>							");
		out.println("<head>							");
		out.println("	<title>get Servlet</title>	");
		out.println("</head>						");
		out.println("<body>							");
		out.println("	<h2>						");
		out.println("name : [" + name + "]");
		out.println("	</h2><br/>					");
		out.println("</body>						");
		out.println("</html>						");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
