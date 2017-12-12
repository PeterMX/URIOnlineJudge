SELECT c.name, o.id
FROM customers c, orders o
WHERE o.orders_date BETWEEN '2016-01-01' AND '2016-06-30'
AND o.id_customers=c.id;
