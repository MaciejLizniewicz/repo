create database if not exists masibaza;

create table if not exists masibaza.languages(
language_id int(11) AUTO_INCREMENT,
language_name varchar(255),
PRIMARY KEY (language_id));


create table if not exists masibaza.position(
position_id int(11) AUTO_INCREMENT,
position_name varchar(255),
is_active boolean,
PRIMARY KEY (position_id));

create table if not exists masibaza.test(
test_id int(11) AUTO_INCREMENT,
test_name varchar(255),
position int(11),
language int(11),
creation_date date,
modification_date date,
PRIMARY KEY (test_id), 
FOREIGN KEY (position) REFERENCES masibaza.position(position_id),
FOREIGN KEY (language) REFERENCES masibaza.languages(language_id));

create table if not exists masibaza.question(
question_id int(11) auto_increment,
test int(11),
contant varchar(255),
PRIMARY KEY (question_id), 
FOREIGN KEY (test) REFERENCES masibaza.test(test_id));

create table if not exists masibaza.possible_ans(
answer varchar(255),
question int(11),
FOREIGN KEY (question) REFERENCES masibaza.question(question_id));

create table if not exists masibaza.roles(
role_id int(11) AUTO_INCREMENT,
role_name varchar(255),
PRIMARY KEY (role_id));

create table if not exists masibaza.users(
user_id int(11) AUTO_INCREMENT, 
first_name varchar(255), 
last_name varchar(255), 
role_id int(11), 
PRIMARY KEY (user_id), 
FOREIGN KEY (role_id) REFERENCES masibaza.roles(role_id));

create table if not exists masibaza.useraccount(
account_id int(11) AUTO_INCREMENT, 
user int(11),
password varchar(255),
PRIMARY KEY (account_id), 
FOREIGN KEY (user) REFERENCES masibaza.users(user_id));