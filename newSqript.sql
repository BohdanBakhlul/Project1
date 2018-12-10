DROP TABLE IF EXISTS car;
DROP TABLE IF EXISTS carspecs;
DROP TABLE IF EXISTS car_creators;
DROP TABLE IF EXISTS car_orders;
DROP TABLE IF EXISTS delivery;

CREATE TABLE car (
ID INT(10) NOT NULL AUTO_INCREMENT,
CREATOR VARCHAR(20) NOT NULL,
MODEL VARCHAR(20) NOT NULL,
COUNTRY VARCHAR(20) NOT NULL,
PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE carspecs (
SPEC_ID INT(10) NOT NULL AUTO_INCREMENT,
ID INT(10) NOT NULL,
BODY VARCHAR(20) NOT NULL,
COLOR VARCHAR(20) NOT NULL,
ENGINE_SIZE FLOAT(5) NOT NULL,
PRIMARY KEY (`SPEC_ID`),
FOREIGN KEY (ID) REFERENCES car(ID)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE car_creators (
PERS_ID INT(10) NOT NULL AUTO_INCREMENT,
ID INT(10) NOT NULL,
NAME VARCHAR(20) NOT NULL,
SURNAME VARCHAR(20) NOT NULL,
PRIMARY KEY (`PERS_ID`),
FOREIGN KEY (ID) REFERENCES car(ID)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE car_orders (
ORDER_ID INT(10) NOT NULL AUTO_INCREMENT,
ID INT(10) NOT NULL,
MODEL VARCHAR(20) NOT NULL,
CITY VARCHAR(30) NOT NULL,
AMOUNT INT(5) NOT NULL,
PRIMARY KEY (`ORDER_ID`),
FOREIGN KEY (ID) REFERENCES car(ID)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE delivery (
DELIVERY_ID INT(10) NOT NULL AUTO_INCREMENT,
ORDER_ID INT(10) NOT NULL,
TYPE VARCHAR(20) NOT NULL,
'MODEL' VARCHAR(20) NOT NULL,
PRIMARY KEY (`DELIVERY_ID`),
FOREIGN KEY (ORDER_ID) REFERENCES car_orders(ORDER_ID),
FOREIGN KEY (MODEL) REFERENCES car(MODEL)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
