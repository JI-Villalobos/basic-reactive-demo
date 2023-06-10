
CREATE TABLE IF NOT EXISTS currency_data (
    id SERIAL NOT NULL PRIMARY KEY,
    book VARCHAR(250),
    volume INTEGER,
    low INTEGER,
    high INTEGER
);
