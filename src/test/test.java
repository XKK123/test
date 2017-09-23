package test;

import org.springframework.web.servlet.HandlerAdapter;
import org.springframework.web.servlet.ModelAndView;

public class test {
    HandlerAdapter handlerAdapter = new HandlerAdapter() {
        @Override
        public boolean supports(Object o) {
            return false;
        }

        @Override
        public ModelAndView handle(javax.servlet.http.HttpServletRequest httpServletRequest, javax.servlet.http.HttpServletResponse httpServletResponse, Object o) throws Exception {
            return null;
        }

        @Override
        public long getLastModified(javax.servlet.http.HttpServletRequest httpServletRequest, Object o) {
            return 0;
        }
    };
}
