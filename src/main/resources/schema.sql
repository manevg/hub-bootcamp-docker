drop table if exists tasks;
create table tasks (id bigint NOT NULL AUTO_INCREMENT, TASK_NAME varchar(255), TASK_DESC varchar(255), STATUS varchar(255), PRIMARY KEY ( id ));
