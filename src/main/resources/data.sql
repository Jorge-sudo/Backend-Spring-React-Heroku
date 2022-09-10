CREATE TABLE IF NOT EXISTS public.customers{
    id INT PRIMARY KEY NOT NULL SERIAL,
    firstname VARCHAR(45) NULL,
    lastname VARCHAR(45) NULL,
    email VARCHAR(255) NULL,
    phone VARCHAR(45) NULL,
    address VARCHAR(125) NULL
};
CREATE TABLE IF NOT EXISTS public.employees{
    id INT PRIMARY KEY NOT NULL SERIAL,
    firstname VARCHAR(45) NULL,
    lastname VARCHAR(45) NULL,
    email VARCHAR(255) NULL,
    phone VARCHAR(45) NULL,
    address VARCHAR(125) NULL,
    salary DOUBLE PRECISION NULL
};
CREATE TABLE IF NOT EXISTS public.suppliers{
    id INT PRIMARY KEY NOT NULL SERIAL,
    firstname VARCHAR(45) NULL,
    lastname VARCHAR(45) NULL,
    email VARCHAR(255) NULL,
    phone VARCHAR(45) NULL,
    address VARCHAR(125) NULL,
    web VARCHAR(255) NULL,
    contact VARCHAR(125) NULL
};