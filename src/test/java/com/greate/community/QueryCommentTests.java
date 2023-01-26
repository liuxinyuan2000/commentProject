package com.greate.community;

import com.greate.community.entity.Comment;
import com.greate.community.service.CommentService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


//测试获取评论信息
@RunWith(SpringRunner.class)
@SpringBootTest
public class QueryCommentTests {
    @Autowired
    private CommentService commentService;
    @Test
    public void testCommentGet() {
        int testCommentId = 1;
        Comment comment;
        comment = commentService.findCommentById(testCommentId);
        System.out.println(comment);
    }
}
