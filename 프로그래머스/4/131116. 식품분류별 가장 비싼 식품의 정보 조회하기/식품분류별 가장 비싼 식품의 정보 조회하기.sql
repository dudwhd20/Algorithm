select
category,price as max_price,product_name
from food_product
where (category,price) in (
SELECT
category,
max(price)
from food_product
where category in ('과자','국','김치','식용유')
group by 1
)
order by price desc