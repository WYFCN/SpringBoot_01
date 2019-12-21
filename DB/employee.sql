/*
Navicat MySQL Data Transfer

Source Server         : 192.168.43.130_3306
Source Server Version : 80012
Source Host           : 192.168.43.130:3306
Source Database       : mybatis

Target Server Type    : MYSQL
Target Server Version : 80012
File Encoding         : 65001

Date: 2019-12-21 13:19:04
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for employee
-- ----------------------------
DROP TABLE IF EXISTS `employee`;
CREATE TABLE `employee` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `lastName` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `email` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  `gender` varchar(10) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  `birth` date DEFAULT NULL,
  `departmentName` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1033 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of employee
-- ----------------------------
INSERT INTO `employee` VALUES ('1030', '张三', 'haohao@163.com112', '1', '1996-10-23', 'D-EE');
INSERT INTO `employee` VALUES ('1031', '李四', 'aaaaa@qq.com', '1', '1998-06-06', 'D-CC');
INSERT INTO `employee` VALUES ('1032', '王五', 'aaaaa@qq.com', '1', '1998-12-31', 'D-BB');
