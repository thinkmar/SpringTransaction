package net.thinkmar.annotation.service.impl;

import net.thinkmar.programming.dao.AccountDao;
import net.thinkmar.programming.service.AccountService;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * 业务层实现类,基于注解方式控制事务
 */

/**
 * propagation  :事务的传播行为
 * isolation    :事务的隔离级别
 * readOnly     :只读
 * rollbackFor  :哪些异常回滚
 * noRollbackFor:哪些异常不回滚
 */
@Transactional(propagation = Propagation.REQUIRED)
public class AccountServiceImpl implements AccountService {

    private AccountDao accountDao;

    public void setAccountDao(AccountDao accountDao) {
        this.accountDao = accountDao;
    }

    public void transfer(String out, String in, Double money) {
        accountDao.outMoney(out, money);
//                构造异常测试
                int ep = 1 / 0;
        accountDao.inMoney(in, money);
    }
}
