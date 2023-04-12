show full columns from mysql.user;

select user, host
from mysql.user;

CREATE USER 'TEST'@'LOCALHOST' IDENTIFIED BY '1234';

CREATE USER 'ANYWHERE'@'%' IDENTIFIED BY '1234';
CREATE USER 'TEST2'@'192.168.0.%' identified BY '1234';
create USER 'TESTS'@'LOCALHOST' identified BY '1234';

# 생성하고자 하는 사용자 이름이 이미 사용중이지 않을때만 생성
CREATE USER IF NOT EXISTS 'TEST'@'LOCALHOST' IDENTIFIED BY '1234';

# 이름 다시 정의
RENAME USER 'TEST2'@'192.168.0.%' TO 'TEST3'@'%';

# 사용자 삭제
DROP USER 'TEST3'@'%';
DROP USER IF exists 'ANYWHERE'@'%';

# 데이터베이스 생성
CREATE DATABASE TEST;

# 권한 확인하고 부여하기
SHOW GRANTS FOR 'TEST'@'LOCALHOST';
GRANT ALL PRIVILEGES ON TEST.* TO 'TEST'@'LOCALHOST';
FLUSH PRIVILEGES;

# 데이터베이스 권한 제거
REVOKE ALL PRIVILEGES ON TEST.* FROM 'TEST'@'LOCALHOST';
FLUSH PRIVILEGES;
SHOW GRANTS FOR 'TEST'@'LOCALHOST';

# 데이터베이스 목록 조회
SHOW DATABASES;

# 데이터베이스 생성하는데 존재하지 않을때만 생성
CREATE DATABASE IF NOT EXISTS TEST;

# 특수한 문자를 포함하여 데이터 베이스 명칭을 사용하고 싶을때
CREATE DATABASE `TEST.TEST`;
SHOW DATABASES;

# 데이터베이스 삭제
DROP DATABASE `TEST.TEST`;
SHOW DATABASES;

CREATE DATABASE JAVA;
SHOW DATABASES;

# 명령하지 않아도 지금부터 JAVA라는 데이터베이스를 사용하겠다. 
USE JAVA;

# 테이블 만들기
CREATE TABLE table1 (column1 VARCHAR(100));

# 테이블 목록 조회
SHOW TABLES;

# 현재 사용하는 데이터베이스 조회
SELECT database();

# 테이블 이름 변경
RENAME TABLE table1 to table2;
show tables;

# 테이블 제거
DROP TABLE table2;
SHOW TABLES;

# 테이블 열에 대해 수정을 실습할 데이터 생성
CREATE TABLE test_table(
	test_column1 int,
    test_colunm2 int,
    test_column3 int
    );
    
desc test_table;

# 테이블에 컬럼 추가하기
ALTER TABLE test_table ADD test_column4 int;
DESC test_table;

# 여러 컬럼 동시에 추가
ALTER TABLE test_table ADD (test_column5 int, test_column6 int, test_column7 int);
DESC test_table;

# 컬럼 삭제
ALTER TABLE test_table DROP test_column1;
DESC test_table;

# 컬럼 순서 변경 - 특정 컬럼을 제일 앞으로 이동시키기
ALTER TABLE test_table MODIFY test_column7 int first;
DESC test_table;

# 컬럼 순서 변경 - 특정 열을 기준으로 이동
ALTER TABLE test_table MODIFY test_column7 int AFTER test_column6;
DESC test_table;

# 테이블 컬럼 이름 변경
ALTER TABLE test_table CHANGE test_colunm2 test_column0 int;
DESC test_table;

# 컬럼 데이터 타입 변경
ALTER TABLE test_table CHANGE test_column0 test_column0 VARCHAR(100);
DESC test_table;

# 컬럼 타입과 이름 동시에 변경
ALTER TABLE test_table CHANGE test_column0 test_column2 int;
DESC test_table;

# 자동으로 증가하는 컬럼 만들기
CREATE TABLE test(
	id int auto_increment PRIMARY KEY
);
DESC test;

# 데이터 삽입
INSERT INTO test VALUE();

# 데이터 조회
SELECT *
FROM test;

# 값을 지정해서 컬럼에 값 추가하기
INSERT INTO test VALUE(100);
INSERT INTO test VALUE();
INSERT INTO test VALUE(22);
INSERT INTO test VALUE();

# 마지막 값 지우기
DELETE FROM test WHERE ID = 103;
INSERT INTO test VALUE();

SELECT DATABASE();
USE JAVA;

#  모든 데이터 지우기
DELETE FROM test;