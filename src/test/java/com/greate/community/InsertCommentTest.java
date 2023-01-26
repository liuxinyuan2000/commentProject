package com.greate.community;
import java.util.Date;
import com.greate.community.entity.Comment;
import com.greate.community.service.CommentService;
import com.greate.community.util.Constant;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


//测试发布评论功能
@RunWith(SpringRunner.class)
@SpringBootTest
public class InsertCommentTest {
    @Autowired
    private CommentService commentService;
    private Constant constant;
    @Test
    public void testCommentInsert() {
        Comment comment = new Comment();
        Date date = new Date();// 获取当前时间
        comment.setCreateTime(date);
        comment.setContent("this is a test");
        comment.setStatus(constant.rightsta);
        comment.setUserId(constant.senderid);
        comment.setTargetId(constant.receiveid);
        comment.setEntityType(constant.blogType);
        comment.setEntityId(constant.Entityid);
        int row = commentService.addComment(comment);
        System.out.println(row);
    }
}
