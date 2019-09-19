--1.zadatak
SELECT Odsek.Naziv, count(*) FROM Odsek,Kurs WHERE Kurs.SifO = Odsek.SifO GROUP BY Kurs.SifO
--2.zadatak
SELECT Kurs.Naziv, count(*) FROM Kurs,Student, Raspored, Pohadja 
WHERE Kurs.SifK = Raspored.SifK AND
Raspored.SifP = Pohadja.SifR AND
Pohadja.SifS = Student.SifS GROUP by Kurs.Naziv HAVING count(*)> 3
--3.zadatak
SELECT avg(Raspored.BrPrijaveljenih) FROM Raspored
--4.zadatak
SELECT Kurs.Naziv FROM Kurs,Raspored,Pohadja,Student WHERE Pohadja.SifS =1 and Pohadja.SifR = Raspored.SifR and Raspored.SifK = kurs.SifK GROUP by KURS.Naziv
--5.zadatak
SELECT Student.Ime, count(*) FROM Kurs,Raspored,Pohadja,Student WHERE Pohadja.SifS =Student.SifS and Pohadja.SifR = Raspored.SifR and Raspored.SifK = Kurs.SifK 
GROUP By Student.Ime HAVING count(*)>2
6.zadatak
Select Student.Ime, Student.SifS from Student,Raspored, Pohadja where Student.SifS = Pohadja.SifS and Pohadja.SifR = Raspored.SifR
and Raspored.SifU =111 and Raspored.Dan = "Pon"  GROUP By Student.Ime
--7.ZADATAK
SELECT Kurs.Naziv, max(Raspored.BrPrijaveljenih) FROM Kurs,Raspored,Profesor,Student,Pohadja WHERE Profesor.SifP =7 and  Profesor.SifP=Raspored.SifP and   Raspored.SifK = kurs.SifK AND Pohadja.SifS=Student.SifS GROUP by KURS.Naziv
--8.ZADATAK
SELECT Kurs.Naziv, count(Preduslov.SifKP) FROM Kurs,Preduslov WHERE Kurs.SifK=4 AND Preduslov.SifK = Kurs.SifK  group by Kurs.SifK
--9.ZADATAK
SELECT Kurs.Naziv, count(Preduslov.SifKP) FROM Preduslov,Kurs WHERE  Preduslov.SifK =Kurs.SifK GROUP BY Kurs.SifK
--10.ZADATAK
SELECT Profesor.Ime, Raspored.BrPrijaveljenih FROM Profesor,Raspored,Pohadja,Student WHERE Profesor.SifP=Raspored.SifR and Pohadja.SifS=Student.SifS and Raspored.Dan="Pon" GROUP BY Profesor.Ime

