package net.thinkmar.test.programming;

import net.thinkmar.programming.service.AccountService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

/**
 * 编程式事务管理测试类
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class AccountTest {

    @Resource(name="accountService")
    private AccountService accountService;

    @Test
    public void test(){
        accountService.transfer("aaa","bbb",200d);
    }
}
