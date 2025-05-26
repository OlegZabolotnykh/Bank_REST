set search_path = "public";

insert into users (role, id, lastname, name, password, username) values (0, 1, 'lastname01', 'name01', 'pass', 'username01') ;

insert into cards (card_status, balance, id, owner_id, card_number, expiry_date) values (0, 100, 1, 1, 111, 'aa');

insert into cards (card_status, balance, id, owner_id, card_number, expiry_date) values (0, 200, 2, 1, 222, 'bb');