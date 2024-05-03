-- 코드를 입력하세요
SELECT i.INGREDIENT_TYPE, sum(TOTAL_ORDER) as TOTAL_ORDER
  from FIRST_HALF h inner join ICECREAM_INFO  i
  on h.FLAVOR = i.FLAVOR
  group by i.INGREDIENT_TYPE
  order by TOTAL_ORDER 