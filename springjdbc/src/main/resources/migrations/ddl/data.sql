create table student
(
    student_id bigint auto_increment,
    first_name varchar(20) null,
    last_name  varchar(20) null,
    year       int         null,
    constraint student_id
        unique (student_id)
);

alter table student
    add primary key (student_id);