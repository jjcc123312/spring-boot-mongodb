package com.study.mongo;

import com.study.mongo.domain.CommentDO;
import com.study.mongo.domain.UserInfoDO;
import com.study.mongo.repository.CommentRepository;
import com.study.mongo.repository.UserInfoRepository;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Calendar;
import java.util.Date;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = SpringBootMongodbApplication.class)
class SpringBootMongodbApplicationTests {

    @Autowired
    private CommentRepository commentRepository;

    @Autowired
    private UserInfoRepository userInfoRepository;
    private final Logger log = LoggerFactory.getLogger(SpringBootMongodbApplicationTests.class);

    @Test
    void contextLoads() {
        List<CommentDO> all = commentRepository.findAll();
        log.info("comment data:{}", all);
    }

    @Test
    void save() {
        UserInfoDO userInfoDO = new UserInfoDO();
        userInfoDO.setName("leo");
        userInfoDO.setSex("man");
        userInfoDO.setCity("益阳");
        userInfoDO.setDateBirth(new Date(97, Calendar.FEBRUARY, 2));
        userInfoDO.setGmtCreate(new Date());
        UserInfoDO save = userInfoRepository.save(userInfoDO);

    }

}
