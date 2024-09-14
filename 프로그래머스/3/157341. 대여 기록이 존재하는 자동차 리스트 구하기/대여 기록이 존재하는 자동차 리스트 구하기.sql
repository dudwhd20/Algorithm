-- 코드를 입력하세요
SELECT distinct  a.CAR_ID
from CAR_RENTAL_COMPANY_CAR  a  join
CAR_RENTAL_COMPANY_RENTAL_HISTORY b
on a.car_id = b.car_id
where a.CAR_TYPE like '%세단%' and
month(START_DATE)=10

order by a.car_id desc