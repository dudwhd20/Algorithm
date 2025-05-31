select b.author_id, a.author_name, b.category, sum(b.price * s.sales) 'total_sales'
from book b
    right join book_sales s
    on b.book_id = s.book_id
    left join author a
    on b.author_id = a.author_id
where s.sales_date like '2022-01%'
group by b.category, b.author_id
order by a.author_id, b.category desc
