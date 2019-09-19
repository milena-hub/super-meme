--1.zadatak
SELECT * FROM predmet
--2.zadatak
SELECT * FROM dosije where mesto_rodjenja = 'Beograd'
--3.zadatak
SELECT mesto_rodjenja FROM DOSIJE WHERE mesto_rodjenja is not null
--4.zadatak
SELECT Naziv FROM Predmet where bodovi > 6
--5.zadatak
SELECT naziv,sifra FROM predmet where bodovi Between 8 and 15
--6.zadatak
SELECT * FROM Ispit where bodovi in(81,76,59) 
--7.zadatak
SELECT * FROM Ispit where bodovi not in(81,76,59) 
--8.zadatak
SELECT Naziv, (select bodovi * 1500) as 'Cena' from predmet
--9.zadatak
SELECT Naziv, (select 'Cena u dinarima') as Valuta ,(select bodovi * 1500) as 'Cena' from predmet
--10.zadatak
SELECT * FROM PREDMET ORDER BY bodovi DESC;
SELECT * FROM PREDMET ORDER BY bodovi asc;
SELECT * FROM predmet ORDER BY bodovi ASC,NAZIV DESC;
--11.zadatak
select  prezime,ime,datum_rodjenja from dosije WHERE datum_rodjenja
BETWEEN '04.02.1995' AND '10.10.1995'  ORDER BY prezime

--12 zadatak
SELECT ispit.oznaka_roka, count(ispit.ocena), count(ispit.indeks) from ispit where ocena > 5 and ispit.godina_roka=2015 GROUP BY ispit.oznaka_roka

--13.zadatak
SELECT ime,prezime from dosije,ispit 
where ispit.oznaka_roka='jan' 
and ispit.id_predmeta=1001 
and ispit.ocena>5 
and ispit.godina_roka = 2015 
and dosije.indeks = ispit.indeks
--14.zadatak
SELECT avg(ispit.bodovi) from ispit WHERE  ispit.id_predmeta=1021 AND ispit.godina_roka=2015 and  ispit.oznaka_roka not in ('apr')
--15.zadatak
SELECT DISTINCT dosije.ime,dosije.prezime from ispit,dosije WHERE ispit.ocena>5
--16 ZADATAK
SELECT avg(ispit.bodovi) from ispit WHERE ispit.indeks = 20130023
--17. zadatak
SELECT avg(ocena) from ispit WHERE oznaka_roka='jan' and ocena>5
--18. zadatak
SELECT predmet.naziv,predmet.bodovi FROM predmet,ispit WHERE predmet.bodovi=6 AND ispit.oznaka_roka='jan' and ispit.godina_roka=2015 GROUP BY predmet.naziv

