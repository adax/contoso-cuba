alter table CONTOSO_ENROLLMENT alter column STUDENT_ID rename to STUDENT_ID__U78304 ;
drop index IDX_CONTOSO_ENROLLMENT_STUDENT ;
alter table CONTOSO_ENROLLMENT add column STUDENT_ID varchar(36) ;
