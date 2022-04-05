create table vaccinations(vaccination_id bigint not null, citizen_id bigint not null, vaccination_date datetime not null,
status varchar(10), note varchar(200), vaccination_type varchar(20), primary key(vaccination_id),
foreign key (citizen_id) references citizens (citizen_id));