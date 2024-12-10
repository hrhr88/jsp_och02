package och02;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class Add3
 */
public class Add3 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Add3() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8"); // 한글 셋팅
		System.out.println("doGet start ,,");
		// num의 누적분을 return
		int num = Integer.parseInt(request.getParameter("num"));
		String han = request.getParameter("han");
		int sum =0;
		for (int i = 0; i <= num; i++) {
			sum += i;
		}
		
		// browser에 Display 하기 위한 방법
		response.setContentType("text/html;charset=utf-8");  // 한글 셋팅, 반드시 세팅해주어야함!
		//browser에 상세내용 표시
		PrintWriter out = response.getWriter();
		out.println("<html><body>");
		out.println("<h1>1부터 "+num+"까지 합계 Get</h1>");
		out.printf("<h1> han Test : %s</h1>", han);
		out.printf("<h1>1부터 %d까지 합계</h1>", num);
		out.println(sum);
		out.println("</body></html>");
		out.close();
		
		// syso는 콘솔창에 뜨고 out.print를 해주어야 화면에 출력
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8"); // 한글 셋팅
		System.out.println("doPost start ,,");
		// num의 누적분을 return
		int num = Integer.parseInt(request.getParameter("num"));
		String han = request.getParameter("han");
		int sum =0;
		for (int i = 0; i <= num; i++) {
			sum += i;
		}
		
		// browser에 Display 하기 위한 방법
		response.setContentType("text/html;charset=utf-8");  // 한글 셋팅, 반드시 세팅해주어야함!
		//browser에 상세내용 표시
		PrintWriter out = response.getWriter();
		out.println("<html><body>");
		out.println("<h1>1부터 "+num+"까지 합계 Post</h1>");
		out.printf("<h1> han Test : %s</h1>", han);
		out.printf("<h1>1부터 %d까지 합계</h1>", num);
		out.println(sum);
		out.println("</body></html>");
		out.close();
	}

}
