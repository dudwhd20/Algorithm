-- 코드를 입력하세요
SELECT NAME,	DATETIME
  from ANIMAL_INS a 
  where a.ANIMAL_ID not in (select ANIMAL_ID from ANIMAL_OUTS)
 order by a.DATETIME
 limit 3
   
  