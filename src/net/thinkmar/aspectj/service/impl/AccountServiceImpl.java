package net.thinkmar.aspectj.service.impl;

import net.thinkmar.programming.dao.AccountDao;
import net.thinkmar.programming.service.AccountService;

/**
 * 业务层实现类
 */
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
