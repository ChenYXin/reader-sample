package com.imooc.reader.controller;

import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
public class TestController {
    @PostMapping("/t/test1")
    @ResponseBody
    public Map test1(@RequestParam("content") String content) {
        Map result = new HashMap();
        result.put("test", "测试：" + content);
        return result;
    }
}
