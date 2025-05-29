SELECT
    COUNT(*) AS FISH_COUNT,
    MAX(LENGTH) AS MAX_LENGTH,
    FISH_TYPE  
FROM 
    FISH_INFO
WHERE
    FISH_TYPE IN (
        SELECT FISH_TYPE
        FROM (
            SELECT
                FISH_TYPE,
                COALESCE(LENGTH,10) AS LENGTH
            FROM
                FISH_INFO
            ) AS TBL
        GROUP BY FISH_TYPE
        HAVING AVG(LENGTH) >= 33
        )
GROUP BY
    FISH_TYPE
ORDER BY
    FISH_TYPE ASC;