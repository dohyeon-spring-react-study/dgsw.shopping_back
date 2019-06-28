use shoppingmall;

drop table comment;

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

create table product(
  id int primary key not null auto_increment,
  productId int not null,
  category varchar(50) not null,
  lowcategory varchar(60) not null,
  productkind int,
  name varchar(200) not null,
  content varchar(1000),
  detail varchar(1000),
  normalprice int not null,
  sellprice int not null,
  mileage int not null,
  created datetime default current_timestamp,
  updated datetime default current_timestamp on update current_timestamp
);

create table attach(
  id int primary key not null auto_increment,
  productId int not null,
  filename varchar(5000) not null,
  filepath varchar(10000) not null,
  created datetime default current_timestamp,
  updated datetime default current_timestamp on update current_timestamp
);

create table comment(
  id int primary key not null auto_increment,
  productId int not null,
  useraccount varchar(30) not null,
  content varchar(100) not null,
  created datetime default current_timestamp,
  updated datetime default current_timestamp on update current_timestamp
);

create table basket(
  id int primary key not null auto_increment,
  userId int not null,
  productname varchar(200) not null,
  price int not null,
  count int not null,
  created datetime default current_timestamp,
  updated datetime default current_timestamp on update current_timestamp
)