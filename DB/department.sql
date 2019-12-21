/*
Navicat MySQL Data Transfer

Source Server         : 192.168.43.130_3306
Source Server Version : 80012
Source Host           : 192.168.43.130:3306
Source Database       : mybatis

Target Server Type    : MYSQL
Target Server Version : 80012
File Encoding         : 65001

Date: 2019-12-21 13:18:55
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for department
-- ----------------------------
DROP TABLE IF EXISTS `department`;
CREATE TABLE `department` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `departmentName` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=106 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of department
-- ----------------------------
INSERT INTO `department` VALUES ('101', 'D-AA');
INSERT INTO `department` VALUES ('102', 'D-BB');
INSERT INTO `department` VALUES ('103', 'D-CC');
INSERT INTO `department` VALUES ('104', 'D-DD');
INSERT INTO `department` VALUES ('105', 'D-EE');
