package net.thinkmar.aspectj.dao;

/**
 * Dao层接口
 */
public interface AccountDao {

    /**
     * @param out   转出账号
     * @param money 金额
     */
    public void outMoney(String out, Double money);

    /**
     * @param in   转入账号
     * @param money 金额
     */
    public void inMoney(String in, Double money);
}
