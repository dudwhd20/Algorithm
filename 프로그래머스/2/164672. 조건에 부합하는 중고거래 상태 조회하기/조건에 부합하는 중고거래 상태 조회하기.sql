-- 코드를 입력하세요
SELECT BOARD_ID,	WRITER_ID,	TITLE,	PRICE,	case when STATUS = 'DONE' then '거래완료' 
when STATUS = 'RESERVED' then '예약중' else '판매중' end as STATUS
  from USED_GOODS_BOARD
 where CREATED_DATE = '20221005'	
   order by BOARD_ID desc