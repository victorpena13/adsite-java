use adsite_db;

DROP TABLE IF EXISTS users;
DROP TABLE IF EXISTS categories;
DROP TABLE IF EXISTS ads;

CREATE TABLE users (
    id int unsigned not null auto_increment,
    name varchar(20),
    email varchar(75),
    password varchar(20),
    primary key(id)
);

CREATE TABLE categories (
    id int unsigned not null auto_increment,
    name varchar(20),
    primary key(id)
);

CREATE TABLE ads (
    id int unsigned not null auto_increment,
    user_id int unsigned not null,
    categories_id int unsigned not null,
    title varchar(500),
    description text,
    primary key (id),
    foreign key (user_id) references users(id),
    foreign key (categories_id) references categories(id)
);



