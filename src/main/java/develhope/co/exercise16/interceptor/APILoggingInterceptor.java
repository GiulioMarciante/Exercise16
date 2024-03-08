package develhope.co.exercise16.interceptor;

import develhope.co.exercise16.entities.User;
import jakarta.annotation.Nullable;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Component
public class APILoggingInterceptor implements HandlerInterceptor {
    public static List<User> users = new ArrayList<>(Arrays.asList(
          new User(1,"Gigi","Buffon","Roma"),
          new User(2,"Luca","Paulo","Venezia"),
          new User(3,"Laura","Campana","Napoli")
    ));
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception{
        System.out.println("Request User-Agent: " + request.getHeader("User-Agent"));
        return true;
    }
    public void postHandler(HttpServletRequest request, HttpServletResponse response, Object handler, @Nullable ModelAndView modelAndView) throws Exception{

    }
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, @Nullable Exception ex) throws Exception{

    }
}

