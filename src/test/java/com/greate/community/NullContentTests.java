package com.greate.community;

import com.greate.community.entity.Comment;
import com.greate.community.service.CommentService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;


//评论为空测试
@RunWith(SpringRunner.class)
@SpringBootTest
public class NullContentTests {
    @Autowired
    private CommentService commentService;
    @Test
    public void testNullContent() {
        Comment comment = new Comment();
        Date date = new Date();// 获取当前时间
        comment.setCreateTime(date);
        comment.setContent(null);
        int row = commentService.addComment(comment);
        System.out.println(row);
    }

}
