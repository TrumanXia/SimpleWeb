package xyg.study.servlet;

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.text.DateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class TimeServlet extends HttpServlet
{

    private static final long serialVersionUID = -2898331586075796624L;

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // 设置response的输出编码
        resp.setCharacterEncoding("utf-8");
        resp.sendError(HttpServletResponse.SC_FORBIDDEN);
        
//        resp.setStatus(HttpServletResponse.SC_BAD_REQUEST);
        
        // 生成二进制格式的正文数据
//        OutputStream output = resp.getOutputStream();
//        // 生成字符串形式的正文数据
//        PrintWriter out = resp.getWriter();
//        out.write(DateFormat.getInstance().format(new Date()));
//        resp.sendError(HttpServletResponse.SC_FORBIDDEN);
//        out.close();
    }
}
