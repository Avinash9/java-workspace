package login;

import java.io.IOException;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		System.out.println("::::::::::::IN GET::::::::::::::::" + request);
		request.getRequestDispatcher("/login.jsp").forward(request, response);

	}

	@Override
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		System.out
				.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>IN POST<<<<<<<<<<<<<<<<");
		EntityManagerFactory emf = (EntityManagerFactory) getServletContext()
				.getAttribute("emf");
		EntityManager em = emf.createEntityManager();

		try {

			String name = request.getParameter("name");
			String surname = request.getParameter("surname");
			String password = request.getParameter("password");
			int age = Integer.parseInt(request.getParameter("age"));
			if (name != null) {
				em.getTransaction().begin();
				em.persist(new User(name, surname, password, age));
				em.getTransaction().commit();
			}

			request.setAttribute("name", name);
			request.getRequestDispatcher("/welcome.jsp").forward(request,response);
		}

		finally {
			if (em.getTransaction().isActive())
			{
				em.getTransaction().rollback();
			}
			em.close();
		}
	}

}
