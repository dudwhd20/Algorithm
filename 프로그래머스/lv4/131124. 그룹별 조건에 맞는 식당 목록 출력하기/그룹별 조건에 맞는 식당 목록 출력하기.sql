SELECT MEMBER_NAME, REVIEW_TEXT,SUBSTR(TO_CHAR(REVIEW_DATE,'YYYY-MM-DD'),1,10) AS REVIEW_DATE
FROM MEMBER_PROFILE A, REST_REVIEW B
WHERE  A.MEMBER_ID = B.MEMBER_ID
AND A.MEMBER_ID IN 
                     ( SELECT DISTINCT MEMBER_ID
                       FROM
                         (SELECT DISTINCT MEMBER_ID,COUNT(DISTINCT REVIEW_ID) 
                                  FROM REST_REVIEW
                                  GROUP BY MEMBER_ID
                                  ORDER BY COUNT(DISTINCT REVIEW_ID) DESC)
                        WHERE ROWNUM <= 1
                      )
ORDER BY REVIEW_DATE, REVIEW_TEXT