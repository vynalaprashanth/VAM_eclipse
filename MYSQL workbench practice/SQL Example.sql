create database empdetails;
use empdetails;

create table allemployees (
empID int primary key auto_increment ,
empname varchar(10),
empage int,
empcity varchar(20));
insert into allemployees(empname,empage,empcity) values('prashanth',15,'hyd'),('raju',20,'hyd'),('mahesh',19,'chandigarh');
select *from allemployees;
select empname from allemployees where empid=2;
describe allemployees;
insert into allemployees (empname,empage,empcity) values('prashanth1',15,'hyd'),('prashanth2',15,'hyd');
select * from allemployees;
select distinct empcity from allemployees;
select *from allemployees where empname='raju';
select *from allemployees where  empage>'15';
select *from allemployees where empname='prashanth1' and  empage='24';
select *from allemployees order by empcity desc;
insert into allemployees(empname,empage,empcity) values('venny',22,'secunderabad');
select *from  allemployees;
update allemployees set empcity='chennai' where empname='prashanth';
SET SQL_SAFE_UPDATES = 0;
select * from allemployees;
select now(),curdate(),curTIME();
INSERT INTO allemployees(empname,empage,empcity) values('tester1',20,'delhi');
describe allemployees;
select * from allemployees;
delete from allemployees where empname='prashanth' ;
select *from allemployees;
 select *from allemployees limit 5;
 
 #wildcards
 # like operators 
 select *from allemployees where empcity like'hyd';
 
 # IN Operator
 select *from allemployees where empcity in ('hyd');
 
 #between operator
 select *from allemployees where empId between '3' and '5';

# select empname prashanth from allemployees as p ;
# alias operator(AS)

update allemployees set empname='rohit' where empID=2;

 
 

 
 


