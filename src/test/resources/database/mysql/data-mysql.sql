delete from t_order;
insert into t_order(COMPANY_CODE, ORDER_INFOMATION, CREATE_USER_ID, CREATE_DATE_TIME, UPDATE_USER_ID, UPDATE_DATE_TIME, VERSION_NUMBER,  LOGICAL_DELETE_FLAG) values('1234','hogehoge','TESTUSER',current_timestamp(),null,null,0,false);
insert into t_order(COMPANY_CODE, ORDER_INFOMATION, CREATE_USER_ID, CREATE_DATE_TIME, UPDATE_USER_ID, UPDATE_DATE_TIME, VERSION_NUMBER,  LOGICAL_DELETE_FLAG) values('1234','fugafuga','TESTUSER',current_timestamp(),null,null,0,false);
insert into t_order(COMPANY_CODE, ORDER_INFOMATION, CREATE_USER_ID, CREATE_DATE_TIME, UPDATE_USER_ID, UPDATE_DATE_TIME, VERSION_NUMBER,  LOGICAL_DELETE_FLAG) values('5678','orange','TESTUSER',current_timestamp(),null,null,0,false);
insert into t_order(COMPANY_CODE, ORDER_INFOMATION, CREATE_USER_ID, CREATE_DATE_TIME, UPDATE_USER_ID, UPDATE_DATE_TIME, VERSION_NUMBER,  LOGICAL_DELETE_FLAG) values('5678','banana','TESTUSER',current_timestamp(),null,null,0,false);
insert into t_order(COMPANY_CODE, ORDER_INFOMATION, CREATE_USER_ID, CREATE_DATE_TIME, UPDATE_USER_ID, UPDATE_DATE_TIME, VERSION_NUMBER,  LOGICAL_DELETE_FLAG) values('7890','apple','TESTUSER',current_timestamp(),null,null,0,false);
