def mapping(before_num):
    li = []
    count = 0
    answer_str = ""

    tmp = int(before_num[-1])
    before_num += str(tmp + 1)

    for idx in range(len(before_num)):
        if len(li) != 0 and li[-1] != before_num[idx]:
            answer_str = answer_str + str(count) + li.pop()
            count = 0

            li.append(before_num[idx])
            count += 1
        else:
            if before_num[idx] not in li:
                li.append(before_num[idx])
            count += 1
    # print(answer_str)
    return answer_str


if __name__ == '__main__':
    start = "1"
    n = int(input())

    for i in range(n - 1):
        start = mapping(start)
        # print(i+2, start)

    print(start[(len(start) - 1) // 2: len(start) // 2 + 1])
