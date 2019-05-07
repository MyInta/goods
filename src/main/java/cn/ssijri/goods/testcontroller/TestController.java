package cn.ssijri.goods.testcontroller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author inta
 * @date 2019/4/22
 * @describe
 */
@Controller
public class TestController {

    @RequestMapping("/hello")
    public String hello(){
        return "hello";
    }

}
