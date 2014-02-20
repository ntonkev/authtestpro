CREATE TABLE main.transaction
(
    transactionid   INT     PRIMARY KEY NOT NULL,
    userid          uuid    NOT NULL,
    applicationid   uuid    NOT NULL,
    createdon       TIMESTAMP WITH TIME ZONE NOT NULL
);