
-- create an auto-increment field with the sequence object
CREATE SEQUENCE seq_table
MINVALUE 1
START WITH 1
INCREMENT BY 1
CACHE 10;

-- Insertion table : Amortissement

INSERT INTO Amortissement (idAmortissement, dureeAmortissement)
VALUES (seq_table.nextval,6);

INSERT INTO Amortissement (idAmortissement, dureeAmortissement)
VALUES (seq_table.nextval,12);
