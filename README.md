# SpringTransaction
Spring 事务管理
## 编程式事务管理
  手动编写代码进行事务管理

## 声明式事务管理
  ### 1.基于TransactionProxyFactoryBean
    每个事务管理的类都需要配置
  ### 2.基于AspectJ XML方式
    XML配置，业务类不需要改动
  ### 3.基于注解方式
    配置简单，业务类增加@Transactional
