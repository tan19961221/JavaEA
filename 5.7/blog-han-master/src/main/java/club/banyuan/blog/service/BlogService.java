package club.banyuan.blog.service;

import club.banyuan.blog.bean.Blog;
import club.banyuan.blog.bean.User;

import java.util.ArrayList;
import java.util.List;

public class BlogService {
    public List<Blog> findBlogs(User user,Integer page, Integer size) {
        List<Blog> blogs = new ArrayList<>();
        
        for (Integer i =(page-1)*10; i <(page-1)*10+size; i++) {
            Blog blog = new Blog(i, "title " + i, "content " + i);
            blogs.add(blog);
        }

        return blogs;
    }
}
