package och02;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class Person
 */
public class Person extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Person() {
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
		// 한글 표시
		request.setCharacterEncoding("utf-8");
//		response.setContentType("text/html;charset=utf-8");
		
		// 배경인 경우 : request 객체의 getParametetValues("매개변수이름")으로 처리
		
		String name = request.getParameter("name");
	    String id = request.getParameter("id");
	    String password = request.getParameter("password");
	    String gender = request.getParameter("gender");
	    String[] notice = request.getParameterValues("notice");
	    String job = request.getParameter("job");

	    response.setContentType("text/html;charset=utf-8");
	    PrintWriter out = response.getWriter();

	    out.println("<html><body><h1>입력 결과</h1>");
	    out.println("이름: " + name + "<br>");
	    out.println("아이디: " + id + "<br>");
	    out.println("비밀번호: " + password + "<br>");
	    out.println("성별: " + gender + "<br>");
	    out.println("직업: " + job + "<br>");
	    
	    
	    if (notice != null) {
	        out.println("<p>공지사항 선택:</p>");
	        for (int i = 0; i < notice.length; i++) {
	            out.println("- " + notice[i] + "<br>");
	        }
	    } else {
	        out.println("<p>공지사항 선택 없음</p>");
	    }

	    out.println("직업: " + job + "<br>");
	    out.println("</body></html>");
	    out.close();
	}

}
