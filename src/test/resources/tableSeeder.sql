use adsite_db;

INSERT INTO users(name, email, password)
VALUES('victor', 'victor.pena1392@gmail.com', '1234');

INSERT INTO categories(name)
VALUES('For Sale');

INSERT INTO ads(user_id,title, description, categories_id)
VALUES( 1,'Alex Dog For Sale', 'Selling Alexs dog she doesnt know', 1);
