package club.banyuan.springdemo;

//使用@RequestMapping注解
//不要返回HTML内容，使用@ResponseBody直接返回String
//时间格式示例（年-月-日 时:分:秒）：2016-08-24 16:33:24
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.text.SimpleDateFormat;
import java.util.Date;

@Controller
@RequestMapping("/hello")
public class HelloController {
    @GetMapping
    @ResponseBody
    public String sayHello(){
        Date now = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        return dateFormat.format( now );
    }

}