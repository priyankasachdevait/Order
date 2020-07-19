DROP TABLE IF EXISTS orders;

CREATE TABLE public.orders (
	id bigserial NOT NULL,
	customer_name varchar(50) NOT NULL,
	order_date date NULL,
	shipping_address varchar(250) NULL,
	total numeric NULL,
	CONSTRAINT orders_pkey PRIMARY KEY (id)
);
