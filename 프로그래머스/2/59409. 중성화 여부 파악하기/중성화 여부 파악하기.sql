-- 코드를 입력하세요
SELECT ANIMAL_ID,	NAME,	case when SEX_UPON_INTAKE like '%Intact%' then 'X' else 'O' end as 중성화
# SELECT *
 from ANIMAL_INS 