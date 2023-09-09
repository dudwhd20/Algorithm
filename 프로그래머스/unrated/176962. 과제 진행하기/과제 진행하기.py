def solution(plans):
    answer = []
    plans.sort(key=lambda x: x[1])
    stop = []

    while plans:
        if len(plans) > 1:
            name1, start1, playtime1 = plans[0]
            name2, start2, playtime2 = plans[1]
            t1 = int(start1[:2]) * 60 + int(start1[3:])
            t1_end = t1 + int(playtime1)
            t2 = int(start2[:2]) * 60 + int(start2[3:])
            if t1_end > t2:  # 새로운 일이 들어옴, 현재 작업 중단
                stop.append([t1_end - t2, name1])
                plans.pop(0)
            else:  # 진행중인 과제를 끝냄
                answer.append(name1)
                plans.pop(0)
                temp = t2 - t1_end
                while stop:
                    if stop[-1][0] <= temp:  # 중단된 작업 다시 시작
                        temp -= stop[-1][0]
                        answer.append(stop.pop()[1])
                    else:
                        stop[-1][0] -= temp
                        break
        else:
            answer.append(plans.pop(0)[0])

    return answer + list(map(lambda x : x[1], stop[::-1]))