package com.bsn.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

import javax.servlet.http.HttpServletRequest;

@Component
public class LoginFilter extends ZuulFilter {
    @Override
    // 过滤器类型
    public String filterType() {
        return "pre";
    }

    @Override
    public int filterOrder() {
        return 0;
    }

    @Override
    // 是否生效
    public boolean shouldFilter() {
        RequestContext currentContext = RequestContext.getCurrentContext();
        HttpServletRequest request = currentContext.getRequest();


        return true;
    }

    @Override
    public Object run() throws ZuulException {
        // 获取请求上下文
        RequestContext currentContext = RequestContext.getCurrentContext();
        // 获取当前请求信息
        HttpServletRequest request = currentContext.getRequest();

        String token = request.getParameter("token");
        if(StringUtils.isEmpty(token)){
            // 未登录
//            HttpServletResponse response = currentContext.getResponse();
//            PrintWriter writer = null;
//            try {
//                writer = response.getWriter();
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//            writer.write("no login");
//            writer.flush();
//            writer.close();
            currentContext.setSendZuulResponse(false);
            currentContext.setResponseStatusCode(HttpStatus.FORBIDDEN.value());
        }
        // 已登录

        return null;
    }
}
