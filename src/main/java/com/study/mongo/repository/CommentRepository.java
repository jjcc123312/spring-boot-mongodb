package com.study.mongo.repository;

import com.study.mongo.domain.CommentDO;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * @author Leo
 * @version 1.0
 * @className CommentRepository
 * @description TODO
 * @date 2022/4/16 16:46
 **/
public interface CommentRepository  extends MongoRepository<CommentDO, String> {


}
