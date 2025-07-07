-- File contenente tutte le configurazioni DB

create sequence seq_ids;

create table usr_users (
    ID NUMBER(10,0) NOT NULL,
    USERNAME VARCHAR2(256 BYTE),
    VERSION NUMBER(10,0),
    FL_DELETED NUMBER(1,0),
    INSERT_DATE DATE,
    DELETION_DATE DATE,
    CONSTRAINT PK_USR_USERS PRIMARY KEY (ID)
);

select * from usr_users;