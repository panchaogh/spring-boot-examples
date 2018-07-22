package top.pcstar.springboothelloworld.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import top.pcstar.springboothelloworld.entity.Person;

/**
 * @Author: PanChao
 * @Description:
 * @Date: Created in 20:23 2018/7/22
 */
@RestController
public class ReadparamController {
    @Value("${person.name}")
    private String name;
    @Value("${person.sex}")
    private String sex;
    @Autowired
    private Person person;
    @RequestMapping("/read")
    public String read(){
        return "name="+name+"---sex="+sex;
    }
    @RequestMapping("/read1")
    public String read1(){
        return person.toString();
    }
}
