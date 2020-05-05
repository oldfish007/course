/**
 * @作者 7七月
 * @微信公号 林间有风
 * @开源项目 $ http://7yue.pro
 * @免费专栏 $ http://course.7yue.pro
 * @我的课程 $ http://imooc.com/t/4294850
 * @创建时间 2020-04-30 16:02
 */
package com.course.server.controller;

import com.course.server.domain.Test;
import com.course.server.service.TestService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author oldfish
 * @date 2020-04-30 16:02
 * @version 1.0
 */
@RestController
public class TestController {

    @Resource
    private TestService testService;

    @RequestMapping("/test")
    public List<Test> test(){

        return testService.list();
    }

}
