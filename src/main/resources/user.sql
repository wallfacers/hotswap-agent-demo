CREATE TABLE `tbl_user` (
  `id` bigint NOT NULL AUTO_INCREMENT COMMENT '用户ID',
  `name` varchar(255) NOT NULL COMMENT '用户名称',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci COMMENT='测试用户表'


INSERT INTO `demo`.`tbl_user` (`id`,`name`) VALUES (1,'laowang');
INSERT INTO `demo`.`tbl_user` (`id`,`name`) VALUES (2,'laowang2');