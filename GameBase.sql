CREATE TABLE VIDEOGAME_T (
GameID NUMBER(8),
GameTitle VARCHAR(50) NOT NULL,
GameDescription VARCHAR(200) NOT NULL,
Platform VARCHAR(50) NOT NULL,
Price NUMBER NOT NULL,
Publisher VARCHAR(50) NOT NULL,
Stock NUMBER NOT NULL,
WholeSalePrice NUMBER NOT NULL,
DistributorID NUMBER (8),
CONSTRAINT distributor_t_fk FOREIGN KEY(DistributorID) REFERENCES DISTRIBUTOR_T (DistributorID) ON DELETE CASCADE,
CONSTRAINT videogame_t_pk PRIMARY KEY (GameID)
);

--insertion is performed via the sql query included in the java code files 
--To get last row of the table 
alter table videogame_t 

add(last_row date default sysdate);
select * from videogame_t;
drop table videogame_t cascade constraints;

CREATE TABLE DISTRIBUTOR_T (
DistributorID NUMBER (8),
DistAddress VARCHAR(100) NOT NULL,
PhoneNumber long NOT NULL,
AccountNumber varchar(25) NOT NULL,
CONSTRAINT distributor_t_pk PRIMARY KEY (DistributorID)
);
alter table distributor_t 
add(last_row date default sysdate);
select * from distributor_t;
drop table distributor_t cascade constraints;

CREATE TABLE CUSTOMER_T (
CustomerID NUMBER (8),
CustomerName VARCHAR(100) NOT NULL,
CustomerAddress VARCHAR(200) NOT NULL,
RegistrationDate varchar(25) NOT NULL,
PhoneNumber long NOT NULL,
CreditCardNumber varchar(16) NOT NULL,
CONSTRAINT customer_pk PRIMARY KEY (CustomerID)
);
drop table customer_t cascade constraints;
select * from customer_t;
alter table customer_t 
add(last_row date default sysdate);


CREATE TABLE CUSTOMER_ORDER_T (
OrderID NUMBER(8) ,
GameID NUMBER(8),
CustomerID NUMBER(8),
OrderStatus varchar (100) DEFAULT 'Ready to be dispatched',

CONSTRAINT customer_order1_fk FOREIGN KEY(GameID) REFERENCES VIDEOGAME_T (GameID) ON DELETE CASCADE,
CONSTRAINT customer_order2_fk FOREIGN KEY(CustomerID) REFERENCES CUSTOMER_T (CustomerID) ON DELETE CASCADE,
CONSTRAINT customer_order_pk PRIMARY KEY (OrderID)
);
select * from customer_order_t;
drop table customer_order_t cascade constraints;
alter table customer_order_t 
add(last_row date default sysdate);

CREATE TABLE SHIPMENT_T (
ShipmentNumber NUMBER (8),
ShippingDate varchar(25) NOT NULL,
DeliveryDate varchar(25)NOT NULL,
OrderID NUMBER (8),
CustomerID NUMBER (8),

CONSTRAINT shipment_1_fk FOREIGN KEY(OrderID) REFERENCES CUSTOMER_ORDER_T (OrderID) ON DELETE CASCADE,
CONSTRAINT shipment_2_fk FOREIGN KEY(CustomerID) REFERENCES CUSTOMER_T (CustomerID) ON DELETE CASCADE,
CONSTRAINT shipment_pk PRIMARY KEY (ShipmentNumber)
);
alter table shipment_t 
add(last_row date default sysdate);
select * from shipment_t;

create table CUSTOMER_ORDERLINE_T (
OrderQuantity NUMBER(37) NOT NULL,
GameID NUMBER(8),
DistributorID NUMBER (8),

CONSTRAINT customer_orderline1_fk FOREIGN KEY (GAMEID) REFERENCES VIDEOGAME_T(GameID) ON DELETE CASCADE,
CONSTRAINT customer_orderline2_fk FOREIGN KEY (DISTRIBUTORID) REFERENCES DISTRIBUTOR_T(DistributorID) ON DELETE CASCADE
);
alter table customer_orderline_t 
add(last_row date default sysdate);
select * from customer_orderline_t;
truncate table customer_orderline_T;

create table RETURN_ITEM_T (
ReturnNumber Number (8),
ReturnQuantity Number(37) NOT NULL,
ReturnDate Date NOT NULL,
GameID NUMBER(8),
CustomerID NUMBER (8),

CONSTRAINT return_item1_fk FOREIGN KEY(GameID) REFERENCES VIDEOGAME_T (GameID) ON DELETE CASCADE,
CONSTRAINT return_item2_fk FOREIGN KEY(CustomerID) REFERENCES CUSTOMER_T (CustomerID) ON DELETE CASCADE,
CONSTRAINT return_pk PRIMARY KEY (ReturnNumber)
);
alter table return_item_t 
add(last_row date default sysdate);
select * from return_item_t;

CREATE TABLE SHIPMENT_INVOICE_T (
TrackingNumber NUMBER (8),
ShipmentType VARCHAR(50) NOT NULL,
Weight NUMBER default 198,

CONSTRAINT shipment_invoice_pk PRIMARY KEY (TrackingNumber)
);
alter table shipment_invoice_t 
add(last_row date default sysdate);
select * from shipment_invoice_t;

CREATE TABLE EMPLOYEE_T (
EmployeeID NUMBER (4),
EmployeeName VARCHAR(50) NOT NULL,
EmployeeAddress VARCHAR(200) NOT NULL,
DateHired DATE NOT NULL,
WorkingHours NUMBER NOT NULL CHECK (WorkingHours>2),
PayRaise DECIMAL,
CONSTRAINT employee_pk PRIMARY KEY (EmployeeID)
);
alter table employee_t 
add(last_row date default sysdate);
select * from employee_t;
drop table employee_t;


CREATE TABLE EMPLOYEE_POSITION_T(
PositionName VARCHAR (100),
EmployeeID NUMBER (4),
Description VARCHAR(200) NOT NULL,
Salary NUMBER (10) NOT NULL,
CONSTRAINT employee_position_pk PRIMARY KEY (EMPLOYEEID, POSITIONNAME)
);
alter table employee_position_t 
add(last_row date default sysdate);
select * from employee_position_t;




--trigger
SET SERVEROUTPUT ON;
create or replace trigger tr_profit_check
after insert
on videogame_t
for each row
when (new.price <= new.wholesaleprice )
begin
insert into profit_calc(description) values ('no profit!');
end;
/

SET SERVEROUTPUT ON;
create or replace trigger tr_stock_check
after update
on videogame_t
for each row
when (new.stock <1 )
begin
insert into low_stock(description) values ('Not in stock!');
end;
/

CREATE or REPLACE TRIGGER stock_history_trigger
after UPDATE of stock
ON videogame_t
FOR EACH ROW
BEGIN
INSERT INTO game_stock_history(gameid,stock)
VALUES
(:old.gameid,
:old.stock
);
END;
/

--procedure
create or replace 
procedure sp_profit_calc
as 
begin
INSERT INTO profit_calc (profit)
select price - wholesaleprice from videogame_t where last_row = (select max(last_row) from videogame_t);
end;
/

create or replace 
PROCEDURE SetDiscount
AS
BEGIN
UPDATE Sale_Price
SET Discount = .85 * originalprice
WHERE originalprice BETWEEN 400 AND 600;
UPDATE Sale_Price
SET Discount = .9 * originalprice
WHERE originalprice > 600;
END;
/

create or replace 
PROCEDURE generate_sales_sp
AS
BEGIN
merge into sales_report target
using (select videogame_t.gameid,gametitle,price,customer_order_t.orderid from videogame_T join customer_order_t on videogame_t.gameid = customer_order_t.gameid ) source
on (target.gameid=source.gameid)
WHEN NOT MATCHED THEN
INSERT (target.gameid,target.gametitle,target.orderid,target.price)
VALUES(source.gameid,source.gametitle,source.orderid,source.price);
END;
/

--helper tables
create table profit_calc(
profit NUMBER (25),
description varchar (25)
);
select * from profit_calc;

create table low_stock(
description varchar(25) 
);

select * from low_stock;

create table sale_price(
originalprice double precision,
Discount double precision
);
select * from sale_price;


create table GAME_PHOTOS
(GAME_IMG BLOB);
select * from game_photos;


CREATE TABLE SALES_REPORT(
GAMEID NUMBER(8),
GAMETITLE VARCHAR(50),
PRICE NUMBER (25),
ORDERID NUMBER(8),
CONSTRAINT gameid__fk FOREIGN KEY(GameID) REFERENCES VIDEOGAME_T (GAMEID) ON DELETE CASCADE,
CONSTRAINT orderid__fk FOREIGN KEY(orderID) REFERENCES CUSTOMER_ORDER_T (OrderID) ON DELETE CASCADE
);

drop table sales_report;
select * from sales_report;
truncate table sales_Report;

CREATE TABLE game_stock_history
(
gameid number(8),
stock number 

);

select * from game_stock_history;
alter table game_stock_history
add last_row date  default sysdate;
drop table game_stock_history;
truncate table game_stock_history;


--views
create view cust_view__vu
AS SELECT customerid,customername,customeraddress,registrationdate,phonenumber,creditcardnumber FROM customer_t
WITH read only;
select * from cust_view__vu;

create view sales_rep_vu
AS SELECT * FROM sales_report
WITH Read only;
select * from sales_rep_vu;
