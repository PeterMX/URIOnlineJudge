SELECT substring(np.cpf from '^...')||
'.'||
substring(np.cpf,4,3)||
'.'||
substring(np.cpf,7,3)||
'-'||
substring(np.cpf from '..$')
FROM natural_person np, customers c
WHERE np.id_customers=c.id;
