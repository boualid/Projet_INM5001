
-- create an auto-increment field with the sequence object
CREATE SEQUENCE seq_amort
MINVALUE 1
START WITH 1
INCREMENT BY 1
CACHE 10;

-- Insertions table : Amortissement

INSERT INTO Amortissement (idAmortissement, dureeAmortissement)
VALUES (seq_amort.nextval, '5 ans');

INSERT INTO Amortissement (idAmortissement, dureeAmortissement)
VALUES (seq_amort.nextval, '10 ans');

INSERT INTO Amortissement (idAmortissement, dureeAmortissement)
VALUES (seq_amort.nextval, '15 ans');

INSERT INTO Amortissement (idAmortissement, dureeAmortissement)
VALUES (seq_amort.nextval, '20 ans');

INSERT INTO Amortissement (idAmortissement, dureeAmortissement)
VALUES (seq_amort.nextval, '25 ans');
