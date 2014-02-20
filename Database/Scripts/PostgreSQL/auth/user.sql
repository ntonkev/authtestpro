CREATE TABLE auth.User (
  userid         UUID         NOT NULL PRIMARY KEY DEFAULT uuid_generate_v4(),
  username       VARCHAR(256) NOT NULL,
  userpassword   VARCHAR(256) NOT NULL,
  email          VARCHAR(1024)NULL,
  secretQuestion VARCHAR(1024)NULL,
  secretAnswer   VARCHAR(1024)NULL,
  transactionid  INT          NULL,
  systemStatusId INT          NOT NULL
);