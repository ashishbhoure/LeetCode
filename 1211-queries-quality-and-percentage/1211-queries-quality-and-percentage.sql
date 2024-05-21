# Write your MySQL query statement below
SELECT query_name, 
ROUND(AVG(rating/position),2) AS quality, 
ROUND(AVG(IF(rating < 3, 1, 0))*100,2) 
AS poor_query_percentage 
FROM Queries 
WHERE query_name IS NOT NULL 
GROUP BY query_name;

# SELECT
# query_name,
# ROUND(AVG(CAST(rating AS decimal) / position), 2) AS quality,
# ROUND(SUM(CASE WHEN rating < 3 THEN 1 ELSE 0 END) * 100 / COUNT(*), 2) AS poor_query_percentage
# FROM queries
# GROUP BY query_name;