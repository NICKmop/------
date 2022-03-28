package com.webSite.net.portfolio.service;
import java.util.List;
import com.webSite.net.portfolio.model.dao.TestMapper;
import com.webSite.net.portfolio.model.dto.TestDao;

import org.springframework.stereotype.Service;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class TestServicelmpl implements TestService{
    
    private final TestMapper testMapper;

    public List<TestDao> getAllDataList(){
        return testMapper.getAllDataList();
    }
}
