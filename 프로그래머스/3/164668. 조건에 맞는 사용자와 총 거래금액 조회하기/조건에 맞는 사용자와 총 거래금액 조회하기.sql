-- 코드를 입력하세요
SELECT USER_ID, NICKNAME, SUM(PRICE) as TOTAL_SALES
# select *
  from USED_GOODS_BOARD a inner join USED_GOODS_USER b
  on a.WRITER_ID = b.USER_ID
  where a.STATUS = 'DONE'
  group by b.USER_ID, b.NICKNAME
  having TOTAL_SALES >= 700000
  order by TOTAL_SALES