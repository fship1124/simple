create table tbl_member (
	userid varchar(50) not null,
	userpw varchar(50) not null,
	username varchar(50) not null,
	email varchar(50),
	regdate timestamp default now(),
	updatedate timestamp default now(),
	primary key(userid)
);