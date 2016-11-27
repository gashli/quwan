
drop table if exists user_info;
CREATE TABLE `quwan`.`user_info` (
  `id` BIGINT(20) UNSIGNED NOT NULL AUTO_INCREMENT,
  `user_id` VARCHAR(15) NOT NULL DEFAULT '' COMMENT '用户id',
  `mobile` VARCHAR(15) NOT NULL DEFAULT '' COMMENT '用户手机号',
  `name` VARCHAR(10) NOT NULL DEFAULT '' COMMENT '姓名',
  `sex` SMALLINT(2) NOT NULL DEFAULT -1 COMMENT '性别：0：女，1：男',
  `birthday` VARCHAR(10) NOT NULL DEFAULT '' COMMENT '出生日期',
  `profession` VARCHAR(20) NOT NULL DEFAULT '' COMMENT '职业，对应',
  `income` DECIMAL(10,2) NOT NULL DEFAULT '0.00' COMMENT '收入',
  `academic` VARCHAR(20) NOT NULL DEFAULT '' COMMENT '学历',
  `finish_school` VARCHAR(100) NOT NULL DEFAULT '' COMMENT '毕业院校',
  `address` VARCHAR(100) NOT NULL DEFAULT '' COMMENT '当前所在地',
  `car_info` TINYINT(1) NOT NULL DEFAULT 0 COMMENT '是否有车，0：无，1：有',
  `car_model` VARCHAR(30) NOT NULL DEFAULT '' COMMENT '汽车型号',
  `house_info` TINYINT(1) NOT NULL DEFAULT 0 COMMENT '是否有房，0：无，1：有',
  `house_location` VARCHAR(50) NOT NULL DEFAULT '' COMMENT '房子位置',
  `create_time` TIMESTAMP NOT NULL DEFAULT '2000-01-01 00:00:00' COMMENT '创建时间',
  `update_time` TIMESTAMP NOT NULL DEFAULT '2000-01-01 00:00:00' COMMENT '更新时间',
  PRIMARY KEY (`id`),
  UNIQUE INDEX `unq_idx_user_id` (`user_id` ASC),
  UNIQUE INDEX `unq_idx_mobile` (`mobile` ASC),
  INDEX `idx_create_time` (`create_time` ASC)) COMMENT = '用户信息' ;

drop table if exists user_psersonal_info;
CREATE TABLE `quwan`.`user_psersonal_info` (
  `id` BIGINT(20) UNSIGNED NOT NULL AUTO_INCREMENT,
  `user_id` VARCHAR(15) NOT NULL DEFAULT '' COMMENT '用户id',
  `interest` VARCHAR(100) NOT NULL  DEFAULT '' COMMENT '兴趣爱好',
  `label` VARCHAR(100) NOT NULL  DEFAULT '' COMMENT '标签',
  `personal_sign` VARCHAR(200) NOT NULL  DEFAULT '' COMMENT '个性签名',
  `attention_ids` TEXT NOT NULL  DEFAULT '' COMMENT '关注的用户id列表',
  `interest_in_ids` VARCHAR(200)  DEFAULT '' COMMENT '可能感兴趣的用户id',
  `create_time`TIMESTAMP NOT NULL DEFAULT '2000-01-01 00:00:00' COMMENT '创建时间',
  `update_time`TIMESTAMP NOT NULL DEFAULT '2000-01-01 00:00:00' COMMENT '更新时间',
  PRIMARY KEY (`id`),
  UNIQUE INDEX `unq_idx_user_id` (`user_id` ASC),
  INDEX `idx_create_time` (`create_time` ASC)) COMMENT = '用户个性化特征' ;

drop table if exists show_blog;
CREATE TABLE `quwan`.`show_blog` (
  `id` BIGINT(20) UNSIGNED NOT NULL AUTO_INCREMENT,
  `user_id` VARCHAR(15) NOT NULL DEFAULT '' COMMENT '用户id',
  `message` VARCHAR(200) NOT NULL DEFAULT '' COMMENT 'blog内容',
  `picture_urls` VARCHAR(80) NOT NULL DEFAULT '' COMMENT '图片地址',
  `quwan_id` BIGINT(20) NOT NULL DEFAULT -1 COMMENT '去玩活动id',
  `support_times` MEDIUMINT(6) NOT NULL DEFAULT -1 COMMENT '被赞次数',
  `demean_times` MEDIUMINT(6) NOT NULL DEFAULT -1 COMMENT '被踩次数',
  `address` VARCHAR(100) NOT NULL DEFAULT '' COMMENT '动态发布时的地址',
  `create_time` TIMESTAMP NOT NULL DEFAULT '2000-01-01 00:00:00' COMMENT '创建时间',
  `update_time` TIMESTAMP NOT NULL DEFAULT '2000-01-01 00:00:00' COMMENT '更新时间',
  PRIMARY KEY (`id`),
  INDEX `idx_user_id` (`create_time` ASC),
  INDEX `idx_create_time` (`create_time` ASC))COMMENT = '用户动态';

drop table if exists quwan_info;
CREATE TABLE `quwan`.`quwan_info` (
  `id` BIGINT(20) UNSIGNED NOT NULL AUTO_INCREMENT,
  `title` VARCHAR(45) NOT NULL DEFAULT '' COMMENT '活动标题',
  `quwan_time` TIMESTAMP NOT NULL DEFAULT '2000-01-01 00:00:00' COMMENT '去玩时间',
  `destination` VARCHAR(50) NOT NULL DEFAULT '' COMMENT '活动目的地',
  `cost_type` TINYINT(2) NOT NULL DEFAULT 0 COMMENT '消费类型，0:AA,1:男生买单,2:女生买单,3:群主买单,4:到时再看' ,
  `except_cost` DECIMAL(10,2) NOT NULL DEFAULT '0.00' COMMENT '预计花费',
  `real_cost` DECIMAL(10,2) NOT NULL DEFAULT '0.00'  COMMENT '实际花费',
  `expect_persons` SMALLINT(4) NOT NULL DEFAULT -1 COMMENT '期望人数',
  `quwan_status` TINYINT(2) NOT NULL DEFAULT -1 COMMENT '去玩状态,0:初始,1:进行中,2:已结束',
  `finish_time` TIMESTAMP NOT NULL DEFAULT '2000-01-01 00:00:00' COMMENT '去玩活动结束时间',
  `quwan_event_id` BIGINT(20) NOT NULL DEFAULT -1 COMMENT '去玩事件id',
  `quwan_group_id` BIGINT(20) NOT NULL DEFAULT -1 COMMENT '去玩群id',
  `create_time` TIMESTAMP NOT NULL DEFAULT '2000-01-01 00:00:00' COMMENT '创建时间',
  `update_time` TIMESTAMP NOT NULL DEFAULT '2000-01-01 00:00:00' COMMENT '更新时间',
  PRIMARY KEY (`id`),
  INDEX `idx_quwan_event_id` (`quwan_event_id` ASC),
  INDEX `idx_quwan_group_id` (`quwan_group_id` ASC),
  INDEX `idx_create_time` (`create_time` ASC)) COMMENT = '去玩活动信息' ;

drop table if exists user_certify_info;
CREATE TABLE `quwan`.`user_certify_info` (
  `id` BIGINT(20) UNSIGNED NOT NULL AUTO_INCREMENT,
  `certify_id` VARCHAR(20) NOT NULL DEFAULT '' COMMENT '认证id',
  `user_id` VARCHAR(15) NOT NULL DEFAULT '' COMMENT '用户id',
  `user_name` VARCHAR(20) NOT NULL DEFAULT '' COMMENT '用户真实姓名',
  `identity_card` VARCHAR(20) NOT NULL DEFAULT '' COMMENT '身份证',
  `mobile` VARCHAR(15) NOT NULL DEFAULT '' COMMENT '认证过的号',
  `certify_level` TINYINT(3) NOT NULL DEFAULT 0 COMMENT '认证等级,1:手机号已认证,2:已身份认证,3:汽车已认证,4:住房已认证,5:征信渠道认证',
  `house_certify` VARCHAR(10) NOT NULL DEFAULT '' COMMENT '房屋认证信息',
  `car_certify` VARCHAR(10) NOT NULL DEFAULT '' COMMENT '汽车认证信息',
  `credit_id` VARCHAR(20) NOT NULL DEFAULT '' COMMENT '征信信息id',
  `create_time` TIMESTAMP NOT NULL DEFAULT '2000-01-01 00:00:00' COMMENT '创建时间',
  `update_time` TIMESTAMP NOT NULL DEFAULT '2000-01-01 00:00:00' COMMENT '更新时间',
  PRIMARY KEY (`id`),
  INDEX `idx_certify_id` (`certify_id` ASC),
  INDEX `idx_user_id` (`user_id` ASC),
  INDEX `idx_identity_card` (`identity_card` ASC),
  INDEX `idx_mobile` (`mobile` ASC),
  INDEX `idx_credit_id` (`credit_id` ASC),
  INDEX `idx_create_time` (`create_time` ASC)) COMMENT = '用户认证信息' ;

drop table if exists user_credit_info;
CREATE TABLE `quwan`.`user_credit_info` (
  `id` BIGINT(20) UNSIGNED NOT NULL AUTO_INCREMENT,
  `user_id` VARCHAR(15) NOT NULL DEFAULT '' COMMENT '用户id',
  `channel_name` VARCHAR(20) NOT NULL DEFAULT '' COMMENT '通道名称',
  `channel_result` VARCHAR(500) NOT NULL DEFAULT '' COMMENT '通道结果',
  `create_time` TIMESTAMP NOT NULL DEFAULT '2000-01-01 00:00:00' COMMENT '创建时间',
  `update_time` TIMESTAMP NOT NULL DEFAULT '2000-01-01 00:00:00' COMMENT '更新时间',
  PRIMARY KEY (`id`),
  INDEX `idx_user_id` (`user_id` ASC),
  INDEX `idx_create_time` (`create_time` ASC)) COMMENT = '征信信息';

drop table if exists group_info;
CREATE TABLE `quwan`.`group_info` (
  `id` BIGINT(20) UNSIGNED NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(50) NOT NULL DEFAULT '' COMMENT '群名称',
  `group_type` TINYINT(2) NOT NULL DEFAULT 0 COMMENT '群类型，0:单人对话,1:多人对话',
  `create_user_id` VARCHAR(15) NOT NULL DEFAULT '' COMMENT '创建者id',
  `picture_urls` VARCHAR(80) NOT NULL DEFAULT '' COMMENT '图片url',
  `notice_ids` VARCHAR(200) NOT NULL DEFAULT '' COMMENT '公告id列表',
  `introduction` VARCHAR(200) NOT NULL DEFAULT '' COMMENT '群简介',
  `recommend_url` VARCHAR(80) NOT NULL DEFAULT '' COMMENT '推荐内容url',
  `create_time` TIMESTAMP NOT NULL DEFAULT '2000-01-01 00:00:00' COMMENT '创建时间',
  `update_time` TIMESTAMP NOT NULL DEFAULT '2000-01-01 00:00:00' COMMENT '更新时间',
  PRIMARY KEY (`id`),
  INDEX `idx_create_user_id` (`create_time` ASC),
  INDEX `idx_create_time` (`create_time` ASC)) COMMENT = '群信息' ;

drop table if exists group_notice_info;
CREATE TABLE `quwan`.`group_notice_info` (
  `id` BIGINT(20) UNSIGNED NOT NULL AUTO_INCREMENT,
  `group_id` VARCHAR(20) NOT NULL DEFAULT '' COMMENT '群id',
  `content` VARCHAR(200) NOT NULL DEFAULT '' COMMENT '公告内容',
  `create_time` TIMESTAMP NOT NULL DEFAULT '2000-01-01 00:00:00' COMMENT '创建时间',
  `update_time` TIMESTAMP NOT NULL DEFAULT '2000-01-01 00:00:00' COMMENT '更新时间',
  PRIMARY KEY (`id`),
  INDEX `idx_group_id` (`create_time` ASC),
  INDEX `idx_create_time` (`create_time` ASC)) COMMENT = '群通知内容';


#用户发送的content
drop table if exists user_talk_content;
CREATE TABLE `quwan`.`user_talk_content` (
  `id` BIGINT(20) UNSIGNED NOT NULL AUTO_INCREMENT,
  `group_id` VARCHAR(20) NOT NULL DEFAULT '' COMMENT '群id',
  `user_id` VARCHAR(15) NOT NULL DEFAULT '' COMMENT '用户id',
  `content` VARCHAR(200) NOT NULL DEFAULT '' COMMENT '内容',
  `create_time` TIMESTAMP NOT NULL DEFAULT '2000-01-01 00:00:00' COMMENT '创建时间',
  `update_time` TIMESTAMP NOT NULL DEFAULT '2000-01-01 00:00:00' COMMENT '更新时间',
  PRIMARY KEY (`id`),
  INDEX `idx_group_id` (`group_id` ASC),
  INDEX `idx_user_id` (`user_id` ASC),
  INDEX `idx_create_time` (`create_time` ASC)) COMMENT = '用户聊天内容';

#一个群对应的所有用户
drop table if exists group_user_ids;
CREATE TABLE `quwan`.`group_user_ids` (
  `id` BIGINT(20) UNSIGNED NOT NULL AUTO_INCREMENT,
  `group_id` VARCHAR(20) NOT NULL DEFAULT '' COMMENT '群id',
  `user_id` VARCHAR(15) NOT NULL DEFAULT '' COMMENT '用户id',
  `user_alias_name` VARCHAR(30) NOT NULL DEFAULT '' COMMENT '用户别名',
  `create_time` TIMESTAMP NOT NULL DEFAULT '2000-01-01 00:00:00' COMMENT '创建时间',
  `update_time` TIMESTAMP NOT NULL DEFAULT '2000-01-01 00:00:00' COMMENT '更新时间',
  PRIMARY KEY (`id`),
  INDEX `idx_group_id` (`group_id` ASC),
  INDEX `idx_user_id` (`user_id` ASC),
  INDEX `idx_create_time` (`create_time` ASC)) COMMENT = '群内用户列表';

drop TABLE IF EXISTS dic_key_value;
CREATE TABLE `quwan`.`dic_key_value` (
  `id` SMALLINT(5) UNSIGNED NOT NULL AUTO_INCREMENT,
  `key` VARCHAR(20) NOT NULL DEFAULT '' COMMENT '字典key',
  `value` VARCHAR(50) NOT NULL DEFAULT '' COMMENT '字典value',
  `create_time` TIMESTAMP NOT NULL DEFAULT '2000-01-01 00:00:00' COMMENT '创建时间',
  `update_time` TIMESTAMP NOT NULL DEFAULT '2000-01-01 00:00:00' COMMENT '更新时间',
  PRIMARY KEY (`id`),
  INDEX `idx_create_time` (`create_time` ASC)) COMMENT = '字典表';

drop TABLE IF EXISTS greet_info;
CREATE TABLE `quwan`.`greet_info` (
  `id` SMALLINT(5) UNSIGNED NOT NULL AUTO_INCREMENT,
  `sex` TINYINT(2) NOT NULL DEFAULT 0 COMMENT '0:女,1:男',
  `content` VARCHAR(50) NOT NULL DEFAULT '' COMMENT '打招呼内容',
  `create_time` TIMESTAMP NOT NULL DEFAULT '2000-01-01 00:00:00' COMMENT '创建时间',
  `update_time` TIMESTAMP NOT NULL DEFAULT '2000-01-01 00:00:00' COMMENT '更新时间',
  PRIMARY KEY (`id`)) COMMENT = '随机打招呼内容表';