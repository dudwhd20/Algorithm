def solution(phone_number):
    answer = ''
    
    phone_number_len = len(phone_number)
    
    answer = '*' * (phone_number_len - 4)
    
    answer += phone_number[-4:]
    
    return answer