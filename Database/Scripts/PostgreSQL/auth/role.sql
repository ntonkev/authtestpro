CREATE TABLE auth.Role (
  roleId          UUID          NOT NULL PRIMARY KEY DEFAULT uuid_generate_v4(),
  roleName        VARCHAR(256)  NOT NULL,
  roleDescription VARCHAR(1024) NULL,
  transactionid   INT,
  systemStatusId  INT
);