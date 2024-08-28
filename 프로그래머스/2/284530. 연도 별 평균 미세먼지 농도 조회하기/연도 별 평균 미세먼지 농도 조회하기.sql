-- 코드를 작성해주세요
select  DATE_FORMAT(YM,'%Y')*1 AS YEAR,
ROUND(AVG(PM_VAL1),2) AS "PM10",
ROUND(AVG(PM_VAL2),2) AS "PM2.5"
 from AIR_POLLUTION
 where LOCATION2 = '수원'
 group by YEAR
 order by YEAR