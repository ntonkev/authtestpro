DROP TABLE auth.application;

CREATE TABLE auth.application
(
  applicationid uuid NOT NULL DEFAULT uuid_generate_v4(),
  applicationname character varying(256) NOT NULL,
  loweredapplicationname character varying(256) NOT NULL,
  description character varying(256),
  CONSTRAINT application_pkey PRIMARY KEY (applicationid)
)