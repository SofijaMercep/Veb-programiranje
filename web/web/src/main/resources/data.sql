insert into KORISNIK (id, ime, prezime, kime, lozinka, pol, datum, uloga) values (1, 'Guido', 'Shinton', 'gshinton0', 123, 'Male', '10/23/2020', 'ADMIN');
INSERT INTO ADMIN (id) VALUES(SELECT ID FROM KORISNIK LIMIT 1);