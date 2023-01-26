package com.greate.community;

import com.greate.community.service.CommentService;
import com.greate.community.util.Constant;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


//查询某个用户的评论/回复数量
@RunWith(SpringRunner.class)
@SpringBootTest
public class SelectCountByUserTests {
    @Autowired
    private CommentService commentService;
    private Constant constant;
    @Test
    public void testCountCountByUser() {
        int count = commentService.findCommentCountByUserId(constant.senderid);
        System.out.println(count);
    }
}
