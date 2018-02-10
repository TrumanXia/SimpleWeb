package xyg.study.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Logger;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CommonServlet extends HttpServlet
{

    private static final long serialVersionUID = 8291450121136637414L;

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // 请求url为servletName.action?cmd=functionName&otherParas
        // http://localhost:8091/SimpleWeb/commonServlet.action
        // /SimpleWeb/commonServlet.action
        String uri = req.getRequestURI();
        String queryString = req.getQueryString();
        // String url = req.getRequestURL().toString();
        // String contextPath = req.getContextPath();
        // String queryString = req.getQueryString();
        String servlet = uri.substring(uri.lastIndexOf("/")+1, uri.indexOf(".action"));
        String method ;
        int index = queryString.indexOf("&");
        if ( index == -1){
             method = queryString.substring(queryString.indexOf("cmd=")+4);
        } else {
             method = queryString.substring(queryString.indexOf("cmd=")+4, index);
        }
        try {
            Class<?> cls = Class.forName(servlet);
            Object action = cls.newInstance();
            Object ret = cls.getMethod(method).invoke(action);
            PrintWriter out = resp.getWriter();
            out.write(ret.toString());
            out.close();
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(servlet);

    }
}
