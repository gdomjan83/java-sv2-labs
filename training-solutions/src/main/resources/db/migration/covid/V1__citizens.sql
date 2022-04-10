create table citizens(citizen_id bigint not null auto_increment, citizen_name varchar(200) not null, zip char(2) not null,
age bigint not null, email varchar(200), taj varchar(10), number_of_vaccination bigint, last_vaccination datetime,
primary key(citizen_id));