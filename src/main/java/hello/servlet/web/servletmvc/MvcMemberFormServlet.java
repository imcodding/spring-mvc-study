package hello.servlet.web.servletmvc;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

// Controller 역할
@WebServlet(name = "mvcMemberFormServlet", urlPatterns = "/servlet-mvc/members/new-form")
public class MvcMemberFormServlet extends HttpServlet {

    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String viewPath = "/WEB-INF/views/new-form.jsp";
        RequestDispatcher dispatcher = request.getRequestDispatcher(viewPath);
        dispatcher.forward(request, response); // 다른 서블릿이나 jsp 로 이동.

        /*
        # redirect vs forward
        - redirect 는 실제 클라이언트(웹 브라우저)에 응답이 갔다가, 클라이언트가 redirect 경로를 다시 요청 => 클라이언트 인지O
        - forward 는 서버 내부에서 다시 호출함 => 클라이언트 인지X
         */

        /*
         # WAS 서버 룰
         - WEB-INF 하위에 있는 뷰는 외부에서 호출해도 무조건 컨트롤러를 호출함.
         - 웹 브라우저에서 경로치고 바로 접근 불가능.
         */
    }
}
