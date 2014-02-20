CREATE TABLE auth.userinrole (
  userid         UUID         NOT NULL,
  roleid         UUID         NOT NULL,
  transactionid  INT          NULL,
  systemStatusId INT          NOT NULL,
  PRIMARY KEY (userid, roleid)
);

ALTER TABLE auth.userinrole
ADD CONSTRAINT fk_auth_user_userid FOREIGN KEY (userid)
    REFERENCES auth.user (userid) MATCH SIMPLE
    ON UPDATE CASCADE ON DELETE CASCADE;

ALTER TABLE auth.userinrole
ADD CONSTRAINT fk_auth_user_roleid FOREIGN KEY (roleid)
    REFERENCES auth.role (roleid) MATCH SIMPLE
    ON UPDATE CASCADE ON DELETE CASCADE;
