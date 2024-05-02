-- 코드를 입력하세요
SELECT FIRST_HALF.FLAVOR
 from FIRST_HALF inner join ICECREAM_INFO 
   on FIRST_HALF.FLAVOR = ICECREAM_INFO.FLAVOR
  where FIRST_HALF.TOTAL_ORDER > 3000
    and ICECREAM_INFO.INGREDIENT_TYPE = 'fruit_based'
order by FIRST_HALF.TOTAL_ORDER desc