package com.interceptor;

import com.hcf.mapper.TbUserMapper;
import com.hcf.pojo.TbStore;
import com.hcf.pojo.TbUser;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


public class LoginInterceptor implements HandlerInterceptor {
    @Autowired
    private TbUserMapper userMapper;
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object o) throws Exception {
        HttpSession session = request.getSession();
        TbUser user = (TbUser) session.getAttribute("user");
        TbStore store = (TbStore) session.getAttribute("store");
        //获取uri
        //String uri = request.getRequestURI(); //访问首页 /fore/foreIndex
        //去掉前缀/fore
        //uri = uri.substring(5,uri.length());  //去掉前缀后 /foreIndex
        if(user == null){
            if(store == null ) {//如果商铺 也有普通账号   则
                System.out.println("拦截");
                response.sendRedirect("/pre/login");//重定向
                return false;
            }
            else
            {
                TbUser storeuser = userMapper.selectByPrimaryKey(store.getStoreid());
                if (storeuser == null)
                {
                    response.sendRedirect("/pre/login");//重定向
                    return false;
                }
            }
        }
        System.out.println("放行");
        return true;
    }

    @Override
    public void postHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, ModelAndView modelAndView) throws Exception {

    }

    @Override
    public void afterCompletion(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) throws Exception {

    }
}
