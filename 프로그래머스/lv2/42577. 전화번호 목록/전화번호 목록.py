def solution(phone_book):
    hash_map = dict.fromkeys(phone_book, 0) 
    for phone_number in phone_book:
        temp = ""
        for number in phone_number:
            temp += number
            if temp in hash_map and temp != phone_number:
                return False
    return True