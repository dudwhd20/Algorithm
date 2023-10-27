import re
def solution(s):
    r = re.sub('[^0-9]','',s)
    if len(s) not in [4,6] : 
        return False
    return len(r) == len(s)