create table tb_user (
  id       VARCHAR(50) PRIMARY KEY ,
  username VARCHAR(50) UNIQUE  NOT NULL,
  password VARCHAR(50)         NOT NULL,
  sex varchar(1) DEFAULT 'X',
  email    VARCHAR(200) UNIQUE NOT NULL,
  wei_chat  VARCHAR(100),
  location VARCHAR(20),
  ext_param TEXT,
  last_modify_time timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  create_time timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP
);