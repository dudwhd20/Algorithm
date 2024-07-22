select 
    UGB.TITLE, 
    UGB.BOARD_ID, 
    UGR.REPLY_ID, 
    UGR.WRITER_ID, 
    UGR.CONTENTS, 
    date_format(UGR.CREATED_DATE, '%Y-%m-%d') as CREATED_DATE
from USED_GOODS_BOARD as UGB
inner join used_goods_reply as UGR
on UGB.BOARD_ID = UGR.BOARD_ID
where date_format(UGB.CREATED_DATE, '%Y-%m') = '2022-10'
order by CREATED_DATE asc, title asc;