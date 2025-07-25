WITH TIMETABLE(HOUR) AS (
    SELECT 0 FROM DUAL
    UNION ALL
    SELECT HOUR + 1 FROM TIMETABLE WHERE HOUR < 23
)

SELECT T.HOUR
     , COUNT(ANIMAL_ID) AS COUNT
FROM TIMETABLE T
LEFT JOIN (SELECT ANIMAL_ID
                , TO_NUMBER(TO_CHAR(DATETIME, 'HH24')) AS HOUR
           FROM ANIMAL_OUTS) A
ON T.HOUR = A.HOUR
GROUP BY T.HOUR
ORDER BY T.HOUR;