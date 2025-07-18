create database VM;

use VM;

create table login(meter_no varchar(20), username varchar(30), name varchar(30), password varchar(20), user varchar(20)); 
describe login;
select*from login;
truncate table login;

create table customer(name varchar(20), meter_no varchar(20), address varchar(50), city varchar(30), state varchar(30), email varchar(40), phone varchar(20));
describe customer;
select*from customer;
truncate table customer;
drop table customer;

create table meter_info(meter_no varchar(20), meter_location varchar(20), meter_type varchar(20), phase_code varchar(20), bill_type varchar(20), days varchar(20));
describe meter_info;
select *from meter_info;
truncate table meter_info;
drop table meter_info;

create table tax(cost_per_unit varchar(20), meter_rent varchar(20), service_charge varchar(20), service_tax varchar(20), swacch_bharat_cess varchar(20), fixed_tax varchar(20));
insert into tax values('9','47','22','57','6','18');
describe tax;
select*from tax;
truncate table tax;
drop table tax;

create table bill(meter_no varchar(20), month varchar(30), units varchar(20), totalbill varchar(20), status varchar(20));
describe bill;
select*from bill;
truncate table bill;
drop table bill;