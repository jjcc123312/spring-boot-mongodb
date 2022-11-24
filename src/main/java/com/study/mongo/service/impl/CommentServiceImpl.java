package com.study.mongo.service.impl;

import com.study.mongo.domain.CommentDO;
import com.study.mongo.service.CommentService;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Service;

/**
 * @author Leo
 * @version 1.0
 * @className CommentServiceImpl
 * @description TODO
 * @date 2022/4/16 16:45
 **/
@Service
public class CommentServiceImpl implements CommentService {

    private final MongoTemplate mongoTemplate;

    public CommentServiceImpl(MongoTemplate mongoTemplate) {
        this.mongoTemplate = mongoTemplate;
    }

    @Override
    public int insert(CommentDO commentDO) {
        try {
            mongoTemplate.insert(commentDO);
            return 1;
        } catch (Exception e) {
            e.printStackTrace();
            return -1;
        }
    }

    @Override
    public int update(String id, CommentDO commentDO) {
        try {
            Query query = new Query();
            query.addCriteria(Criteria.where("_id").is(id));
            Update update = new Update();
            update.set("content", commentDO.getContent());
            mongoTemplate.updateFirst(query, update, CommentDO.class);
            return 1;
        } catch (Exception e) {
            e.printStackTrace();
            return -1;
        }
    }
}
