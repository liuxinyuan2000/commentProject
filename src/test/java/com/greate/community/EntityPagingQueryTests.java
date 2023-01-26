package com.greate.community;

import com.greate.community.entity.Comment;
import com.greate.community.service.CommentService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import com.greate.community.util.Constant;
import java.util.List;


//根据评论目标（类别、id）对评论进行分页查询
@RunWith(SpringRunner.class)
@SpringBootTest
public class EntityPagingQueryTests {
    @Autowired
    private CommentService commentService;
    private Constant constant;
    @Test
    public void testEntityPagingQuery() {
        int page =0;
        int pageNum = 10;
        List<Comment> commentList = commentService.findCommentByEntity(constant.blogType,constant.Entityid,page,pageNum);
        System.out.println(commentList);
    }
}
