CREATE SEQUENCE SEQ_FILE;
CREATE TABLE TBL_FILE(
    ID NUMBER CONSTRAINT PK_FILE PRIMARY KEY,
    FILE_NAME VARCHAR2(1000) NOT NULL,
    FILE_SIZE VARCHAR2(1000) NOT NULL,
    FILE_PATH VARCHAR2(1000) NOT NULL,
    CREATED_DATE DATE DEFAULT SYSDATE,
    UPDATED_DATE DATE DEFAULT SYSDATE
);

SELECT * FROM TBL_FILE;