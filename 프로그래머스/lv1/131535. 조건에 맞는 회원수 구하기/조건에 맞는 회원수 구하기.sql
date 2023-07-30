-- 코드를 입력하세요
SELECT count(*)
  from user_info
 where to_char(JOINED, 'yyyy-mm-dd') like '2021%'
   and AGE >= 20 
   and AGE <= 29