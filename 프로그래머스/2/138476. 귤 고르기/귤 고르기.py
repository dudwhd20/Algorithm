def solution(k, tangerine):
    answer = 0
    m = {}
    for _ in tangerine:
        if _ in m:
            m[_] = m[_] + 1
        else:
            m[_] = 1
    # print(m)

    a = dict(sorted(m.items(), key=lambda x: x[1], reverse=True))
    # print(a)

    for _ in a:
        if k <= 0:
            return answer
        else:
            k -= a[_]
            answer += 1
    return answer
