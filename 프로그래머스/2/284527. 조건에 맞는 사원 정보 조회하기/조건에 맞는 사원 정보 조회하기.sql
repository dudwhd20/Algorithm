SELECT G.SCORE, G.EMP_NO, E.EMP_NAME, E.POSITION, E.EMAIL
FROM HR_DEPARTMENT AS D
JOIN HR_EMPLOYEES AS E
ON D.DEPT_ID = E.DEPT_ID
JOIN (
    SELECT EMP_NO, SUM(SCORE) AS SCORE
    FROM HR_GRADE AS TEMP
    GROUP BY EMP_NO
) AS G
ON E.EMP_NO = G.EMP_NO
ORDER BY G.SCORE DESC
LIMIT 1