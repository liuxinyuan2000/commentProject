package com.greate.community;

import com.greate.community.entity.Comment;
import com.greate.community.service.CommentService;
import com.greate.community.util.Constant;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;


//查询评论的数量
@RunWith(SpringRunner.class)
@SpringBootTest
public class SelectCountByEntityTests {
    @Autowired
    private CommentService commentService;
    private Constant constant;
    @Test
    public void testCountByEntity() {
        int count = commentService.findCommentCount(constant.blogType,constant.Entityid);
        System.out.println(count);
    }
}
