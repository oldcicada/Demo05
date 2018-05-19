/*
SQLyog Ultimate v12.09 (32 bit)
MySQL - 5.1.51-community : Database - civil
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`civil` /*!40100 DEFAULT CHARACTER SET utf8 COLLATE utf8_unicode_ci */;

USE `civil`;

/*Table structure for table `t_mzyw_azc_bdxx` */

DROP TABLE IF EXISTS `t_mzyw_azc_bdxx`;

CREATE TABLE `t_mzyw_azc_bdxx` (
  `id` varchar(255) COLLATE utf8_unicode_ci NOT NULL,
  `bdsj` varchar(16) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '报道时间',
  `cjsj` varchar(14) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '创建时间',
  `cjyh` varchar(100) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '创建用户',
  `csny` varchar(16) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '出生年月',
  `fyfs` varchar(50) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '服役方式',
  `jg` varchar(50) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '籍贯',
  `jkzg` varchar(100) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '健康状况',
  `jz` varchar(50) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '军种',
  `jzdz` varchar(100) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '居住地址',
  `lxdh` varchar(50) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '联系电话',
  `qtzyyx` varchar(100) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '其他专业意向',
  `rwdd` varchar(50) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '入伍地点',
  `rwqhkxx` varchar(50) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '入伍前户口性质',
  `rwsj` varchar(16) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '入伍时间',
  `rwtzbh` varchar(50) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '入伍通知编号',
  `sbsfzhm` varchar(18) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '士兵身份证号码',
  `sfcjmfpx` varchar(50) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '是否参加免费培训',
  `sffctz` varchar(50) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '是否服从调整',
  `sgjl` varchar(50) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '受过奖励',
  `twsj` varchar(16) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '退伍时间',
  `tybdmc` varchar(50) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '退役部队名称',
  `tyssflqtyj` varchar(50) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '退役时是否领取退役金',
  `tyzjbh` varchar(50) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '退役证件编号',
  `whcd` varchar(50) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '文化程度',
  `xb` varchar(50) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '性别',
  `xm` varchar(50) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '姓名',
  `xxmc` varchar(50) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '学校名称',
  `yxbs` varchar(50) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '有效标识',
  `zcbs` varchar(50) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '暂存报送',
  `zhxgsj` varchar(14) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '最后修改时间',
  `zhxgyh` varchar(100) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '最后修改用户',
  `zyjyhjnpxxx` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '职业教育和技能培训信息JSON',
  `zytc` varchar(50) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '专业特长',
  `zzmm` varchar(50) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '政治面貌',
  `sbdw` varchar(50) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '报送单位',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

/*Data for the table `t_mzyw_azc_bdxx` */

insert  into `t_mzyw_azc_bdxx`(`id`,`bdsj`,`cjsj`,`cjyh`,`csny`,`fyfs`,`jg`,`jkzg`,`jz`,`jzdz`,`lxdh`,`qtzyyx`,`rwdd`,`rwqhkxx`,`rwsj`,`rwtzbh`,`sbsfzhm`,`sfcjmfpx`,`sffctz`,`sgjl`,`twsj`,`tybdmc`,`tyssflqtyj`,`tyzjbh`,`whcd`,`xb`,`xm`,`xxmc`,`yxbs`,`zcbs`,`zhxgsj`,`zhxgyh`,`zyjyhjnpxxx`,`zytc`,`zzmm`,`sbdw`) values ('2c9081e66373133c0163731d5e3c0000','2018-01-16','2015-12-12','安置处','1992-03-12','现役','安徽省合肥市','良好','陆军','瑶海区磨店乡','15956943306','特警','安徽省合肥市','农村','2018-05-12','001','341613199112133360','是','否','否','2019-12-16','陆军五旅','是','001001','本科','男','张三','安职','0','已报送','2015-05-25','刘鹗','[{\"zy\":\"医学\",\"xz\":\"5\"}]','计算机','党员','庐阳区民政局'),('2c9081e66373133c0163731d5e3c0001','2018-01-16','2015-12-12','安置处','1992-03-12','现役','安徽省合肥市','良好','陆军','瑶海区磨店乡','15956943306','特警','安徽省合肥市','农村','2018-05-12','002','341613199112133360','否','是','否','2019-12-16','陆军五旅','是','002002','本科','男','李四','安广','0','未报送','2015-05-25','刘鹗','[{\"zy\":\"医学\",\"xz\":\"5\"}]','计算机','党员','瑶海区民政局'),('2c9081e66373133c0163731d5e3c0002','2018-01-16','2015-12-12','安置处','1992-03-12','现役','安徽省合肥市','良好','陆军','瑶海区磨店乡','15956943306','特警','安徽省合肥市','农村','2018-05-12','003','341613199112133360','是','否','否','2019-12-16','陆军五旅','是','003003','本科','男','王仁','安广','0','已报送','2015-05-25','刘鹗','[{\"zy\":\"医学\",\"xz\":\"5\"}]','计算机','党员','蜀山区民政局'),('2c9081e66373133c0163731d5e3c0003','2018-01-16','2015-12-12','安置处','1992-03-12','现役','安徽省合肥市','良好','陆军','瑶海区磨店乡','15956943306','特警','安徽省合肥市','农村','2018-05-12','004','341613199112133360','否','是','否','2019-12-16','陆军五旅','是','004004','本科','男','刘丽','安职','0','已报送','2015-05-25','刘鹗','[{\"zy\":\"医学\",\"xz\":\"5\"}]','计算机','党员','包河区民政局'),('2c9081e66373133c0163731d5e3c0004','2018-01-16','2015-12-12','安置处','1992-03-12','现役','安徽省合肥市','良好','陆军','瑶海区磨店乡','15956943306','特警','安徽省合肥市','农村','2018-05-12','005','341613199112133360','是','是','否','2019-12-16','陆军五旅','是','005005','本科','男','阿伊','安职','0','已报送','2015-05-25','刘鹗','[{\"zy\":\"医学\",\"xz\":\"5\"}]','计算机','党员','肥东县民政局'),('2c9081e66373133c0163731d5e3c0005','2018-01-16','2015-12-12','安置处','1992-03-12','现役','安徽省合肥市','良好','陆军','瑶海区磨店乡','15956943306','特警','安徽省合肥市','农村','2018-05-12','006','341613199112133360','否','否','否','2019-12-16','陆军五旅','是','006006','本科','男','史蒂夫','安广','0','已报送','2015-05-25','刘鹗','[{\"zy\":\"医学\",\"xz\":\"5\"}]','计算机','党员','肥东县民政局');

/*Table structure for table `t_mzyw_azc_xxhzypz` */

DROP TABLE IF EXISTS `t_mzyw_azc_xxhzypz`;

CREATE TABLE `t_mzyw_azc_xxhzypz` (
  `id` varchar(32) COLLATE utf8_unicode_ci NOT NULL,
  `cjsj` varchar(14) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '创建时间',
  `cjyh` varchar(100) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '创建用户',
  `pzfj` mediumtext COLLATE utf8_unicode_ci COMMENT '配置附加(专业名称+学制)JSON',
  `pzmc` varchar(100) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '配置名称',
  `yxbs` varchar(50) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '有效标识',
  `zhxgsj` varchar(14) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '最后修改时间',
  `zhxgyh` varchar(100) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '最后修改用户',
  `status` varchar(40) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '下发状态',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

/*Data for the table `t_mzyw_azc_xxhzypz` */

insert  into `t_mzyw_azc_xxhzypz`(`id`,`cjsj`,`cjyh`,`pzfj`,`pzmc`,`yxbs`,`zhxgsj`,`zhxgyh`,`status`) values ('1','2018-01-15','李四','[{\"zy\": \"软件技术\", \"xz\":\"3\"},{\"zy\": \"计算机技术\", \"xz\":\"3\"},{\"zy\": \"通信技术\", \"xz\":\"3\"}]','安徽职业技术学院','0','2018-05-17','张三','已下发'),('2','2018-02-23','王五','[{\"zy\": \"软件技术\", \"xz\":\"3\"},{\"zy\": \"计算机技术\", \"xz\":\"3\"},{\"zy\": \"通信技术\", \"xz\":\"3\"}]','安徽广播技术学院','0','2018-04-25','赵六','已下发'),('2c9081e66373133c0163731d5e3c0000','2018-05-18','root','[{\"zy\":\"医学\",\"xz\":\"5\"}]','同济大学','0','2018-05-19','root','未下发'),('3','2018-02-23','王五','[{\"zy\": \"软件技术\", \"xz\":\"3\"},{\"zy\": \"计算机技术\", \"xz\":\"3\"},{\"zy\": \"通信技术\", \"xz\":\"3\"}]','安徽城市管理学院','0','2018-04-25','赵六','未下发'),('4','2018-02-23','王五','[{\"zy\": \"软件技术\", \"xz\":\"3\"},{\"zy\": \"计算机技术\", \"xz\":\"3\"},{\"zy\": \"通信技术\", \"xz\":\"3\"}]','合肥幼儿师范学院','0','2018-04-25','张三','已下发'),('4028b39b63721515016372162d900000','2018-05-18','root','[{\"zy\":\"软件\",\"xz\":\"5\"},{\"zy\":\"软件\",\"xz\":\"5\"},{\"zy\":\"软件\",\"xz\":\"5\"}]','中国科技大学','0',NULL,NULL,'未下发'),('5','2018-02-23','王五','[{\"zy\": \"软件技术\", \"xz\":\"3\"},{\"zy\": \"计算机技术\", \"xz\":\"3\"},{\"zy\": \"通信技术\", \"xz\":\"3\"}]','合肥学院','0','2018-04-25','赵六','未下发'),('6','2018-02-23','王五','[{\"zy\": \"软件技术\", \"xz\":\"3\"},{\"zy\": \"计算机技术\", \"xz\":\"3\"},{\"zy\": \"通信技术\", \"xz\":\"3\"}]','安徽国防科技大学','0','2018-04-25','张三','未下发'),('7','2018-02-23','王五','[{\"zy\": \"软件技术\", \"xz\":\"3\"},{\"zy\": \"计算机技术\", \"xz\":\"3\"},{\"zy\": \"通信技术\", \"xz\":\"3\"}]','合肥工业大学','0','2018-04-25','张三','已下发');

/*Table structure for table `t_mzyw_bnb` */

DROP TABLE IF EXISTS `t_mzyw_bnb`;

CREATE TABLE `t_mzyw_bnb` (
  `id` varchar(255) COLLATE utf8_unicode_ci NOT NULL,
  `bjqk` varchar(100) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '办结情况',
  `bjsj` varchar(16) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '办结时间',
  `bnbjbqk` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '不能办基本情况',
  `bnbyy` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '不能办原因',
  `bz` varchar(100) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '备注',
  `cjsj` varchar(14) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '创建时间',
  `cjyh` varchar(100) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '创建用户',
  `kcsyj` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '科处室意见',
  `ldyj` varchar(200) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '领导意见',
  `sbdw` varchar(100) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '上报单位',
  `sbdwmc` varchar(200) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '上报单位名称',
  `xxbt` varchar(20) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '信息标题',
  `yxbs` varchar(50) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '有效标识',
  `zcbs` varchar(50) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '暂存报送',
  `zhxgsj` varchar(14) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '最后修改时间',
  `zhxgyh` varchar(100) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '最后修改用户',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

/*Data for the table `t_mzyw_bnb` */

insert  into `t_mzyw_bnb`(`id`,`bjqk`,`bjsj`,`bnbjbqk`,`bnbyy`,`bz`,`cjsj`,`cjyh`,`kcsyj`,`ldyj`,`sbdw`,`sbdwmc`,`xxbt`,`yxbs`,`zcbs`,`zhxgsj`,`zhxgyh`) values ('4028a9d26362979b0163629847630000','','','','','','2015-01-23',NULL,'','','民政部','HeifeiYaohai',NULL,NULL,'未报送','','root'),('4028a9d26362a3dc016362a46cf60000','sssss ','2017-05-18','wwwww','sss','ss','2015-01-23',NULL,'ss','sss','民政部','HeifeiYaohai',NULL,NULL,'未报送','2016-05-31','root'),('4028a9d26362a890016362a909620000','dfgd','2018-05-03','fdgd','dfgd','fdgd','2015-12-23',NULL,'dfgd','fdgd','民政部','HeifeiYaohai',NULL,NULL,'未报送','2018-05-09','root'),('4028a9d26362a890016362aa669b0001','q','2018-05-21','q','q','q','2009-12-13',NULL,'q','q','社会事务处','HeifeiYaohai',NULL,NULL,'未报送','2015-05-28','root'),('4028a9d26362c4a4016362c567660000','dddd','2016-05-25','ddd','dddasdad','ddd','2009-12-13',NULL,'ddd','dddd','民政部','HeifeiYaohai',NULL,NULL,'已报送','2018-05-02','root'),('4028a9d26362c4a4016362c567aa0001','dddd','2015-05-25','dddkkkk','ddd','ddd2588','2009-12-13',NULL,'ddd','dddd','民政部','HeifeiYaohai',NULL,NULL,'未报送','2018-05-02','root'),('4028a9d26367e1ed016367e29cbf0000','dsad','2018-05-18','adsjkafa','sda','asdad','2018-5-16',NULL,'asda','asda','民政部','HeifeiYaohai',NULL,NULL,'未报送','2018-05-02','root');

/*Table structure for table `t_mzyw_dcb_pxbzjf` */

DROP TABLE IF EXISTS `t_mzyw_dcb_pxbzjf`;

CREATE TABLE `t_mzyw_dcb_pxbzjf` (
  `id` varchar(255) COLLATE utf8_unicode_ci NOT NULL,
  `bjdwmc` varchar(100) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '颁奖单位名称',
  `bsdw` varchar(100) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '报送单位',
  `bssj` varchar(100) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '报送时间',
  `bzsj` varchar(100) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '表彰时间',
  `cjsj` varchar(100) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '创建时间',
  `cjyh` varchar(100) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '创建用户',
  `hjmc` varchar(100) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '获奖名称',
  `yxbs` varchar(50) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '有效标识',
  `zcbs` varchar(50) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '暂存报送',
  `zhxgsj` varchar(100) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '最后修改时间',
  `zhxgyh` varchar(100) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '最后修改用户',
  `zpjf` varchar(100) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '自评加分',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

/*Data for the table `t_mzyw_dcb_pxbzjf` */

insert  into `t_mzyw_dcb_pxbzjf`(`id`,`bjdwmc`,`bsdw`,`bssj`,`bzsj`,`cjsj`,`cjyh`,`hjmc`,`yxbs`,`zcbs`,`zhxgsj`,`zhxgyh`,`zpjf`) values ('1','法宣办','社会救助处','2018-01-01','2018-01-18','2018-01-01','张三','党员','0','1','2018-01-12','李四','81'),('2','法宣办','社会救助处','2018-02-20','2018-02-20','2018-02-20','王五','先进党员','0','1','2018-02-25','李四','70'),('3','法宣办','法宣办','2018-02-20','2018-02-20','2018-02-02','田七','超级好市民','0','0','2018-05-12','李四','80'),('4','法宣办','法宣办','2018-02-20','2018-02-20','2018-02-02','田七','良民','0','1','2018-05-12','李四','80'),('7','法宣办','社会救助处','2018-03-22','2018-03-22','2018-03-22','张强','志愿者','0','1','2018-04-02','王晓磊','79');

/*Table structure for table `t_mzyw_dcb_xcbdjf` */

DROP TABLE IF EXISTS `t_mzyw_dcb_xcbdjf`;

CREATE TABLE `t_mzyw_dcb_xcbdjf` (
  `id` varchar(100) COLLATE utf8_unicode_ci NOT NULL COMMENT 'id',
  `bsdw` varchar(100) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '报送单位',
  `bzkwmtwzmc` varchar(100) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '报纸、刊物、媒体、网站名称',
  `kysj` varchar(100) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '刊用时间',
  `bdlx` varchar(100) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '报道类型',
  `xwbt` varchar(100) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '新闻标题',
  `zz` varchar(100) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '作者',
  `bz` varchar(100) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '备注',
  `bssj` varchar(100) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '报送时间',
  `zcbs` varchar(100) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '暂存报送',
  `yxbs` varchar(100) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '有效标识',
  `cjyh` varchar(100) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '创建用户',
  `cjsj` varchar(100) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '创建时间',
  `zhxgyh` varchar(100) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '最后修改用户',
  `zhxgsj` varchar(100) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '最后修改时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

/*Data for the table `t_mzyw_dcb_xcbdjf` */

insert  into `t_mzyw_dcb_xcbdjf`(`id`,`bsdw`,`bzkwmtwzmc`,`kysj`,`bdlx`,`xwbt`,`zz`,`bz`,`bssj`,`zcbs`,`yxbs`,`cjyh`,`cjsj`,`zhxgyh`,`zhxgsj`) values ('1','法宣办','报纸','2018-01-01','通讯','最好的未来','张三','年轻小伙','2018-02-02','1','1','李四','2018-04-21','李四','2018-04-21'),('2','社会救助处','网站','2018-01-01','通讯','最好的未来','张三','年轻小伙','2018-02-02','1','1','李四','2018-04-21','李四','2018-04-21'),('3','法宣办','报纸','2018-01-01','通讯','好好学习','李四','帅小伙','2018-02-02','0','1','李四','2018-04-21','李四','2018-04-21'),('4','社会救助处','报纸','2018-02-02','通讯','好好学习','李四','帅小伙','2018-02-02','0','1','李四','2018-04-21','李四','2018-04-21');

/*Table structure for table `t_mzyw_dcb_zhpfwh` */

DROP TABLE IF EXISTS `t_mzyw_dcb_zhpfwh`;

CREATE TABLE `t_mzyw_dcb_zhpfwh` (
  `id` varchar(255) COLLATE utf8_unicode_ci NOT NULL,
  `bzxc` smallint(6) DEFAULT NULL COMMENT '表彰宣传',
  `cjsj` varchar(14) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '创建时间',
  `cjyh` varchar(100) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '创建用户',
  `cxld` smallint(6) DEFAULT NULL COMMENT '创新亮点',
  `dw` varchar(100) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '单位',
  `dwlx` varchar(50) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '单位类型',
  `dwmc` varchar(200) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '单位名称',
  `hj` smallint(6) DEFAULT NULL COMMENT '合计',
  `jndf` smallint(6) DEFAULT NULL COMMENT '基本得分',
  `mc` int(11) DEFAULT NULL COMMENT '名次',
  `ssnd` varchar(4) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '所属年度',
  `sspc` float DEFAULT NULL COMMENT '所属批次',
  `zhxgsj` varchar(14) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '最后修改时间',
  `zhxgyh` varchar(100) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '最后修改用户',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

/*Data for the table `t_mzyw_dcb_zhpfwh` */

/*Table structure for table `t_mzyw_fcc_sqylfwss` */

DROP TABLE IF EXISTS `t_mzyw_fcc_sqylfwss`;

CREATE TABLE `t_mzyw_fcc_sqylfwss` (
  `id` varchar(255) COLLATE utf8_unicode_ci NOT NULL,
  `cjsj` varchar(14) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '创建时间',
  `cjyh` varchar(100) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '创建用户',
  `dz` varchar(100) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '地址',
  `jzmj` varchar(10) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '建筑面积',
  `kfsjap` varchar(200) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '开放时间安排',
  `lxdh` varchar(20) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '联系电话',
  `lxr` varchar(50) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '联系人',
  `mc` varchar(100) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '名称',
  `sbdw` varchar(100) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '上报单位',
  `sbdwmc` varchar(200) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '上报单位名称',
  `xqjbqk` varchar(200) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '辖区基本情况',
  `yxbs` varchar(50) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '有效标识',
  `zcbs` varchar(50) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '暂存报送',
  `zhxgsj` varchar(14) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '最后修改时间',
  `zhxgyh` varchar(100) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '最后修改用户',
  `zygn` varchar(100) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '主要功能',
  `bszt` varchar(1) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '报送状态',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

/*Data for the table `t_mzyw_fcc_sqylfwss` */

/*Table structure for table `t_mzyw_fcc_yljgxx` */

DROP TABLE IF EXISTS `t_mzyw_fcc_yljgxx`;

CREATE TABLE `t_mzyw_fcc_yljgxx` (
  `id` varchar(255) COLLATE utf8_unicode_ci NOT NULL,
  `bz` varchar(100) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '备注',
  `cj` mediumint(9) DEFAULT NULL COMMENT '初级',
  `cjsj` varchar(14) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '创建时间',
  `cjyh` varchar(100) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '创建用户',
  `cw` mediumint(9) DEFAULT NULL COMMENT '财务',
  `djpd` varchar(20) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '等级评定',
  `dz` varchar(100) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '地址',
  `fwdxlx` varchar(20) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '服务对象类型',
  `fwxz` varchar(20) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '房屋性质',
  `fyz` mediumint(9) DEFAULT NULL COMMENT '副院长',
  `gj` mediumint(9) DEFAULT NULL COMMENT '高级',
  `hs` mediumint(9) DEFAULT NULL COMMENT '护士',
  `js` mediumint(9) DEFAULT NULL COMMENT '技师',
  `lxdh` varchar(20) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '联系电话',
  `lxr` varchar(50) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '联系人',
  `mc` varchar(100) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '名称',
  `ryczsgl` int(11) DEFAULT NULL COMMENT '人员持证上岗率',
  `rzl` int(11) DEFAULT NULL COMMENT '入住率',
  `sbdw` varchar(100) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '上报单位',
  `sbdwmc` varchar(200) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '上报单位名称',
  `sg` mediumint(9) DEFAULT NULL COMMENT '社工',
  `xlzxs` mediumint(9) DEFAULT NULL COMMENT '心理咨询师',
  `ys` mediumint(9) DEFAULT NULL COMMENT '医生',
  `yxbs` varchar(50) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '有效标识',
  `yz` mediumint(9) DEFAULT NULL COMMENT '院长',
  `zcbs` varchar(50) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '暂存报送',
  `zcglry` mediumint(9) DEFAULT NULL COMMENT '中层管理人员',
  `zcws` int(11) DEFAULT NULL COMMENT '总床位数',
  `zhxgsj` varchar(14) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '最后修改时间',
  `zhxgyh` varchar(100) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '最后修改用户',
  `bszt` varchar(1) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '报送状态',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

/*Data for the table `t_mzyw_fcc_yljgxx` */

insert  into `t_mzyw_fcc_yljgxx`(`id`,`bz`,`cj`,`cjsj`,`cjyh`,`cw`,`djpd`,`dz`,`fwdxlx`,`fwxz`,`fyz`,`gj`,`hs`,`js`,`lxdh`,`lxr`,`mc`,`ryczsgl`,`rzl`,`sbdw`,`sbdwmc`,`sg`,`xlzxs`,`ys`,`yxbs`,`yz`,`zcbs`,`zcglry`,`zcws`,`zhxgsj`,`zhxgyh`,`bszt`) values ('1','模型数据',123,'2015-05-04','张三',10,'一级','安徽职业技术学院','孤寡老人','居民房',1,2,3,4,'18709858069','杨韬','春田花花养老院',80,80,'中华人民共和国','中华人民共和国',10,3,10,'000',1,'01',20,2000,'2018/5/13','张三','1');

/*Table structure for table `t_mzyw_fck_file_resource` */

DROP TABLE IF EXISTS `t_mzyw_fck_file_resource`;

CREATE TABLE `t_mzyw_fck_file_resource` (
  `id` varchar(255) COLLATE utf8_unicode_ci NOT NULL,
  `scsj` varchar(14) COLLATE utf8_unicode_ci NOT NULL COMMENT '上传时间',
  `sjlj` varchar(100) COLLATE utf8_unicode_ci NOT NULL COMMENT '上级路径',
  `wjdx` float NOT NULL COMMENT '文件大小',
  `wjlj` varchar(255) COLLATE utf8_unicode_ci NOT NULL COMMENT '文件路径',
  `wjlx` varchar(100) COLLATE utf8_unicode_ci NOT NULL COMMENT '文件类型',
  `wjm` varchar(255) COLLATE utf8_unicode_ci NOT NULL COMMENT '文件名',
  `wjnr` blob COMMENT '文件内容',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

/*Data for the table `t_mzyw_fck_file_resource` */

/*Table structure for table `t_mzyw_fjxx` */

DROP TABLE IF EXISTS `t_mzyw_fjxx`;

CREATE TABLE `t_mzyw_fjxx` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `cjsj` varchar(14) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '创建时间',
  `fjdx` float DEFAULT NULL COMMENT '附件大小',
  `fjhzm` varchar(10) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '附件后缀名',
  `fjmc` varchar(200) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '附件名称',
  `fjnr` blob COMMENT '附件内容',
  `ysbmc` varchar(20) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '映射表表名',
  `ysbxxid` varchar(32) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '映射表信息ID',
  `zt` varchar(1) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '关联状态',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

/*Data for the table `t_mzyw_fjxx` */

/*Table structure for table `t_mzyw_fxb` */

DROP TABLE IF EXISTS `t_mzyw_fxb`;

CREATE TABLE `t_mzyw_fxb` (
  `id` varchar(255) COLLATE utf8_unicode_ci NOT NULL,
  `cjsj` varchar(14) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '创建时间',
  `cjyh` varchar(100) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '创建用户',
  `cyqk` varchar(50) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '采用情况',
  `fgld` varchar(100) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '分管领导',
  `gc` float DEFAULT NULL COMMENT '稿酬',
  `jbrq` varchar(80) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '见报日期',
  `lm` varchar(50) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '栏目',
  `lmmc` varchar(100) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '栏目名称',
  `qs` varchar(50) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '期数',
  `sbdw` varchar(100) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '上报单位',
  `sbdwmc` varchar(200) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '上报单位名称',
  `sbry` varchar(100) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '上报人员',
  `sbrymc` varchar(200) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '上报人员名称',
  `xxbt` varchar(100) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '信息标题',
  `xxzw` mediumtext COLLATE utf8_unicode_ci COMMENT '信息正文',
  `yxbs` varchar(50) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '有效标识',
  `zcbs` varchar(50) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '暂存报送',
  `zhxgsj` varchar(14) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '最后修改时间',
  `zhxgyh` varchar(100) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '最后修改用户',
  `zz` varchar(100) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '作者',
  `shjg` varchar(100) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '审核结果',
  `tjzt` varchar(100) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '提交状态',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

/*Data for the table `t_mzyw_fxb` */

insert  into `t_mzyw_fxb`(`id`,`cjsj`,`cjyh`,`cyqk`,`fgld`,`gc`,`jbrq`,`lm`,`lmmc`,`qs`,`sbdw`,`sbdwmc`,`sbry`,`sbrymc`,`xxbt`,`xxzw`,`yxbs`,`zcbs`,`zhxgsj`,`zhxgyh`,`zz`,`shjg`,`tjzt`) values ('1','123','123','123','123',123,'2015-03-23','123','0','123','123','123','123','法宣办(机关党委）员）委)','123456','','123','未报送','2018-03-25','123','123','0','0'),('2','123','123','123','123',123,'2008-04-23','123','1','123','123','123','123','社会救助处','123',NULL,'123','已报送','2017-01-03','123','123','0','2'),('3','123','123','123','123',123,'2010-08-23','123','1','123','123','123','123','基层政权处','123',NULL,'123','已报送','2016-03-23','123','123','0','0'),('4','123','123','123','123',123,'2010-08-23','123','1','123','123','123','123','123','123',NULL,'123','已报送','2016-03-23','123','123','0','0');

/*Table structure for table `t_mzyw_jssz` */

DROP TABLE IF EXISTS `t_mzyw_jssz`;

CREATE TABLE `t_mzyw_jssz` (
  `id` varchar(255) COLLATE utf8_unicode_ci NOT NULL,
  `bm` varchar(100) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '部门',
  `cjsj` varchar(14) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '创建时间',
  `cjyh` varchar(100) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '创建用户',
  `js` varchar(100) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '基数',
  `ssnd` varchar(100) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '所属年度',
  `yxbs` varchar(50) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '有效标识',
  `zhxgsj` varchar(14) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '最后修改时间',
  `zhxgyh` varchar(100) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '最后修改用户',
  `bmmc` varchar(200) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '部门名称',
  `tzggzw` varchar(200) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '部门名称',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

/*Data for the table `t_mzyw_jssz` */

insert  into `t_mzyw_jssz`(`id`,`bm`,`cjsj`,`cjyh`,`js`,`ssnd`,`yxbs`,`zhxgsj`,`zhxgyh`,`bmmc`,`tzggzw`) values ('1','123','13','123','4','123','123','2015-01-30','123','法宣办(机关党委)员)委)',NULL),('2','123','123','123','23','123','123','2015-08-23','123','社会救助处',NULL),('3','123','123','123','16','123','123','2007-10-23','123','基层政权处',NULL);

/*Table structure for table `t_mzyw_sczy` */

DROP TABLE IF EXISTS `t_mzyw_sczy`;

CREATE TABLE `t_mzyw_sczy` (
  `id` varchar(255) COLLATE utf8_unicode_ci NOT NULL,
  `cclx` varchar(50) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '存储类型[0-数据库存储,\n       1-文件存储]',
  `ccqlj` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '存储全路径',
  `glbmc` varchar(50) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '关联表名称',
  `glbxxdm` varchar(32) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '关联表信息代码',
  `glywdm` varchar(50) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '关联业务代码',
  `ljlx` varchar(200) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '路径类型[0-相对路径,\n       1-物理路径]',
  `scsj` varchar(14) COLLATE utf8_unicode_ci NOT NULL COMMENT '上传时间',
  `wjdx` float NOT NULL COMMENT '文件大小',
  `wjlx` varchar(50) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '文件类型',
  `wjm` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '文件名',
  `wjnr` blob COMMENT '文件内容',
  `ysbs` varchar(50) COLLATE utf8_unicode_ci NOT NULL COMMENT '有效标识',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

/*Data for the table `t_mzyw_sczy` */

/*Table structure for table `t_mzyw_sczy_pz` */

DROP TABLE IF EXISTS `t_mzyw_sczy_pz`;

CREATE TABLE `t_mzyw_sczy_pz` (
  `id` varchar(255) COLLATE utf8_unicode_ci NOT NULL,
  `cclj` varchar(100) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '存储路径',
  `cclx` varchar(50) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '存储类型[0-数据库存储,\n       1-文件存储]',
  `flmc` varchar(50) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '分类名称',
  `ljlx` varchar(50) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '路径类型[0-相对路径,\n       1-物理路径]',
  `lxfgf` varchar(50) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '类型分隔符',
  `mcjp` varchar(50) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '名称简拼',
  `scdxxz` float DEFAULT NULL COMMENT '上传大小限制',
  `sclx` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '上传类型',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

/*Data for the table `t_mzyw_sczy_pz` */

/*Table structure for table `t_mzyw_shswc_mzxx` */

DROP TABLE IF EXISTS `t_mzyw_shswc_mzxx`;

CREATE TABLE `t_mzyw_shswc_mzxx` (
  `id` varchar(255) COLLATE utf8_unicode_ci NOT NULL,
  `cjsj` varchar(14) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '创建时间',
  `cjyh` varchar(100) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '创建用户',
  `gmrq` varchar(8) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '购墓日期',
  `hzxx` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '合葬信息(身份证号码+姓名)JSON',
  `jbrlxdh` varchar(50) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '经办人联系电话',
  `jbrsfzhm` varchar(18) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '经办人身份证号码',
  `jbrxm` varchar(50) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '经办人姓名',
  `mxqymc` varchar(50) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '墓穴区域名称',
  `ssxx` varchar(50) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '葬式选择',
  `szhhrq` varchar(10) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '墓穴价格',
  `szhjd` varchar(100) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '逝者户籍地',
  `szsfzhm` varchar(18) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '逝者身份证号码',
  `szxm` varchar(50) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '逝者姓名',
  `yxbs` varchar(50) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '有效标识',
  `zcbs` varchar(50) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '暂存报送',
  `zhxgsj` varchar(14) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '最后修改时间',
  `zhxgyh` varchar(100) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '最后修改用户',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

/*Data for the table `t_mzyw_shswc_mzxx` */

/*Table structure for table `t_mzyw_shswc_szxx` */

DROP TABLE IF EXISTS `t_mzyw_shswc_szxx`;

CREATE TABLE `t_mzyw_shswc_szxx` (
  `id` varchar(32) COLLATE utf8_unicode_ci NOT NULL,
  `cjsj` varchar(14) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '创建时间',
  `cjyh` varchar(100) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '创建用户',
  `jbrlxdh` varchar(50) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '经办人联系电话',
  `jbrsfzhm` varchar(18) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '经办人身份证号码',
  `jbrxm` varchar(50) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '经办人姓名',
  `szhjd` varchar(100) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '逝者户籍地',
  `szsfzhm` varchar(18) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '逝者身份证号码',
  `szxm` varchar(50) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '逝者姓名',
  `yxbs` varchar(50) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '有效标识',
  `zcbs` varchar(50) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '暂存报送',
  `zhxgsj` varchar(14) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '最后修改时间',
  `zhxgyh` varchar(100) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '最后修改用户',
  `bygnytlcfy` int(11) DEFAULT NULL COMMENT '殡仪馆内遗体冷藏费用',
  `ghcffy` int(11) DEFAULT NULL COMMENT '骨灰存放费用',
  `ptclytjyf` int(11) DEFAULT NULL COMMENT '普通车辆遗体接运费',
  `ptgbtfy` int(11) DEFAULT NULL COMMENT '普通告别厅费用',
  `ptghh` int(11) DEFAULT NULL COMMENT '普通骨灰盒',
  `pthhlhhf` int(11) DEFAULT NULL COMMENT '普通火化炉火化费',
  `sfxzjz` varchar(50) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '是否选择江葬',
  `szhhrq` varchar(10) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '逝者火化日期',
  `szhjdmc` varchar(100) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '逝者户籍地名称',
  `szswyy` varchar(50) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '逝者死亡原因',
  `ytrgrq` varchar(10) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '遗体入馆日期',
  `zdjzdx` varchar(50) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '重点救助对象',
  `bygmc` varchar(50) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '殡仪馆名称',
  `ptguh` int(11) DEFAULT NULL COMMENT '普通骨灰盒',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

/*Data for the table `t_mzyw_shswc_szxx` */

insert  into `t_mzyw_shswc_szxx`(`id`,`cjsj`,`cjyh`,`jbrlxdh`,`jbrsfzhm`,`jbrxm`,`szhjd`,`szsfzhm`,`szxm`,`yxbs`,`zcbs`,`zhxgsj`,`zhxgyh`,`bygnytlcfy`,`ghcffy`,`ptclytjyf`,`ptgbtfy`,`ptghh`,`pthhlhhf`,`sfxzjz`,`szhhrq`,`szhjdmc`,`szswyy`,`ytrgrq`,`zdjzdx`,`bygmc`,`ptguh`) values ('2c9081b96376450701637648b1750000','2018-05-19','1','15955468544','330227198702102212','小张三','安徽省合肥市蜀山区','330227198702102211','张三','0','1','2018-05-19','1',1000,500,500,5000,500,500,'0','2015-10-10',NULL,'0','2015-10-10','2','0',NULL),('2c9081b963764ab40163764f41e90000','2018-05-19','1','17655486544','210102199808027626','肖芳安','辽宁省沈阳市','210102199808027627','方安','0','0','2018-05-19','1',1500,500,500,3500,400,200,'0','2010-05-06',NULL,'0','2010-05-05','0','0',NULL),('2c9081b963764ab401637653e4bb0001','2018-05-19','1','18655497756','410901198909295950','小张浩','河南省濮阳市','410901198909295970','张浩','0','0','2018-05-19','1',1500,350,500,3500,400,255,'0','2008-09-03',NULL,'0','2008-09-01','0','0',NULL),('2c9081b9637658820163765a6ad70000','2018-05-19','1','17655488664','532700198101142403','小范青','云南省思茅地区','532700198101142404','范青','0','0','2018-05-19','1',255,350,350,2000,400,200,'1','2009-05-14',NULL,'0','2009-05-13','1','0',NULL),('2c9081b9637658820163765d5af70001','2018-05-19','1','18655495543','420222197907088695','小谭章','湖北省黄石市','420222197907088696','谭章','0','0','2018-05-19','1',650,450,500,1500,255,400,'1','2009-11-10',NULL,'0','2009-11-10','3','0',NULL),('2c9081b9637658820163765ff9fd0002','2018-05-19','1','18655475543','110228197001107265','小刘云','北京市密云县','110228197001107278','刘天','0','1','2018-05-19','1',255,500,350,2000,300,500,'1','2011-05-13',NULL,'1','2011-05-13','3','0',NULL),('2c9081b963765882016376616e220003','2018-05-19','1','15955466344','360421199203151120','小宁河','江西省九江市','360421199203151121','宁河','0','1','2018-05-19','1',1500,200,500,3500,300,200,'1','2016-05-06',NULL,'1','2016-05-06','1','1',NULL),('2c9081b96376588201637663329b0004','2018-05-19','1','15955454486','430781199910060132','小叶海','湖南省常德市','430781199910060131','叶海','0','1','2018-05-19','1',650,500,350,1500,300,500,'0','2015-10-10',NULL,'0','2015-10-8','2','0',NULL),('4028a9d26362979b0163629847630002','2018-02-10','admin','15955468822','330227199609092255','小王五','合肥市庐阳区','330227199609092254','王五','0','0','2018-05-19','1',2000,300,400,400,400,400,'0','2018-02-18',NULL,'0','2018-02-16','0','1',NULL),('4028a9d26362979b0163629847630003','2018-02-10','admin','18655498862','330227199609092254','小李四','合肥市瑶海区','330227199609092251','李四','0','1','2018-05-19','1',1500,200,1000,500,300,500,'0','2018-04-12',NULL,'0','2018-04-11','0','1',NULL);

/*Table structure for table `t_mzyw_shswc_ytwy` */

DROP TABLE IF EXISTS `t_mzyw_shswc_ytwy`;

CREATE TABLE `t_mzyw_shswc_ytwy` (
  `id` varchar(255) COLLATE utf8_unicode_ci NOT NULL,
  `cjsj` varchar(14) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '创建时间',
  `cjyh` varchar(100) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '创建用户',
  `sqrlxdh` varchar(50) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '申请人联系电话',
  `sqrsfzhm` varchar(18) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '申请人身份证号码',
  `sqrxm` varchar(50) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '申请人姓名',
  `szhjd` varchar(100) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '逝者户籍地',
  `szsfzhm` varchar(18) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '逝者身份证号码',
  `szswyy` varchar(50) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '逝者死亡原因',
  `szxm` varchar(50) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '逝者姓名',
  `szytywd` varchar(100) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '逝者遗体运往地',
  `yxbs` varchar(50) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '有效标识',
  `zcbs` varchar(50) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '暂存报送',
  `zhxgsj` varchar(14) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '最后修改时间',
  `zhxgyh` varchar(100) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '最后修改用户',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

/*Data for the table `t_mzyw_shswc_ytwy` */

/*Table structure for table `t_mzyw_tzgg` */

DROP TABLE IF EXISTS `t_mzyw_tzgg`;

CREATE TABLE `t_mzyw_tzgg` (
  `id` varchar(255) COLLATE utf8_unicode_ci NOT NULL,
  `cjsj` varchar(14) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '创建时间',
  `cjyh` varchar(100) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '创建用户',
  `fbchmc` varchar(200) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '发布处室名称',
  `fbcs` varchar(100) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '发布处室',
  `fbsj` varchar(14) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '发布时间',
  `tzggbt` varchar(100) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '通知公告标题',
  `tzggzt` varchar(50) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '通知公告状态',
  `tzggzw` mediumtext COLLATE utf8_unicode_ci COMMENT '通知公告正文',
  `yxbs` varchar(50) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '有效标识',
  `zhxgsj` varchar(14) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '最后修改时间',
  `zhxgyh` varchar(100) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '最后修改用户',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

/*Data for the table `t_mzyw_tzgg` */

insert  into `t_mzyw_tzgg`(`id`,`cjsj`,`cjyh`,`fbchmc`,`fbcs`,`fbsj`,`tzggbt`,`tzggzt`,`tzggzw`,`yxbs`,`zhxgsj`,`zhxgyh`) values ('1',NULL,NULL,'法宣办',NULL,'2015-12-12','小活动','已发布',NULL,NULL,NULL,NULL),('2',NULL,NULL,'法宣办',NULL,'2015-12-12','小活动','已发布','weqweqweqweq',NULL,NULL,NULL),('3',NULL,NULL,'法宣办',NULL,'2015-12-12','小活动','未发布',NULL,NULL,NULL,NULL),('4',NULL,NULL,'法宣办',NULL,'2015-12-12','小活动','未发布',NULL,NULL,NULL,NULL),('5',NULL,NULL,'法宣办',NULL,'2015-12-12','小活动','未发布',NULL,NULL,NULL,NULL);

/*Table structure for table `t_mzyw_zd` */

DROP TABLE IF EXISTS `t_mzyw_zd`;

CREATE TABLE `t_mzyw_zd` (
  `id` int(32) NOT NULL AUTO_INCREMENT,
  `dm` varchar(50) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '代码',
  `lxjp` varchar(100) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '类型简拼',
  `mc` varchar(100) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '名称',
  `px` varchar(100) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '排序',
  `sm` varchar(100) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '说明',
  `yxx` varchar(1) COLLATE utf8_unicode_ci NOT NULL DEFAULT '0' COMMENT '有效性',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=34 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

/*Data for the table `t_mzyw_zd` */

insert  into `t_mzyw_zd`(`id`,`dm`,`lxjp`,`mc`,`px`,`sm`,`yxx`) values (1,'submit','0','已报送','1','报送状态','0'),(2,'submit','1','未报送','2','报送状态','0'),(3,'tibetan','0','地上式墓穴','1','葬式名称','0'),(4,'tibetan','1','生态藏式','2','葬式名称','0'),(5,'tibetan','2','节地藏式','3','葬式名称','0'),(6,'shenhe','0','已采用','1','审核结果','0'),(7,'shenhe','1','未采用','2','审核结果','0'),(8,'tijiaozt','2','已提交未审核','1','提交状态','0'),(9,'tijiaozt','0','已提交已审核','2','提交状态','0'),(10,'tijiaozt','1','未提交','3','提交状态','0'),(11,'status','0','已下发','1','配置状态','0'),(12,'status','1','未下发','2','配置状态','0'),(13,'funeral','0','合肥市殡仪馆','1','殡仪馆名称','0'),(14,'funeral','1','瑶海区殡仪馆','2','殡仪馆名称','0'),(15,'lmmc','0','民政专版','1','栏目名称','0'),(16,'lmmc','1','民政信息','2','栏目名称','0'),(17,'lmmc','2','民政网站','3','栏目名称','0'),(18,'cause','0','正常','1','死亡原因','0'),(19,'cause','1','非正常','2','死亡原因','0'),(20,'succour','0','城乡低保','1','重点救助对象','0'),(21,'succour','1','农村五保','2','重点救助对象','0'),(22,'succour','2','重点优抚对','3','重点救助对象','0'),(23,'succour','3','非重点救助','4','重点救助对象','0'),(24,'choose','0','是','1','是否选择江葬','0'),(25,'choose','1','否','2','是否选择江葬','0'),(26,'bsdw','0','瑶海区民政局','1','合肥市各区县','0'),(27,'bsdw','1','庐阳区民政局','2','合肥市各区县','0'),(28,'bsdw','2','蜀山区民政局','3','合肥市各区县','0'),(29,'bsdw','3','包河区民政局','4','合肥市各区县','0'),(30,'sbdwmc','0','瑶海区民政局','1','报送单位','0'),(31,'sbdwmc','1','庐阳区民政局','2','报送单位','0'),(32,'sbdwmc','2','蜀山区民政局','3','报送单位','0'),(33,'sbdwmc','3','包河区民政局','4','报送单位','0');

/*Table structure for table `t_mzyw_zjcl` */

DROP TABLE IF EXISTS `t_mzyw_zjcl`;

CREATE TABLE `t_mzyw_zjcl` (
  `id` varchar(255) COLLATE utf8_unicode_ci NOT NULL,
  `cjsj` varchar(14) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '创建时间',
  `cllx` varchar(1) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '材料类型',
  `hh` varchar(50) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '户号',
  `qfjg` varchar(200) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '签发机构',
  `sfzhm` varchar(18) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '身份证号码',
  `xm` varchar(200) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '姓名',
  `ysbmc` varchar(20) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '映射表表名',
  `ysbxxid` varchar(32) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '映射表信息ID',
  `yxqxjssj` varchar(8) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '有效期限结束时间',
  `yxqxkssj` varchar(8) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '有效期限开始时间',
  `zt` varchar(1) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '关联状态',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

/*Data for the table `t_mzyw_zjcl` */

/*Table structure for table `user` */

DROP TABLE IF EXISTS `user`;

CREATE TABLE `user` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `department` varchar(20) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '所属部门',
  `name` varchar(20) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '登录用户名 ',
  `password` varchar(20) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '登录密码',
  `power` varchar(20) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '管理权限',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

/*Data for the table `user` */

insert  into `user`(`id`,`department`,`name`,`password`,`power`) values (1,'民政部','root','123456','管理员'),(2,'法宣办','1','1','管理员');

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
