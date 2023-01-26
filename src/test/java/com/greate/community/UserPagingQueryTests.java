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


//分页查询某个用户的评论/回复列表
@RunWith(SpringRunner.class)
@SpringBootTest
public class UserPagingQueryTests {
    @Autowired
    private CommentService commentService;
    private Constant constant;
    @Test
    public void testUserPagingQuery() {
        int page =0;
        int pageNum = 10;
        List<Comment> commentList = commentService.findCommentByUserId(constant.senderid,page,pageNum);
        System.out.println(commentList);
    }
}
