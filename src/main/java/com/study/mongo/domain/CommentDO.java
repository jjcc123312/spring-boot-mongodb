package com.study.mongo.domain;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

/**
 * @author Leo
 * @version 1.0
 * @className CommentDO
 * @description TODO
 * @date 2022/4/16 16:32
 **/
@Document("comment")
@Data
public class CommentDO {

    @Id
    private String id;

    private String articleid;

    private String content;

    private Date createdatetime;

    private Integer likenum;

    private String nickname;

    private String state;

    private String userid;




    @Override
    public String toString() {
        return "CommentDO{" +
                "id='" + id + '\'' +
                ", articleid='" + articleid + '\'' +
                ", content='" + content + '\'' +
                ", createdatetime=" + createdatetime +
                ", likenum=" + likenum +
                ", nickname='" + nickname + '\'' +
                ", state='" + state + '\'' +
                ", userid='" + userid + '\'' +
                '}';
    }
}
