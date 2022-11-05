DROP TABLE Person_Information;
CREATE TABLE Person_Information(
    PersonID int,
    FirstName varchar(255),
    LastName varchar(255),
    Address varchar(255),
    City varchar(255)
);

INSERT INTO Person_Information (PERSONID,FIRSTNAME,LASTNAME,ADDRESS,CITY)
VALUES (1, 'Selva', 'mani','South street','Theni');

INSERT INTO Person_Information (PERSONID,FIRSTNAME,LASTNAME,ADDRESS,CITY)
VALUES (2, 'Dinesh', 'kumar', 'North street','mdu');

INSERT INTO Person_Information (PERSONID,FIRSTNAME,LASTNAME,ADDRESS,CITY)
VALUES (3, 'Saravana', 'kumar', 'Tenet street','Cbe');

INSERT INTO Person_Information (PERSONID,FIRSTNAME,LASTNAME,ADDRESS,CITY)
VALUES (4, 'Dharun', 'kumar', 'Viveka street','Thiruchy');

INSERT INTO Person_Information (PERSONID,FIRSTNAME,LASTNAME,ADDRESS,CITY)
VALUES (5, 'Yogesh', 'Pandi', 'West street','Salem');
