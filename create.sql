create table contact (contact_id integer not null auto_increment, address varchar(255), city varchar(255), country varchar(255), create_date datetime(6), dob date, first_name varchar(255), last_name varchar(255), nick_name varchar(255), state varchar(255), status tinyint not null, update_date datetime(6), zip_code varchar(255), user_id integer not null, primary key (contact_id)) engine=InnoDB
create table contact_email (contact_id integer not null, email varchar(255)) engine=InnoDB
create table contact_phone (contact_id integer not null, phone varchar(255)) engine=InnoDB
create table task (id integer not null auto_increment, description varchar(255), status tinyint, primary key (id)) engine=InnoDB
create table user (user_id integer not null auto_increment, create_date datetime(6), email varchar(255), name varchar(255), password varchar(255), status tinyint not null, update_date datetime(6), primary key (user_id)) engine=InnoDB
alter table contact add constraint FKe07k4jcfdophemi6j1lt84b61 foreign key (user_id) references user (user_id)
alter table contact_email add constraint FKjhb6oolv2p95xsci34vuoiq00 foreign key (contact_id) references contact (contact_id)
alter table contact_phone add constraint FKjlssyu3cvwtmtimsa8vx9nh5 foreign key (contact_id) references contact (contact_id)
create table contact (contact_id integer not null auto_increment, address varchar(255), city varchar(255), country varchar(255), create_date datetime(6), dob date, first_name varchar(255), last_name varchar(255), nick_name varchar(255), state varchar(255), status tinyint not null, update_date datetime(6), zip_code varchar(255), user_id integer not null, primary key (contact_id)) engine=InnoDB
create table contact_email (contact_id integer not null, email varchar(255)) engine=InnoDB
create table contact_phone (contact_id integer not null, phone varchar(255)) engine=InnoDB
create table task (id integer not null auto_increment, description varchar(255), status tinyint, primary key (id)) engine=InnoDB
create table user (user_id integer not null auto_increment, create_date datetime(6), email varchar(255), name varchar(255), password varchar(255), status tinyint not null, update_date datetime(6), primary key (user_id)) engine=InnoDB
alter table contact add constraint FKe07k4jcfdophemi6j1lt84b61 foreign key (user_id) references user (user_id)
alter table contact_email add constraint FKjhb6oolv2p95xsci34vuoiq00 foreign key (contact_id) references contact (contact_id)
alter table contact_phone add constraint FKjlssyu3cvwtmtimsa8vx9nh5 foreign key (contact_id) references contact (contact_id)
create table contact (contact_id integer not null auto_increment, address varchar(255), city varchar(255), country varchar(255), create_date datetime(6), dob date, first_name varchar(255), last_name varchar(255), nick_name varchar(255), state varchar(255), status tinyint not null, update_date datetime(6), zip_code varchar(255), user_id integer not null, primary key (contact_id)) engine=InnoDB
create table contact_email (contact_id integer not null, email varchar(255)) engine=InnoDB
create table contact_phone (contact_id integer not null, phone varchar(255)) engine=InnoDB
create table task (id integer not null auto_increment, description varchar(255), status tinyint, primary key (id)) engine=InnoDB
create table user (user_id integer not null auto_increment, create_date datetime(6), email varchar(255), name varchar(255), password varchar(255), status tinyint not null, update_date datetime(6), primary key (user_id)) engine=InnoDB
alter table contact add constraint FKe07k4jcfdophemi6j1lt84b61 foreign key (user_id) references user (user_id)
alter table contact_email add constraint FKjhb6oolv2p95xsci34vuoiq00 foreign key (contact_id) references contact (contact_id)
alter table contact_phone add constraint FKjlssyu3cvwtmtimsa8vx9nh5 foreign key (contact_id) references contact (contact_id)
create table contact (contact_id integer not null auto_increment, address varchar(255), city varchar(255), country varchar(255), create_date datetime(6), dob date, first_name varchar(255), last_name varchar(255), nick_name varchar(255), state varchar(255), status tinyint not null, update_date datetime(6), zip_code varchar(255), user_id integer not null, primary key (contact_id)) engine=InnoDB
create table contact_email (contact_id integer not null, email varchar(255)) engine=InnoDB
create table contact_phone (contact_id integer not null, phone varchar(255)) engine=InnoDB
create table task (id integer not null auto_increment, description varchar(255), status tinyint, primary key (id)) engine=InnoDB
create table user (user_id integer not null auto_increment, create_date datetime(6), email varchar(255), name varchar(255), password varchar(255), status tinyint not null, update_date datetime(6), primary key (user_id)) engine=InnoDB
alter table contact add constraint FKe07k4jcfdophemi6j1lt84b61 foreign key (user_id) references user (user_id)
alter table contact_email add constraint FKjhb6oolv2p95xsci34vuoiq00 foreign key (contact_id) references contact (contact_id)
alter table contact_phone add constraint FKjlssyu3cvwtmtimsa8vx9nh5 foreign key (contact_id) references contact (contact_id)
create table contact (contact_id integer not null auto_increment, address varchar(255), city varchar(255), country varchar(255), create_date datetime(6), dob date, first_name varchar(255), last_name varchar(255), nick_name varchar(255), state varchar(255), status tinyint not null, update_date datetime(6), zip_code varchar(255), user_id integer not null, primary key (contact_id)) engine=InnoDB
create table contact_email (contact_id integer not null, email varchar(255)) engine=InnoDB
create table contact_phone (contact_id integer not null, phone varchar(255)) engine=InnoDB
create table task (id integer not null auto_increment, description varchar(255), status tinyint, primary key (id)) engine=InnoDB
create table user (user_id integer not null auto_increment, create_date datetime(6), email varchar(255), name varchar(255), password varchar(255), status tinyint not null, update_date datetime(6), primary key (user_id)) engine=InnoDB
alter table contact add constraint FKe07k4jcfdophemi6j1lt84b61 foreign key (user_id) references user (user_id)
alter table contact_email add constraint FKjhb6oolv2p95xsci34vuoiq00 foreign key (contact_id) references contact (contact_id)
alter table contact_phone add constraint FKjlssyu3cvwtmtimsa8vx9nh5 foreign key (contact_id) references contact (contact_id)
create table contact (contact_id integer not null auto_increment, address varchar(255), city varchar(255), country varchar(255), create_date datetime(6), dob date, first_name varchar(255), last_name varchar(255), nick_name varchar(255), state varchar(255), status tinyint not null, update_date datetime(6), zip_code varchar(255), user_id integer not null, primary key (contact_id)) engine=InnoDB
create table contact_email (contact_id integer not null, email varchar(255)) engine=InnoDB
create table contact_phone (contact_id integer not null, phone varchar(255)) engine=InnoDB
create table task (id integer not null auto_increment, description varchar(255), status tinyint, primary key (id)) engine=InnoDB
create table user (user_id integer not null auto_increment, create_date datetime(6), email varchar(255), name varchar(255), password varchar(255), status tinyint not null, update_date datetime(6), primary key (user_id)) engine=InnoDB
alter table contact add constraint FKe07k4jcfdophemi6j1lt84b61 foreign key (user_id) references user (user_id)
alter table contact_email add constraint FKjhb6oolv2p95xsci34vuoiq00 foreign key (contact_id) references contact (contact_id)
alter table contact_phone add constraint FKjlssyu3cvwtmtimsa8vx9nh5 foreign key (contact_id) references contact (contact_id)
create table contact (contact_id integer not null auto_increment, address varchar(255), city varchar(255), country varchar(255), create_date datetime(6), dob date, first_name varchar(255), last_name varchar(255), nick_name varchar(255), state varchar(255), status tinyint not null, update_date datetime(6), zip_code varchar(255), user_id integer not null, primary key (contact_id)) engine=InnoDB
create table contact_email (contact_id integer not null, email varchar(255)) engine=InnoDB
create table contact_phone (contact_id integer not null, phone varchar(255)) engine=InnoDB
create table task (id integer not null auto_increment, description varchar(255), status tinyint, primary key (id)) engine=InnoDB
create table user (user_id integer not null auto_increment, create_date datetime(6), email varchar(255), name varchar(255), password varchar(255), status tinyint not null, update_date datetime(6), primary key (user_id)) engine=InnoDB
alter table contact add constraint FKe07k4jcfdophemi6j1lt84b61 foreign key (user_id) references user (user_id)
alter table contact_email add constraint FKjhb6oolv2p95xsci34vuoiq00 foreign key (contact_id) references contact (contact_id)
alter table contact_phone add constraint FKjlssyu3cvwtmtimsa8vx9nh5 foreign key (contact_id) references contact (contact_id)
create table contact (contact_id integer not null auto_increment, address varchar(255), city varchar(255), country varchar(255), create_date datetime(6), dob date, first_name varchar(255), last_name varchar(255), nick_name varchar(255), state varchar(255), status tinyint not null, update_date datetime(6), zip_code varchar(255), user_id integer not null, primary key (contact_id)) engine=InnoDB
create table contact_email (contact_id integer not null, email varchar(255)) engine=InnoDB
create table contact_phone (contact_id integer not null, phone varchar(255)) engine=InnoDB
create table task (id integer not null auto_increment, description varchar(255), status tinyint, primary key (id)) engine=InnoDB
create table user (user_id integer not null auto_increment, create_date datetime(6), email varchar(255), name varchar(255), password varchar(255), status tinyint not null, update_date datetime(6), primary key (user_id)) engine=InnoDB
alter table contact add constraint FKe07k4jcfdophemi6j1lt84b61 foreign key (user_id) references user (user_id)
alter table contact_email add constraint FKjhb6oolv2p95xsci34vuoiq00 foreign key (contact_id) references contact (contact_id)
alter table contact_phone add constraint FKjlssyu3cvwtmtimsa8vx9nh5 foreign key (contact_id) references contact (contact_id)
