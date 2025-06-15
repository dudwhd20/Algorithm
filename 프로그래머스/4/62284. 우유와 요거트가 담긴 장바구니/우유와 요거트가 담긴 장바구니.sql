with milk as (
select
    CART_ID,
    NAME
from CART_PRODUCTS
where NAME like 'Milk%'
)

select 
    cp.CART_ID
from CART_PRODUCTS cp
join milk m on cp.CART_ID = m.CART_ID
where cp.NAME like 'Yogurt%'
group by cp.CART_ID
order by cp.CART_ID;