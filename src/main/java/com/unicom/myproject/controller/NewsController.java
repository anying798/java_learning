package com.unicom.myproject.controller;

import com.unicom.myproject.entity.News;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value = "/news")
public class NewsController {

    //@GetMapping @PostMapping
    @RequestMapping(value = "/getAll")
    public List<News> getAll(){
        News news1 = new News(1,"aaa","AAAA");
        News news2 = new News(2,"bbb","BBBB");
        News news3 = new News(3,"ccc","CCCC");
        News news4 = new News(4,"ddd","DDDD");

        List<News> list = new ArrayList<>();
        list.add(news1);
        list.add(news2);
        list.add(news3);
        list.add(news4);

        return list ;
    }
}
