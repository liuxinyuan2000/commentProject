package com.greate.community;

import com.greate.community.service.CommentService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


//测试获取评论信息
@RunWith(SpringRunner.class)
@SpringBootTest
public class DeleteCommentTests {
    @Autowired
    private CommentService commentService;
    @Test
    public void testCommentGet() {
        int testCommentId = 5;
        int res;
        res = commentService.deleteComment(testCommentId);
        System.out.println(res);
    }
}
