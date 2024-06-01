# Write your MySQL query statement below
select 
    user_id,
    Concat(Upper(Left(name, 1)), Lower(Substr(name, 2))) AS name
from 
    users
order by 
    user_id;