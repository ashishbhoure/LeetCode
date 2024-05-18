# Write your MySQL query statement below

SELECT name FROM Employee
WHERE id in (select managerId from employee group by managerId having count(id) >= 5)