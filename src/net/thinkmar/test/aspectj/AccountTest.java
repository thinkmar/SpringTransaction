package net.thinkmar.test.aspectj;

import net.thinkmar.programming.service.AccountService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

/**
 * 声明式事务管理测试类
 * 基于AspectJ XML配置方式
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext_aspectj.xml")
public class AccountTest {

    @Resource(name="accountService")
    private AccountService accountService;

    @Test
    public void test(){
        accountService.transfer("aaa","bbb",200d);
    }
}
