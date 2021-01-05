create database airport_db;

create table pilots (
id int not null auto_increment,
first_name varchar(255) not null,
last_name varchar(255) not null,
rank varchar(255) not null,
pilot_number varchar(255) not null unique,
primary key (id)
);


create table airplanes (
id int not null auto_increment,
mark varchar(255) not null,
model varchar(255) not null,
capacity int not null,
plane_number varchar(255) not null unique,
primary key(id)
);


Create table flight(
id int auto_increment,
airplanes_id int not null,
pilots_id int not null,
data_flight varchar(255) not null,
time_flight varchar(255) not null,
flight_number varchar(255) not null unique,
constraint Flight_PK primary key(id),
 foreign key(airplanes_id) references airplanes(id),
 foreign key(pilots_id) references pilots(id)
);
