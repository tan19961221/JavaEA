package club.banyuan.blog.controller;

import club.banyuan.blog.bean.Blog;
import club.banyuan.blog.bean.User;
import club.banyuan.blog.service.BlogService;
import club.banyuan.blog.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class UserController {

    @GetMapping("/user/{username:[a-z0-9_]+}")
    @ResponseBody
    public List<Blog> userController(@PathVariable String username,
                                     @RequestParam(required=false, defaultValue="1") Integer page,
                                     @RequestParam(required=false, defaultValue="10") Integer size) {
        UserService userService=new UserService();
        User user1=userService.findByName(username);
        BlogService blogService=new BlogService();
        List<Blog> bo= blogService.findBlogs(user1,page,size);
        return bo;
    }
}
