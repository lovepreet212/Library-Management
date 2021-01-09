create table book_entry
(
bookno	int primary key,
isbnno   int,
subjct  varchar(15),
nameofbook  varchar(18),
author  varchar(18),
publisher varchar(20),
edition  int,
copies  int,
cost int
);
select*from book_entry;