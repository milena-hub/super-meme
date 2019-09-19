CREATE TABLE Kupac(
       IdK INTEGER PRIMARY KEY AUTOINCREMENT,
  Ime VARCHAR(20) NOT NULL,
  Prezime VARCHAR(20) NOT NULL,
  BrLK INT NOT NULL,
  BrKupljenih INT NOT NULL
);
CREATE TABLE Model(
IdM INTEGER PRIMARY KEY AUTOINCREMENT,
Marka VARCHAR(10) NOT NULL,
Model VARCHAR(20) NOT NULL,
BrProdatih INT NOT NULL,
BrNabavljenih INT NOT NULL,
Profit INT NOT NULL
);
CREATE TABLE Kupovina(
DatumVreme TEXT,
Cena INT NOT NULL,
IdA INTEGER,
IdK INTEGER,
FOREIGN KEY(IdA) REFERENCES Automobil(IdA),
FOREIGN KEY(IdK) REFERENCES Kupac(IdK)
);
CREATE TABLE Automobil(
IdA INTEGER PRIMARY KEY NOT NULL,
IdM INTEGER,
RegBr INT NOT NULL,
FOREIGN KEY(IdM) REFERENCES Model(IdM)
);
CREATE TABLE Dobavljac(
IdD INTEGER PRIMARY KEY AUTOINCREMENT,
Naziv VARCHAR(20) NOT NULL,
BrDobavljenih CHAR(4) NOT NULL
);
CREATE TABLE Nabavka(
DatumVreme TEXT,
Cena INT NOT NULL,
IdA INTEGER,
IdD INTEGER,
FOREIGN KEY(IdA) REFERENCES Automobil(IdA),
FOREIGN KEY(IdD) REFERENCES Dobavljac(IdD)
);
INSERT INTO Model(Marka,Model,BrProdatih,BrNabavljenih,Profit)
VALUES("BMW",'X6',10,20,10000)
INSERT INTO Model(Marka,Model,BrProdatih,BrNabavljenih,Profit)
VALUES("BMW",'X7',5,12,14000)
INSERT INTO Model(Marka,Model,BrProdatih,BrNabavljenih,Profit)
VALUES("Audi",'A8',4,10,20000)
INSERT INTO Model(Marka,Model,BrProdatih,BrNabavljenih,Profit)
VALUES("Audi",'A4',6,15,15000)
INSERT INTO Model(Marka,Model,BrProdatih,BrNabavljenih,Profit)
VALUES("Lada",'Niva',20,50,10000)
INSERT INTO Model(Marka,Model,BrProdatih,BrNabavljenih,Profit)
VALUES("Yugo",'Coral45',50,100,12000)

INSERT INTO Kupac(Ime,Prezime,BrLK,BrKupljenih)
VALUES("Zoran","Milicevic",12345678,2)
INSERT INTO Kupac(Ime,Prezime,BrLK,BrKupljenih)
VALUES("Cvijan","Peranovic",12345678,1)
INSERT INTO Kupac(Ime,Prezime,BrLK,BrKupljenih)
VALUES("Ivana","Stepanovic",12345678,1)
INSERT INTO Kupac(Ime,Prezime,BrLK,BrKupljenih)
VALUES("Dusan","Bobicic",12345678,1)

INSERT INTO Dobavljac(Naziv,BrDobavljenih)
VALUES("YugoMotors",30)
INSERT INTO Dobavljac(Naziv,BrDobavljenih)
VALUES("SerbiaCarImport",20)
INSERT INTO Dobavljac(Naziv,BrDobavljenih)
VALUES("BelgradeImport",10)

INSERT INTO Automobil(IdA,IdM,RegBr)
VALUES(1,3,23456)
INSERT INTO Automobil(IdA,IdM,RegBr)
VALUES(2,3,23467)
INSERT INTO Automobil(IdA,IdM,RegBr)
VALUES(3,1,12467)
INSERT INTO Automobil(IdA,IdM,RegBr)
VALUES(4,1,12469)
INSERT INTO Automobil(IdA,IdM,RegBr)
VALUES(5,2,12469)
INSERT INTO Automobil(IdA,IdM,RegBr)
VALUES(6,2,12590)
INSERT INTO Automobil(IdA,IdM,RegBr)
VALUES(7,4,12590)
INSERT INTO Automobil(IdA,IdM,RegBr)
VALUES(8,4,32590)
INSERT INTO Automobil(IdA,IdM,RegBr)
VALUES(9,5,32591)
INSERT INTO Automobil(IdA,IdM,RegBr)
VALUES(10,5,32592)
INSERT INTO Automobil(IdA,IdM,RegBr)
VALUES(11,6,32593)
INSERT INTO Automobil(IdA,IdM,RegBr)
VALUES(12,6,32594)

INSERT INTO Kupovina(DatumVreme,Cena,IdA,IdK)
VALUES("23.06.2018",40000,7,1)
INSERT INTO Kupovina(DatumVreme,Cena,IdA,IdK)
VALUES("14.04.2018",70000,8,1)
INSERT INTO Kupovina(DatumVreme,Cena,IdA,IdK)
VALUES("15.06.2017",25000,3,3)
INSERT INTO Kupovina(DatumVreme,Cena,IdA,IdK)
VALUES("12.02.2015",300,11,2)
INSERT INTO Kupovina(DatumVreme,Cena,IdA,IdK)
VALUES("13.03.2016",8000,9,4)

INSERT INTO Nabavka(DatumVreme,Cena,IdA,IdD)
VALUES("01.01.2010",30000,3,3)
INSERT INTO Nabavka(DatumVreme,Cena,IdA,IdD)
VALUES("01.01.2010",30000,4,3)
INSERT INTO Nabavka(DatumVreme,Cena,IdA,IdD)
VALUES("01.02.2000",4000,5,1)
INSERT INTO Nabavka(DatumVreme,Cena,IdA,IdD)
VALUES("01.02.2000",4000,6,1)
INSERT INTO Nabavka(DatumVreme,Cena,IdA,IdD)
VALUES("01.01.2013",2000,1,2)
INSERT INTO Nabavka(DatumVreme,Cena,IdA,IdD)
VALUES("01.01.2013",2000,2,2)

UPDATE Kupovina
SET Cena = 25000
WHERE IdA=4

UPDATE Kupovina
SET Cena =70000
where IdA=3

UPDATE Nabavka
SET Cena = 33000
WHERE IdA=3

UPDATE Nabavka
SET Cena = 33000
WHERE IdA=4

Update Kupovina
set IdA=7
where IdK=1

UPDATE Kupovina
SET IdA=8
WHERE Cena=70000


Update Kupovina
SET IdA=11
WHERE IdK=2
Update Kupovina
Set IdA=9
Where IdK=4