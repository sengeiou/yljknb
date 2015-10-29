alter table SQ_ITEM_DEFINITION
   drop constraint FK_SQ_ITEM__PROCESSOR;

alter table SQ_ITEM_VALUE
   drop constraint FK_SQ_ITEM_VALUE__DEFINITION;

drop table SQ_APPLY cascade constraints;

drop table SQ_APPLY_DATA cascade constraints;

drop index IDX_SQ_APPLY_DETAIL_DATA01;

drop index IDX_SQ_APPLY_DETAIL_BSZ005;

drop table SQ_APPLY_DETAIL cascade constraints;

drop table SQ_APPLY_TRACK cascade constraints;

drop table SQ_ITEM_DEFINITION cascade constraints;

drop table SQ_ITEM_PROCESSOR cascade constraints;

drop table SQ_ITEM_VALUE cascade constraints;

drop table SQ_MAC_CLIENT cascade constraints;

drop table SQ_MAC_LIST cascade constraints;

/*==============================================================*/
/* Table: SQ_APPLY                                              */
/*==============================================================*/
create table SQ_APPLY  (
   BSZ005               VARCHAR2(20)                    not null,
   AAA121               VARCHAR2(10)                    not null,
   INSERT_DATE          DATE                            not null,
   INSERT_OPERATOR      VARCHAR2(10),
   INSERT_OPERATORNAME  VARCHAR2(50),
   UPDATE_DATE          DATE,
   UPDATE_OPERATOR      VARCHAR2(10),
   UPDATE_OPERATORNAME  VARCHAR2(50),
   STATUS               VARCHAR2(1)                     not null,
   AAB301               VARCHAR2(6),
   AAA027               VARCHAR2(8)                     not null,
   BAB003               VARCHAR2(10),
   BAB004               VARCHAR2(10),
   AAZ002               CHAR(16),
   AAZ010               CHAR(16),
   AAA028               VARCHAR2(3),
   AAE140               VARCHAR2(3),
   SEQLOGID             NUMBER,
   constraint PK_SQ_APPLY primary key (BSZ005)
         using index
       pctfree 10
       initrans 2
       maxtrans 255
       storage
       (
           initial 4096K
           minextents 1
           maxextents unlimited
       )
     
)
monitoring;

comment on table SQ_APPLY is
'社区申请信息';

comment on column SQ_APPLY.BSZ005 is
'事项标识（业务日志标识）';

comment on column SQ_APPLY.AAA121 is
'业务类型';

comment on column SQ_APPLY.INSERT_DATE is
'生成时间';

comment on column SQ_APPLY.INSERT_OPERATOR is
'生成操作人';

comment on column SQ_APPLY.INSERT_OPERATORNAME is
'生成操作人姓名';

comment on column SQ_APPLY.UPDATE_DATE is
'更新时间';

comment on column SQ_APPLY.UPDATE_OPERATOR is
'更新操作人';

comment on column SQ_APPLY.UPDATE_OPERATORNAME is
'更新操作人姓名';

comment on column SQ_APPLY.STATUS is
'状态';

comment on column SQ_APPLY.AAB301 is
'所属行政区代码';

comment on column SQ_APPLY.AAA027 is
'所属乡镇';

comment on column SQ_APPLY.BAB003 is
'所属居委（村）';

comment on column SQ_APPLY.BAB004 is
'所属社区';

comment on column SQ_APPLY.AAZ002 is
'业务日志ID';

comment on column SQ_APPLY.AAZ010 is
'当事人ID';

comment on column SQ_APPLY.AAA028 is
'当事人类别';

comment on column SQ_APPLY.AAE140 is
'险种类型';

/*==============================================================*/
/* Table: SQ_APPLY_DATA                                         */
/*==============================================================*/
create table SQ_APPLY_DATA  (
   BSZ005               VARCHAR2(20)                    not null,
   DATA01               VARCHAR2(100),
   DATA02               VARCHAR2(100),
   DATA03               VARCHAR2(100),
   DATA04               VARCHAR2(100),
   DATA05               VARCHAR2(100),
   DATA06               VARCHAR2(100),
   DATA07               VARCHAR2(100),
   DATA08               VARCHAR2(100),
   DATA09               VARCHAR2(100),
   DATA10               VARCHAR2(100),
   DATA11               VARCHAR2(100),
   DATA12               VARCHAR2(100),
   DATA13               VARCHAR2(100),
   DATA14               VARCHAR2(100),
   DATA15               VARCHAR2(100),
   DATA16               VARCHAR2(100),
   DATA17               VARCHAR2(100),
   DATA18               VARCHAR2(100),
   DATA19               VARCHAR2(100),
   DATA20               VARCHAR2(100),
   DATA21               VARCHAR2(100),
   DATA22               VARCHAR2(100),
   DATA23               VARCHAR2(100),
   DATA24               VARCHAR2(100),
   DATA25               VARCHAR2(100),
   DATA26               VARCHAR2(100),
   DATA27               VARCHAR2(100),
   DATA28               VARCHAR2(100),
   DATA29               VARCHAR2(100),
   DATA30               VARCHAR2(100),
   DATA31               VARCHAR2(300),
   DATA32               VARCHAR2(300),
   DATA33               VARCHAR2(300),
   DATA34               VARCHAR2(300),
   DATA35               VARCHAR2(300),
   DATA36               VARCHAR2(500),
   DATA37               VARCHAR2(500),
   DATA38               VARCHAR2(500),
   DATA39               VARCHAR2(1000),
   DATA40               VARCHAR2(1000),
   SEQLOGID             NUMBER,
   constraint PK_SQ_APPLY_DATA primary key (BSZ005)
         using index
       pctfree 10
       initrans 2
       maxtrans 255
       storage
       (
           initial 4096K
           minextents 1
           maxextents unlimited
       )
     
)
monitoring;

comment on table SQ_APPLY_DATA is
'社区申报数据';

comment on column SQ_APPLY_DATA.BSZ005 is
'流水号';

comment on column SQ_APPLY_DATA.DATA01 is
'业务数据1';

comment on column SQ_APPLY_DATA.DATA02 is
'业务数据2';

comment on column SQ_APPLY_DATA.DATA03 is
'业务数据3';

comment on column SQ_APPLY_DATA.DATA04 is
'业务数据4';

comment on column SQ_APPLY_DATA.DATA05 is
'业务数据5';

comment on column SQ_APPLY_DATA.DATA06 is
'业务数据6';

comment on column SQ_APPLY_DATA.DATA07 is
'业务数据7';

comment on column SQ_APPLY_DATA.DATA08 is
'业务数据8';

comment on column SQ_APPLY_DATA.DATA09 is
'业务数据9';

comment on column SQ_APPLY_DATA.DATA10 is
'业务数据10';

comment on column SQ_APPLY_DATA.DATA11 is
'业务数据11';

comment on column SQ_APPLY_DATA.DATA12 is
'业务数据12';

comment on column SQ_APPLY_DATA.DATA13 is
'业务数据13';

comment on column SQ_APPLY_DATA.DATA14 is
'业务数据14';

comment on column SQ_APPLY_DATA.DATA15 is
'业务数据15';

comment on column SQ_APPLY_DATA.DATA16 is
'业务数据16';

comment on column SQ_APPLY_DATA.DATA17 is
'业务数据17';

comment on column SQ_APPLY_DATA.DATA18 is
'业务数据18';

comment on column SQ_APPLY_DATA.DATA19 is
'业务数据19';

comment on column SQ_APPLY_DATA.DATA20 is
'业务数据20';

comment on column SQ_APPLY_DATA.DATA21 is
'业务数据21';

comment on column SQ_APPLY_DATA.DATA22 is
'业务数据22';

comment on column SQ_APPLY_DATA.DATA23 is
'业务数据23';

comment on column SQ_APPLY_DATA.DATA24 is
'业务数据24';

comment on column SQ_APPLY_DATA.DATA25 is
'业务数据25';

comment on column SQ_APPLY_DATA.DATA26 is
'业务数据26';

comment on column SQ_APPLY_DATA.DATA27 is
'业务数据27';

comment on column SQ_APPLY_DATA.DATA28 is
'业务数据28';

comment on column SQ_APPLY_DATA.DATA29 is
'业务数据29';

comment on column SQ_APPLY_DATA.DATA30 is
'业务数据30';

comment on column SQ_APPLY_DATA.DATA31 is
'业务数据31';

comment on column SQ_APPLY_DATA.DATA32 is
'业务数据32';

comment on column SQ_APPLY_DATA.DATA33 is
'业务数据33';

comment on column SQ_APPLY_DATA.DATA34 is
'业务数据34';

comment on column SQ_APPLY_DATA.DATA35 is
'业务数据35';

comment on column SQ_APPLY_DATA.DATA36 is
'业务数据36';

comment on column SQ_APPLY_DATA.DATA37 is
'业务数据37';

comment on column SQ_APPLY_DATA.DATA38 is
'业务数据38';

comment on column SQ_APPLY_DATA.DATA39 is
'业务数据39';

comment on column SQ_APPLY_DATA.DATA40 is
'业务数据40';

/*==============================================================*/
/* Table: SQ_APPLY_DETAIL                                       */
/*==============================================================*/
create table SQ_APPLY_DETAIL  (
   BSZ007               NUMBER(19)                      not null,
   BSZ005               VARCHAR2(20)                    not null,
   CODE                 VARCHAR2(30)                    not null,
   XH                   NUMBER(4)                       not null,
   STATUS               VARCHAR2(1)                     not null,
   DATA01               VARCHAR2(100),
   DATA02               VARCHAR2(100),
   DATA03               VARCHAR2(100),
   DATA04               VARCHAR2(100),
   DATA05               VARCHAR2(100),
   DATA06               VARCHAR2(100),
   DATA07               VARCHAR2(100),
   DATA08               VARCHAR2(100),
   DATA09               VARCHAR2(100),
   DATA10               VARCHAR2(100),
   DATA11               VARCHAR2(100),
   DATA12               VARCHAR2(100),
   DATA13               VARCHAR2(100),
   DATA14               VARCHAR2(100),
   DATA15               VARCHAR2(100),
   DATA16               VARCHAR2(100),
   DATA17               VARCHAR2(100),
   DATA18               VARCHAR2(100),
   DATA19               VARCHAR2(100),
   DATA20               VARCHAR2(100),
   DATA21               VARCHAR2(100),
   DATA22               VARCHAR2(100),
   DATA23               VARCHAR2(100),
   DATA24               VARCHAR2(100),
   DATA25               VARCHAR2(100),
   DATA26               VARCHAR2(100),
   DATA27               VARCHAR2(100),
   DATA28               VARCHAR2(100),
   DATA29               VARCHAR2(100),
   DATA30               VARCHAR2(100),
   DATA31               VARCHAR2(300),
   DATA32               VARCHAR2(300),
   DATA33               VARCHAR2(300),
   DATA34               VARCHAR2(300),
   DATA35               VARCHAR2(300),
   DATA36               VARCHAR2(500),
   DATA37               VARCHAR2(500),
   DATA38               VARCHAR2(500),
   DATA39               VARCHAR2(1000),
   DATA40               VARCHAR2(1000),
   SEQLOGID             NUMBER,
   constraint PK_SQ_APPLY_DETAIL primary key (BSZ007)
         using index
       pctfree 10
       initrans 2
       maxtrans 255
       storage
       (
           initial 17408K
           minextents 1
           maxextents unlimited
       )
     
)
monitoring;

comment on table SQ_APPLY_DETAIL is
'申报明细数据';

comment on column SQ_APPLY_DETAIL.BSZ007 is
'明细数据ID';

comment on column SQ_APPLY_DETAIL.BSZ005 is
'流水号';

comment on column SQ_APPLY_DETAIL.CODE is
'明细编号';

comment on column SQ_APPLY_DETAIL.XH is
'序号';

comment on column SQ_APPLY_DETAIL.STATUS is
'状态';

comment on column SQ_APPLY_DETAIL.DATA01 is
'业务数据1';

comment on column SQ_APPLY_DETAIL.DATA02 is
'业务数据2';

comment on column SQ_APPLY_DETAIL.DATA03 is
'业务数据3';

comment on column SQ_APPLY_DETAIL.DATA04 is
'业务数据4';

comment on column SQ_APPLY_DETAIL.DATA05 is
'业务数据5';

comment on column SQ_APPLY_DETAIL.DATA06 is
'业务数据6';

comment on column SQ_APPLY_DETAIL.DATA07 is
'业务数据7';

comment on column SQ_APPLY_DETAIL.DATA08 is
'业务数据8';

comment on column SQ_APPLY_DETAIL.DATA09 is
'业务数据9';

comment on column SQ_APPLY_DETAIL.DATA10 is
'业务数据10';

comment on column SQ_APPLY_DETAIL.DATA11 is
'业务数据11';

comment on column SQ_APPLY_DETAIL.DATA12 is
'业务数据12';

comment on column SQ_APPLY_DETAIL.DATA13 is
'业务数据13';

comment on column SQ_APPLY_DETAIL.DATA14 is
'业务数据14';

comment on column SQ_APPLY_DETAIL.DATA15 is
'业务数据15';

comment on column SQ_APPLY_DETAIL.DATA16 is
'业务数据16';

comment on column SQ_APPLY_DETAIL.DATA17 is
'业务数据17';

comment on column SQ_APPLY_DETAIL.DATA18 is
'业务数据18';

comment on column SQ_APPLY_DETAIL.DATA19 is
'业务数据19';

comment on column SQ_APPLY_DETAIL.DATA20 is
'业务数据20';

comment on column SQ_APPLY_DETAIL.DATA21 is
'业务数据21';

comment on column SQ_APPLY_DETAIL.DATA22 is
'业务数据22';

comment on column SQ_APPLY_DETAIL.DATA23 is
'业务数据23';

comment on column SQ_APPLY_DETAIL.DATA24 is
'业务数据24';

comment on column SQ_APPLY_DETAIL.DATA25 is
'业务数据25';

comment on column SQ_APPLY_DETAIL.DATA26 is
'业务数据26';

comment on column SQ_APPLY_DETAIL.DATA27 is
'业务数据27';

comment on column SQ_APPLY_DETAIL.DATA28 is
'业务数据28';

comment on column SQ_APPLY_DETAIL.DATA29 is
'业务数据29';

comment on column SQ_APPLY_DETAIL.DATA30 is
'业务数据30';

comment on column SQ_APPLY_DETAIL.DATA31 is
'业务数据31';

comment on column SQ_APPLY_DETAIL.DATA32 is
'业务数据32';

comment on column SQ_APPLY_DETAIL.DATA33 is
'业务数据33';

comment on column SQ_APPLY_DETAIL.DATA34 is
'业务数据34';

comment on column SQ_APPLY_DETAIL.DATA35 is
'业务数据35';

comment on column SQ_APPLY_DETAIL.DATA36 is
'业务数据36';

comment on column SQ_APPLY_DETAIL.DATA37 is
'业务数据37';

comment on column SQ_APPLY_DETAIL.DATA38 is
'业务数据38';

comment on column SQ_APPLY_DETAIL.DATA39 is
'业务数据39';

comment on column SQ_APPLY_DETAIL.DATA40 is
'业务数据40';

/*==============================================================*/
/* Index: IDX_SQ_APPLY_DETAIL_BSZ005                            */
/*==============================================================*/
create index IDX_SQ_APPLY_DETAIL_BSZ005 on SQ_APPLY_DETAIL (
   BSZ005 ASC
)
pctfree 10
initrans 2
maxtrans 255
storage
(
    initial 35840K
    minextents 1
    maxextents unlimited
    buffer_pool default
)
;

/*==============================================================*/
/* Index: IDX_SQ_APPLY_DETAIL_DATA01                            */
/*==============================================================*/
create index IDX_SQ_APPLY_DETAIL_DATA01 on SQ_APPLY_DETAIL (
   DATA01 ASC
)
pctfree 10
initrans 2
maxtrans 255
storage
(
    initial 23552K
    minextents 1
    maxextents unlimited
    buffer_pool default
)
;

/*==============================================================*/
/* Table: SQ_APPLY_TRACK                                        */
/*==============================================================*/
create table SQ_APPLY_TRACK  (
   BSZ006               VARCHAR2(20)                    not null,
   BSZ005               VARCHAR2(20)                    not null,
   XH                   NUMBER(4)                       not null,
   STATUS               NUMBER(1)                       not null,
   MEMO                 VARCHAR2(500),
   OPERATE_TIME         DATE                            not null,
   OPERATOR_ID          VARCHAR2(10),
   OPERATOR_NAME        VARCHAR2(50),
   SEQLOGID             NUMBER,
   constraint PK_SQ_APPLY_TRACK primary key (BSZ006)
         using index
       pctfree 10
       initrans 2
       maxtrans 255
       storage
       (
           initial 64K
           minextents 1
           maxextents unlimited
       )
     
)
monitoring;

comment on table SQ_APPLY_TRACK is
'申请轨迹';

comment on column SQ_APPLY_TRACK.BSZ006 is
'申请轨迹ID';

comment on column SQ_APPLY_TRACK.BSZ005 is
'事项标识（业务日志标识）';

comment on column SQ_APPLY_TRACK.XH is
'序号';

comment on column SQ_APPLY_TRACK.STATUS is
'状态';

comment on column SQ_APPLY_TRACK.MEMO is
'备注';

comment on column SQ_APPLY_TRACK.OPERATE_TIME is
'操作时间';

comment on column SQ_APPLY_TRACK.OPERATOR_ID is
'操作人';

comment on column SQ_APPLY_TRACK.OPERATOR_NAME is
'操作人姓名';

/*==============================================================*/
/* Table: SQ_ITEM_DEFINITION                                    */
/*==============================================================*/
create table SQ_ITEM_DEFINITION  (
   ITEM_CODE            VARCHAR2(30)                    not null,
   ITEM_NAME            VARCHAR2(200)                   not null,
   ITEM_PROCESSOR       VARCHAR2(30)                    not null,
   DEFAULT_ARGUMENTS    VARCHAR2(500),
   constraint PK_SQ_ITEM_DEFINITION primary key (ITEM_CODE)
         using index
       pctfree 10
       initrans 2
       maxtrans 255
       storage
       (
           initial 64K
           minextents 1
           maxextents unlimited
       )
       
       
)
monitoring;

comment on table SQ_ITEM_DEFINITION is
'流水号定义表';

comment on column SQ_ITEM_DEFINITION.ITEM_CODE is
'代码';

comment on column SQ_ITEM_DEFINITION.ITEM_NAME is
'名称';

comment on column SQ_ITEM_DEFINITION.ITEM_PROCESSOR is
'处理器';

comment on column SQ_ITEM_DEFINITION.DEFAULT_ARGUMENTS is
'默认参数';

/*==============================================================*/
/* Table: SQ_ITEM_PROCESSOR                                     */
/*==============================================================*/
create table SQ_ITEM_PROCESSOR  (
   CODE                 VARCHAR2(30)                    not null,
   NAME                 VARCHAR2(100)                   not null,
   SPNAME               VARCHAR2(60)                    not null,
   ARGUMENTS            VARCHAR2(500),
   constraint PK_SQ_ITEM_PROCESSOR primary key (CODE)
         using index
       pctfree 10
       initrans 2
       maxtrans 255
       storage
       (
           initial 64K
           minextents 1
           maxextents unlimited
       )
       
       
)
monitoring;

comment on table SQ_ITEM_PROCESSOR is
'流水号处理器';

comment on column SQ_ITEM_PROCESSOR.CODE is
'代码';

comment on column SQ_ITEM_PROCESSOR.NAME is
'名称';

comment on column SQ_ITEM_PROCESSOR.SPNAME is
'存储过程';

comment on column SQ_ITEM_PROCESSOR.ARGUMENTS is
'参数';

/*==============================================================*/
/* Table: SQ_ITEM_VALUE                                         */
/*==============================================================*/
create table SQ_ITEM_VALUE  (
   ITEM_CODE            VARCHAR2(30)                    not null,
   ITEM_PARAMS          VARCHAR2(200)                   not null,
   ITEM_VALUE           NUMBER(22)                      not null,
   LASTTIME             DATE,
   constraint PK_SQ_ITEM_VALUE primary key (ITEM_CODE, ITEM_PARAMS)
         using index
       pctfree 10
       initrans 2
       maxtrans 255
       storage
       (
           initial 64K
           minextents 1
           maxextents unlimited
       )
       
       
)
monitoring;

comment on table SQ_ITEM_VALUE is
'流水号表';

comment on column SQ_ITEM_VALUE.ITEM_CODE is
'代码';

comment on column SQ_ITEM_VALUE.ITEM_PARAMS is
'参数';

comment on column SQ_ITEM_VALUE.ITEM_VALUE is
'值';

comment on column SQ_ITEM_VALUE.LASTTIME is
'更新日期';

/*==============================================================*/
/* Table: SQ_MAC_CLIENT                                         */
/*==============================================================*/
create table SQ_MAC_CLIENT  (
   MAC_ADDRESS          CHAR(17)                        not null,
   IP_ADDRESS           CHAR(15)                        not null,
   LOGIN_NAME           VARCHAR2(30)                    not null,
   BAB002               VARCHAR2(30)                    not null,
   BAB002NAME           VARCHAR2(30)                    not null,
   BAB003               VARCHAR2(30),
   BAB003NAME           VARCHAR2(30),
   NAME                 VARCHAR2(30)                    not null,
   PHONE                VARCHAR2(60)                    not null,
   MEMO                 VARCHAR2(500),
   AUDIT_FLAG           CHAR                            not null,
   AUDIT_USERID         VARCHAR2(20),
   AUDIT_USERNAME       VARCHAR2(60),
   CREATE_TIME          DATE                            not null,
   AUDIT_TIME           DATE,
   constraint PK_SQ_MAC_CLIENT primary key (MAC_ADDRESS)
         using index
       pctfree 10
       initrans 2
       maxtrans 255
       storage
       (
           initial 64K
           minextents 1
           maxextents unlimited
       )
     
)
monitoring;

comment on table SQ_MAC_CLIENT is
'社区客户端MAC信息';

comment on column SQ_MAC_CLIENT.MAC_ADDRESS is
'MAC地址,如:00-00-00-00-00-00';

comment on column SQ_MAC_CLIENT.IP_ADDRESS is
'IP地址';

comment on column SQ_MAC_CLIENT.LOGIN_NAME is
'登录名';

comment on column SQ_MAC_CLIENT.BAB002 is
'乡镇';

comment on column SQ_MAC_CLIENT.BAB002NAME is
'乡镇名称';

comment on column SQ_MAC_CLIENT.BAB003 is
'社区';

comment on column SQ_MAC_CLIENT.BAB003NAME is
'社区名称';

comment on column SQ_MAC_CLIENT.NAME is
'姓名';

comment on column SQ_MAC_CLIENT.PHONE is
'联系电话';

comment on column SQ_MAC_CLIENT.MEMO is
'备注';

comment on column SQ_MAC_CLIENT.AUDIT_FLAG is
'审核标志';

comment on column SQ_MAC_CLIENT.AUDIT_USERID is
'审核人标识';

comment on column SQ_MAC_CLIENT.AUDIT_USERNAME is
'审核人姓名';

comment on column SQ_MAC_CLIENT.CREATE_TIME is
'创建时间';

comment on column SQ_MAC_CLIENT.AUDIT_TIME is
'审核时间';

/*==============================================================*/
/* Table: SQ_MAC_LIST                                           */
/*==============================================================*/
create table SQ_MAC_LIST  (
   MAC_ADDRESS          CHAR(17)                        not null,
   BAB002               VARCHAR2(30)                    not null,
   BAB003               VARCHAR2(30),
   constraint PK_SQ_MAC_LIST primary key (MAC_ADDRESS)
         using index
       pctfree 10
       initrans 2
       maxtrans 255
       storage
       (
           initial 64K
           minextents 1
           maxextents unlimited
       )
     
)
monitoring;

comment on table SQ_MAC_LIST is
'社区MAC地址列表';

comment on column SQ_MAC_LIST.MAC_ADDRESS is
'MAC地址,如:00-00-00-00-00-00';

comment on column SQ_MAC_LIST.BAB002 is
'乡镇';

comment on column SQ_MAC_LIST.BAB003 is
'社区';

alter table SQ_ITEM_DEFINITION
   add constraint FK_SQ_ITEM__PROCESSOR foreign key (ITEM_PROCESSOR)
      references SQ_ITEM_PROCESSOR (CODE)
      not deferrable enable novalidate;

alter table SQ_ITEM_VALUE
   add constraint FK_SQ_ITEM_VALUE__DEFINITION foreign key (ITEM_CODE)
      references SQ_ITEM_DEFINITION (ITEM_CODE)
      not deferrable enable novalidate;
