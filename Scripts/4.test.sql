SELECT *
FROM USER_TABLES;

SELECT STUD_ID AS studId, NAME, EMAIL, PHONE, DOB 
	FROM STUDENTS 
	WHERE STUD_ID = 1;
	
select stud_id, name, email, dob, 
	substr(phone, 1, 3) as f, 
	substr(phone, 5, 3) as m, 
	substr(phone, 9, 4) as l
	from students 
	where stud_id=1;

--일대일 매핑
SELECT STUD_ID, NAME, EMAIL, PHONE, DOB, A.ADDR_ID, STREET, CITY, STATE, ZIP, COUNTRY
FROM STUDENTS S JOIN ADDRESSES A ON S.ADDR_ID=A.ADDR_ID
WHERE STUD_ID = 1;

SELECT * FROM STUDENTS;

--clob/blob
SELECT * FROM USER_PICS;


SELECT * FROM COURSES;


SELECT * FROM TUTORS;


