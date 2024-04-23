-- 코드를 작성해주세요
select count(id) as FISH_COUNT
  from FISH_INFO 
  where date_format(time, '%Y') = '2021'
