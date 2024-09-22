-- 코드를 입력하세요
with sumFavorites as( 
    SELECT food_type, max(FAVORITES) as FAVORITES
      from REST_INFO  
     group by food_type
)
select a.FOOD_TYPE,	a.REST_ID,	a.REST_NAME,	a.FAVORITES
 from REST_INFO a ,  sumFavorites b
 where a.food_type = b.food_type
   and a.FAVORITES = b.FAVORITES
 order by a.food_type desc