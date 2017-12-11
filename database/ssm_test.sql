/*
Navicat MySQL Data Transfer

Source Server         : local_mysql
Source Server Version : 50630
Source Host           : localhost:3306
Source Database       : ssm_test

Target Server Type    : MYSQL
Target Server Version : 50630
File Encoding         : 65001

Date: 2017-12-11 11:18:01
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for dictionary
-- ----------------------------
DROP TABLE IF EXISTS `dictionary`;
CREATE TABLE `dictionary` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `dic_type` varchar(20) DEFAULT NULL COMMENT '字典类型',
  `dic_text` varchar(20) DEFAULT NULL COMMENT '字典text',
  `dic_value` varchar(20) DEFAULT NULL COMMENT '字典value',
  `sts` varchar(2) DEFAULT '1' COMMENT '是否有效，0无效，1有效',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of dictionary
-- ----------------------------

-- ----------------------------
-- Table structure for member
-- ----------------------------
DROP TABLE IF EXISTS `member`;
CREATE TABLE `member` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `user_id` bigint(20) DEFAULT NULL COMMENT '用户id',
  `member_type` varchar(10) DEFAULT NULL COMMENT '会员类型',
  `sts` varchar(2) DEFAULT '1' COMMENT '是否有效，0无效，1有效',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of member
-- ----------------------------

-- ----------------------------
-- Table structure for organization
-- ----------------------------
DROP TABLE IF EXISTS `organization`;
CREATE TABLE `organization` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `org_name` varchar(50) DEFAULT NULL COMMENT '组织机构名称',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of organization
-- ----------------------------

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `login_name` varchar(50) DEFAULT NULL COMMENT '登录名',
  `login_pass` varchar(50) DEFAULT NULL COMMENT '登录密码（md5加密）',
  `org_id` bigint(20) DEFAULT NULL COMMENT '组织机构id',
  `sts` varchar(2) DEFAULT '1' COMMENT '是否有效，0无效，1有效',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=47 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('12', '张三', '123456', null, '1');
INSERT INTO `user` VALUES ('41', '李四', '123456', null, '1');
INSERT INTO `user` VALUES ('44', '李四', '123456', null, '1');
INSERT INTO `user` VALUES ('45', '李四', '123456', null, '1');
INSERT INTO `user` VALUES ('46', '李四', '123456', null, '1');
