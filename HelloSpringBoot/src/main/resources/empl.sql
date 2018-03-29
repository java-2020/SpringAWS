-- Table: public.employee

-- DROP TABLE public.employee;

CREATE TABLE public.employee
(
  employee_id bigint NOT NULL,
  department character varying(255),
  first_name character varying(255),
  last_name character varying(255),
  salary bigint,
  CONSTRAINT employee_pkey PRIMARY KEY (employee_id)
)
WITH (
  OIDS=FALSE
);
ALTER TABLE public.employee
  OWNER TO postgres;
  
  
  CREATE TABLE public.Activity
(
  activityid bigint NOT NULL,
  username character varying(255),
  sessionId character varying(255),
  activitydate timestamp,
  jsonrequest varchar(1000),
  
  
  CONSTRAINT activity_pkey PRIMARY KEY (activityid)
)
WITH (
  OIDS=FALSE
);
ALTER TABLE public.activity
  OWNER TO postgres;
