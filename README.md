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
## mysql数据库表
CREATE TABLE `account` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(20) NOT NULL,
  `money` double DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

INSERT INTO `account` VALUES ('1', 'aaa', '1000');
INSERT INTO `account` VALUES ('2', 'bbb', '1000');
INSERT INTO `account` VALUES ('3', 'ccc', '1000');
