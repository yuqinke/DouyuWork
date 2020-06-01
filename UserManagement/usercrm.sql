/*
 Navicat MySQL Data Transfer

 Source Server         : 11111
 Source Server Type    : MySQL
 Source Server Version : 50529
 Source Host           : localhost:3306
 Source Schema         : yuangong

 Target Server Type    : MySQL
 Target Server Version : 50529
 File Encoding         : 65001

 Date: 01/04/2020 18:50:53
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

create database usercrm;
-- ----------------------------
-- Table structure for t_emp
-- ----------------------------
DROP TABLE IF EXISTS `t_emp`;
CREATE TABLE `t_emp`  (
  `id` varchar(40) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `name` varchar(40) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `salary` double(7, 2) NULL DEFAULT NULL,
  `age` int(3) NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of t_emp
-- ----------------------------
INSERT INTO `t_emp` VALUES ('40452db4-5738-4b05-a82b-0ea6420ed08e', '李四', 7000.00, 35);
INSERT INTO `t_emp` VALUES ('6c0733e1-5b30-4e38-a971-ab6c12d4f92e', '张三', 8000.00, 54);
INSERT INTO `t_emp` VALUES ('ae11f7b3-3812-4d84-99af-9d7dec2718c8', '小白', 3000.00, 22);

-- ----------------------------
-- Table structure for t_user
-- ----------------------------
DROP TABLE IF EXISTS `t_user`;
CREATE TABLE `t_user`  (
  `id` varchar(40) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `username` varchar(40) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `realname` varchar(40) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `password` varchar(60) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `sex` varchar(4) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of t_user
-- ----------------------------
INSERT INTO `t_user` VALUES ('11884457-238e-4ee8-a255-ae32702b1d3b', 'yuqinke', '余钦科', '123456', '男');
INSERT INTO `t_user` VALUES ('118b1401-db47-4bb2-80f1-df96970d7202', 'liurushi', '柳如是', '123456', '女');


SET FOREIGN_KEY_CHECKS = 1;
