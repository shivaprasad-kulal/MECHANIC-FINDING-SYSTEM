--MECHANIC
CREATE TABLE MECHANIC (
MECHNAME VARCHAR(100),
MECHID VARCHAR(40) PRIMARY KEY,
PHONENO VARCHAR(30),
SHOPNAME VARCHAR(100),
PIN INTEGER,
PASSWORD VARCHAR(30) );

--USER
CREATE TABLE USER (
USNAME VARCHAR(100),
USDLNO VARCHAR(40) PRIMARY KEY,
USEMAIL VARCHAR(100),
USPHONE VARCHAR(30),
USPASSWORD VARCHAR(30) );
--SERVICE
CREATE TABLE SERVICE (
SID INT(20) AUTO INCREMENT,
SPECL VARCHAR(400),
EXPERIENCE VARCHAR(100),
BCHARGE INT(100),
MECHID VARCHAR(40),
FOREIGN KEY(MECHID)REFERENCES MECHANIC(MECHID) ON DELETE CASCADE,
PRIMARY KEY(SID) );

--TWO WHEELER VEHICLE
CREATE TABLE VEHICLET (
VTNO VARCHAR(40) PRIMARY KEY,
TYPE VARCHAR(100),
MODEL VARCHAR(100),
USDLNO VARCHAR(40),
FOREIGN KEY(USDLNO)REFERENCES USER(USDLNO) ON DELETE CASCADE );

--FOUR WHEELER VEHICLE
CREATE TABLE VEHICLEF (
VTNO VARCHAR(40) PRIMARY KEY,
TYPE VARCHAR(100),
MODEL VARCHAR(100),
USDLNO VARCHAR(40),
FOREIGN KEY(USDLNO)REFERENCES USER(USDLNO) ON DELETE CASCADE );
