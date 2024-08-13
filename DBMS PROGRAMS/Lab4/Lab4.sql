USE CSE_B_312

--> PART = A

--1. Add two more columns City VARCHAR (20) and Pincode INT.
ALTER TABLE DEPOSIT ADD CITY VARCHAR(20), PINCODE INT

--2. Change the size of CNAME column from VARCHAR (50) to VARCHAR (35).
ALTER TABLE DEPOSIT ALTER COLUMN CNAME VARCHAR(35) 

--3. Change the data type DECIMAL to INT in amount Column.
ALTER TABLE DEPOSIT ALTER COLUMN AMOUNT INT

--4. Rename Column ActNo to ANO.
EXEC sp_rename 'DEPOSIT.ACTNO',  'ANO';

--5. Delete Column City from the DEPOSIT table.
ALTER TABLE DEPOSIT DROP COLUMN CITY

--6. Change name of table DEPOSIT to DEPOSIT_DETAIL.EXEC sp_rename 'DEPOSIT',  'DEPOSIT_DETAILS';


--> PART - B

--1. Rename Column ADATE to AOPENDATE OF DEPOSIT_DETAIL table.
EXEC sp_rename 'DEPOSIT_DETAILS.ADATE',  'AOPENDATE';

--2. Delete Column AOPENDATE from the DEPOSIT_DETAIL table.
ALTER TABLE DEPOSIT_DETAIL DROP COLUMN AOPENDATE

--3. Rename Column CNAME to CustomerName
EXEC sp_rename 'DEPOSIT_DETAILS.CNAME',  'CUSTOMERNAME';


-->  PART = C

CREATE TABLE STUDENT_DETAIL (
	ENROLLMENT_NO VARCHAR(20),
	SNAME VARCHAR(20),
	CPI DECIMAL(5,2),
	BIRTHDATE DATETIME
)


--1. Add two more columns City VARCHAR (20) (Not null) 
--and Backlog INT (Null).
ALTER TABLE DEPOSIT_DETAIL ADD  CITY VARCHAR(20) NOT NULL,BACKLOG INT NULL

--2. Change the size of NAME column of student_detail from VARCHAR (25) 
--to VARCHAR (35).
ALTER TABLE STUDENET_DETAIL ALTER COLUMN SNAME VARCHAR(35)

--3. Change the data type DECIMAL to INT in CPI Column.
ALTER TABLE STUDENT_DETAIL ALTER COLUMN CPI INT

--4. Rename Column Enrollment_No to ENO.
EXEC sp_rename 'STUDENT_DETAILS.ENROLLMENT_NO',  'ENO';

--5. Delete Column City from the student_detail table.
ALTER TABLE STUDENT_DETAIL DROP COLUMN CITY

--6. Change name of table student_detail to STUDENT_MASTER.
EXEC sp_rename 'STUDENT_DETAIL',  'STUDENT_MASTER';

