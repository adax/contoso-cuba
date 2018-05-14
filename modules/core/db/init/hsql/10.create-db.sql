-- begin CONTOSO_COURSE
create table CONTOSO_COURSE (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    TITLE varchar(255),
    CREDITS integer,
    --
    primary key (ID)
)^
-- end CONTOSO_COURSE

-- begin CONTOSO_ENROLLMENT
create table CONTOSO_ENROLLMENT (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    COURSE_ID varchar(36),
    STUDENT_ID varchar(36),
    GRADE varchar(50),
    --
    primary key (ID)
)^
-- end CONTOSO_ENROLLMENT
-- begin CONTOSO_STUDENT_
create table CONTOSO_STUDENT_ (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    LAST_NAME varchar(50),
    FIRST_MID_NAME varchar(50),
    ENROLLMENT_DATE date,
    --
    primary key (ID)
)^
-- end CONTOSO_STUDENT_
