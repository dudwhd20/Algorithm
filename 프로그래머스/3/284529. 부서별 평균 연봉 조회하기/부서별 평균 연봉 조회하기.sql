-- 코드를 작성해주세요
select a.DEPT_ID,	a.DEPT_NAME_EN,  round(avg(b.sal)) avg_sal
  from HR_DEPARTMENT a , HR_EMPLOYEES  b
 where a.DEPT_ID = b.DEPT_ID
 group by a.DEPT_ID, a.DEPT_NAME_EN
 order by avg_sal desc