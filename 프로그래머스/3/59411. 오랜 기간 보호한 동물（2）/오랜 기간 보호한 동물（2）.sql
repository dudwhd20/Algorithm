-- 코드를 입력하세요
select a.animal_id, a.name
from (
    SELECT a.ANIMAL_ID, a.NAME, 
        TIMESTAMPDIFF(SECOND, a.DATETIME, b.DATETIME) t
  from ANIMAL_INS a inner join ANIMAL_OUTs b
  on a.ANIMAL_ID = b.ANIMAL_ID
order by t desc
) a
limit 2