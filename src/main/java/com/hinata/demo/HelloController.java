package com.hinata.demo;


import org.springframework.beans.factory.annotation.Autowired;
//@Value 这个注解实现配置内容的注入
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class HelloController {
    @Autowired
    private GirlProperties girlProperties;

    @RequestMapping(value = "/hello",method = RequestMethod.GET)
    public String hello(){
        return "the girl's cup is"
                +girlProperties.getCupSize()+" and her age is:"+girlProperties.getAge();
    }


}
