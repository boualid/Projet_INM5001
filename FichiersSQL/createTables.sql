CREATE TABLE Client(
	noClient INTEGER,
	dateCreation DATE,
	nomClient VARCHAR2(20),
	adCourriel VARCHAR2(20),
	CONSTRAINT pk_client PRIMARY KEY (noClient)
)
/

CREATE TABLE Amortissement(
	idAmortissement INTEGER,
	dureeAmortissement INTEGER,
	CONSTRAINT pk_amortissement PRIMARY KEY (idAmortissement)
)
/

CREATE TABLE Pret(
	idPret INTEGER,
	clientNo INTEGER,
	datePret DATE,
	typeRret VARCHAR2(20),
	montantPret NUMBER(15,5),
	taux NUMBER(8,5),
	amortissementId INTEGER,
	frequence VARCHAR2(20),
	versement NUMBER(15,5),
	CONSTRAINT pk_pret PRIMARY KEY (idPret),
	CONSTRAINT fk_client FOREIGN KEY (clientNo)
		REFERENCES Client(noClient),
	CONSTRAINT fk_amortissement FOREIGN KEY (amortissementId)
		REFERENCES Amortissement(idAmortissement)
)
/
