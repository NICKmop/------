package com.webSite.net.portfolio.contoller;

import java.util.List;

import com.webSite.net.portfolio.model.dto.TestDao;
import com.webSite.net.portfolio.service.TestService;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@RestController
public class TestController {

    private final TestService teService;

    @GetMapping("/main")
    public List<TestDao> test(){
        return teService.getAllDataList();
    }
}
