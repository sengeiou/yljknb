drop table ip_business_code;

create table ip_business_code(
	bc_type varchar2(20)  PRIMARY KEY ,	
	bc_sql  varchar2(200),
	bc_status char(1) default '1'
);