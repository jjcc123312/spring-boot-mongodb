package com.study.mongo.service;

import com.study.mongo.domain.CommentDO;

/**
 * @author Leo
 * @version 1.0
 * @className CommentService
 * @description TODO
 * @date 2022/4/16 16:45
 **/
public interface CommentService {

    int insert(CommentDO commentDO);

    int update(String id, CommentDO commentDO);
}
