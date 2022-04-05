create table citizens(citizen_id bigint not null, citizen_name varchar(200) not null, zip char(2) not null,
age bigint not null, email varchar(200), taj varchar(10), number_of_vaccination bigint, last_vaccination datetime,
constraint pk_citizen primary key(citizen_id), constraint fk_citizen foreign key (citizen_id) references vaccinations (citizen_id));