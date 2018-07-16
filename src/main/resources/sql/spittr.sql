create database if not EXISTS spittr;
use spittr;
drop table if EXISTS spitters;

CREATE TABLE `spitters` (
  `id` int(20) unsigned NOT NULL AUTO_INCREMENT,
  `first_name` varchar(20) DEFAULT NULL,
  `last_name` varchar(20) DEFAULT NULL,
  `username` varchar(20) DEFAULT NULL,
  `password` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8

CREATE TABLE `spittles` (
  `id` int(20) unsigned NOT NULL AUTO_INCREMENT,
  `message` varchar(50) DEFAULT NULL,
  `time` datetime DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP,
  `latitude` double DEFAULT NULL,
  `longtitude` double DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

insert into spitters(firstName,lastName,username,password) VALUE ('Katherine','G','kath','123456');
insert into spitters(firstName,lastName,username,password) VALUE ('Katherine','G','kath','123456');
insert into spitters(firstName,lastName,username,password) VALUE ('Katherine','G','kath','123456');
insert into spitters(firstName,lastName,username,password) VALUE ('Katherine','G','kath','123456');

insert into spittles(message,time,latitude,longtitude) VALUE ('message test','2018-07-16 10:06:00','12.9','13.1');
insert into spittles(message,time,latitude,longtitude) VALUE ('message test','2018-07-16 10:06:00','12.9','13.1');
insert into spittles(message,time,latitude,longtitude) VALUE ('message test','2018-07-16 10:06:00','12.9','13.1');
insert into spittles(message,time,latitude,longtitude) VALUE ('message test','2018-07-16 10:06:00','12.9','13.1');
