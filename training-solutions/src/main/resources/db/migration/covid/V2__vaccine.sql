create table vaccinations(vaccination_id bigint not null, citizen_id int not null, vaccination_date datetime not null,
status varchar(10), note varchar(200), vaccination_type varchar(20), constraint pk_vaccine primary key(vaccination_id));