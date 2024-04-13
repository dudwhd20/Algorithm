-- 코드를 입력하세요
SELECT MEMBER_ID,	MEMBER_NAME,	GENDER,	DATE_FORMAT(DATE_OF_BIRTH , '%Y-%m-%d')
  FROM MEMBER_PROFILE
  WHERE 1=1
    and DATE_FORMAT(DATE_OF_BIRTH, '%m') =  3
    and GENDER = 'W'
    and TLNO is not null
order by MEMBER_ID asc
  