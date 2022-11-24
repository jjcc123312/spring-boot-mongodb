package com.study.mongo.config;

import org.springframework.data.mongodb.MongoDatabaseFactory;
import org.springframework.data.mongodb.config.AbstractMongoClientConfiguration;
import org.springframework.data.mongodb.core.convert.DefaultMongoTypeMapper;
import org.springframework.data.mongodb.core.convert.MappingMongoConverter;
import org.springframework.data.mongodb.core.convert.MongoCustomConversions;
import org.springframework.data.mongodb.core.convert.MongoTypeMapper;
import org.springframework.data.mongodb.core.mapping.MongoMappingContext;

/**
 * @author Leo
 * @version 1.0
 * @className MongoDbConfig
 * @description TODO
 * @date 2022/4/16 15:56
 **/
//@Configuration
public class MongoDbConfig extends AbstractMongoClientConfiguration {


    @Override
    protected String getDatabaseName() {
        //数据库名
        return "test";
    }

//    @Bean
    public MappingMongoConverter mappingMongoConverter(MongoDatabaseFactory databaseFactory,MongoCustomConversions customConversions, MongoMappingContext mappingContext){
        MappingMongoConverter mmc = super.mappingMongoConverter(databaseFactory,customConversions,mappingContext);
        mmc.setTypeMapper(defaultMongoTypeMapper());
        return mmc;
    }

//    @Bean
    public MongoTypeMapper defaultMongoTypeMapper() {
        return new DefaultMongoTypeMapper(null);
    }

}
