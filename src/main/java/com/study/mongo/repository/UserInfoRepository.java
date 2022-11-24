package com.study.mongo.repository;

import com.study.mongo.domain.UserInfoDO;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

/**
 * @author Leo
 * @version 1.0
 * @className UserInfoRepository
 * @description TODO
 * @date 2022/4/16 17:38
 **/
public interface UserInfoRepository extends MongoRepository<UserInfoDO, String> {

    List<UserInfoDO> findByNameOrCity(String name, String city);
}
