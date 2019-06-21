use shoppingmall;

drop table user;

create table user(
  id int primary key not null auto_increment,
  account varchar(30) not null,
  password varchar(50) not null,
  name varchar(15) not null,
  callnumber varchar(20) not null,
  phonenumber varchar(20) not null,
  zipcode varchar(10) not null,
  address varchar(200) not null,
  email varchar(40) not null,
  mileage int not null,
  created datetime default current_timestamp,
  updated datetime default current_timestamp on update current_timestamp
);