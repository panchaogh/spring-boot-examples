package top.pcstar.springboothelloworld.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Author: PanChao
 * @Description: Freemarker测试
 * @Date: Created in 11:38 2018/7/15
 */
@RestController
public class FreemarkerController {
    @RequestMapping("/testFreemarker")
    public ModelAndView testFreemarker() {
        Map<String, Object> result = new HashMap<>();
        result.put("name","美丽的天使...");
        result.put("sex", "0");
        List<String> listResult = new ArrayList<>();
        listResult.add("zhangsan");
        listResult.add("lisi");
        listResult.add("wangwu");
        result.put("listResult", listResult);
        return new ModelAndView("index","result",result);
    }
}
