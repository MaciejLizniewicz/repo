create database if not exists masibaza;

create table if not exists masibaza.language(
id int(11) AUTO_INCREMENT,
name varchar(255),
PRIMARY KEY (id));


create table if not exists masibaza.position(
id int(11) AUTO_INCREMENT,
name varchar(255),
active boolean,
PRIMARY KEY (id));

create table if not exists masibaza.test(
id int(11) AUTO_INCREMENT,
name varchar(255),
position int(11),
language int(11),
creation_date date,
modification_date date,
PRIMARY KEY (id), 
FOREIGN KEY (position) REFERENCES masibaza.position(id),
FOREIGN KEY (language) REFERENCES masibaza.language(id));

create table if not exists masibaza.question(
id int(11) auto_increment,
test int(11),
contant varchar(255),
PRIMARY KEY (id), 
FOREIGN KEY (test) REFERENCES masibaza.test(id));

create table if not exists masibaza.possible_answer(
answer varchar(255),
question int(11),
FOREIGN KEY (question) REFERENCES masibaza.question(id));

create table if not exists masibaza.role(
id int(11) AUTO_INCREMENT,
name varchar(255),
PRIMARY KEY (id));

create table if not exists masibaza.user(
id int(11) AUTO_INCREMENT, 
first_name varchar(255), 
last_name varchar(255), 
role int(11), 
PRIMARY KEY (id), 
FOREIGN KEY (role) REFERENCES masibaza.role(id));

create table if not exists masibaza.user_account(
id int(11) AUTO_INCREMENT,
username varchar(255),
application_user_user_id int(11),
password varchar(255),
PRIMARY KEY (id), 
FOREIGN KEY (application_user_user_id) REFERENCES masibaza.user(id));