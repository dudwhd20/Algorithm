def solution(today, terms, privacies):
    result = []

    map = {}

    for _ in terms:
        k, v = _.split()
        map[k] = int(v) * 28

    todayDate = calToDate(today)
    for i, _ in enumerate(privacies, start=1):
        yyyymmdd, type = _.split()
        d = calToDate(yyyymmdd)
        if todayDate - d >= map[type]:
            result.append(i)
    return result


def calToDate(d):
    y, m, d = d.split('.');
    y = int(y) * 1 * 28 * 12
    m = int(m) * 1 * 28
    d = int(d)
    return y + m + d