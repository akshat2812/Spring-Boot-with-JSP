package student_info.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import student_info.dao.StudentDao;
import student_info.model.Student;

/**
 * Servlet implementation class StudentServlet
 */
@WebServlet("/register")
public class StudentServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	private StudentDao studentDao=new StudentDao();
    /**
     * @see HttpServlet#HttpServlet()
     */
    public StudentServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		
		RequestDispatcher dispatcher=request.getRequestDispatcher("/WEB-INF/views/studentregister.jsp");
		dispatcher.forward(request, response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String id=request.getParameter("id");
		String name=request.getParameter("name");
		String semester=request.getParameter("semester");
		String english=request.getParameter("english");
		String maths=request.getParameter("maths");
		String science=request.getParameter("science");
	
		Student student=new Student();
		student.setId(id);
		student.setName(name);
		student.setSemester(semester);
		student.setEnglish(english);
		student.setMaths(maths);
		student.setScience(science);
		
		try {
			studentDao.registerStudent(student);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		RequestDispatcher dispatcher=request.getRequestDispatcher("/WEB-INF/views/studentdetails.jsp");
		dispatcher.forward(request, response); 
	}

}
