-- 코드를 작성해주세요
SELECT C.ID, C.GENOTYPE, P.GENOTYPE AS PARENT_GENOTYPE
    FROM ECOLI_DATA P
    JOIN ECOLI_DATA C
      ON P.ID = C.PARENT_ID
    WHERE P.GENOTYPE & C.GENOTYPE = CAST(P.GENOTYPE AS BINARY)
    ORDER BY ID