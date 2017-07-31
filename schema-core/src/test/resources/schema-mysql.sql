DROP TABLE IF EXISTS account;
CREATE TABLE account (
  id                BIGINT(20)      NOT         NULL PRIMARY KEY AUTO_INCREMENT COMMENT 'id',
  nick_name         VARCHAR(64)     DEFAULT     NULL COMMENT '昵称',
  username          VARCHAR(64)     NOT         NULL COMMENT '用户名',
  password          VARCHAR(64)     DEFAULT     NULL COMMENT '密码',
  created_at        DATETIME        DEFAULT     NULL COMMENT '创建时间',
  updated_at        DATETIME        DEFAULT     NULL COMMENT '修改时间'
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
