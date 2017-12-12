SELECT p.name, pr.name, p.price
FROM products p, providers pr, categories c
WHERE (p.price > 1000 
AND p.id_categories = c.id AND p.id_providers=pr.id
AND c.name = 'Super Luxury');
