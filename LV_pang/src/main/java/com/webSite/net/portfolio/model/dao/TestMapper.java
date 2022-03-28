package com.webSite.net.portfolio.model.dao;

import java.util.List;

import com.webSite.net.portfolio.model.dto.TestDao;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface TestMapper {

    List<TestDao> getAllDataList();

}