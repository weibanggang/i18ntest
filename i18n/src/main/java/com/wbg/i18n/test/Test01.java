package com.wbg.i18n.test;

import com.sun.corba.se.spi.resolver.LocalResolver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.LocaleResolver;
import sun.util.locale.provider.LocaleResources;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.Locale;

@Controller
@RequestMapping("/test01")
public class Test01 {

    @RequestMapping(method = RequestMethod.GET)
    public String index(){

        return "index";
    }



    @Autowired
    private LocaleResolver localeResolver;
    @RequestMapping("/{loc}")
    public String cheagr(@PathVariable("loc") String loc, HttpServletResponse response, HttpServletRequest request){
        Locale locale=new Locale(loc);

        localeResolver.setLocale(request,response,locale);
        return "redirect:/test01";
    }

    @ResponseBody
    @RequestMapping("/session/{key}/{value}")
    public HashMap<String,String> cheagrs(@PathVariable("key") String key, @PathVariable("value") String value, HttpSession session){
        session.setAttribute(key,value);

        return new HashMap<String,String>(){{
            put(key,value);
        }
        };
    }
}
