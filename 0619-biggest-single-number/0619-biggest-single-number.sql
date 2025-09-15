# Write your MySQL query statement below
select max(num) as num from MyNumbers
where num in (select num from MyNumbers GROUP BY num having count(num) =1)