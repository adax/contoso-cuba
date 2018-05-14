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
);
