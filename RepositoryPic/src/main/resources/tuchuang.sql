# Host: localhost  (Version: 5.5.30)
# Date: 2016-02-17 14:44:51
# Generator: MySQL-Front 5.3  (Build 4.13)

/*!40101 SET NAMES utf8 */;

#
# Source for table "picrepository"
#

CREATE TABLE `picrepository` (
  `id` int(10) NOT NULL AUTO_INCREMENT,
  `origin_name` varchar(255) DEFAULT NULL,
  `path` varchar(255) DEFAULT NULL,
  `user_id` int(10) DEFAULT NULL,
  `link` varchar(255) DEFAULT NULL,
  `insert_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `last_update_time` timestamp NULL DEFAULT NULL,
  `description` varchar(255) DEFAULT NULL,
  `nextfix` varchar(255) DEFAULT NULL,
  `pic_size` int(10) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

#
# Data for table "picrepository"
#

INSERT INTO `picrepository` VALUES (1,'11','1',1,'1','2016-02-15 15:00:00','2016-02-15 15:00:00','1','1',1);
