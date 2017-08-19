package net.thinkmar.test.proxyfactorybean;

import net.thinkmar.programming.service.AccountService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

/**
 * 声明式事务管理（基于TransactionProxyFactoryBean）测试类
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext_proxy.xml")
public class AccountTest {

//    @Resource(name="accountService")

    //使用代理后的业务类
    @Resource(name="accountServiceProxy")
    private AccountService accountService;

    @Test
    public void test(){
        accountService.transfer("aaa","bbb",200d);
    }
}
