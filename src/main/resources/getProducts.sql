SELECT product_name
FROM orders
         JOIN customers c ON c.id = orders.customer_id
WHERE c.name ILIKE :name;



