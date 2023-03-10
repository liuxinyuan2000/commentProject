# 博客评论功能模块

---

## 项目简介
本项目是一个博客系统的评论模块，功能主要包括对评论的发布、删除、查询（评论详情、数量、对用户和实体的分页查询等),对评论内容过滤敏感词。可以对博客帖子本身评论，也可以对帖子下方的评论进行二次评论。

**源码链接**

- Github:

## 核心技术栈
- Spring
- Spring Boot 2.1.5 RELEASE
- Spring MVC
- ORM：MyBatis
- 数据库：MySQL 5.7

## 开发环境
- 操作系统：macos
- 构建工具：Apache Maven
- 集成开发工具：Intellij IDEA
- 版本控制工具：Git
- Java 版本：11


## 功能列表
  - 发布对帖子/评论的评论（过滤敏感词）
  - 分页显示评论（某个用户的所有评论，某个评论/帖子下的所有评论）
  - 发布对评论的回复（过滤敏感词）
  - 删除某个评论


## 本地运行
将项目部署在本地进行测试，需要准备以下环境：
- Java 11
- MySQL 5.7


本地运行需要修改的配置文件信息：
`application-develop.properties`:mysql

每次运行需要打开：
- MySQL

另外，还需要事先建好数据库 CommentFunc，然后再运行项目 sql 文件夹下有建表语句。


## 评论及相关信息
关于评论模块需要注意的就是评论表的设计，把握其中字段的含义。
- id: 该条评论的唯一id
- user_id: 发布评论的作者id
- entityType: 评论目标的类型（帖子0、评论1）
- entityId: 评论目标的 id（帖子或者评论都有唯一的id)
- targetId: 指明对哪个用户进行评论(用户 id)
- content: 评论内容
- status: 状态：0 正常，1 禁用
- createTime: 发布时间

## 测试
在`/Users/troyyliu/Downloads/commentProject/src/test/java/com/greate/community`路径下，对评论系统的功能以及异常进行测试






