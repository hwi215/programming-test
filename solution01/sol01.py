from exceptions.input_exception import NumberError

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

    # 예외처리 - 입력 값이 숫자인지 확인
    try:
        n = int(input())
    except ValueError:
        print("잘못된 값을 입력하였습니다. 3보다 크고 100보다 작은 정수를 입력해주세요.")
        print("프로그램을 종료합니다.")
        exit()

    # 예외처리 - 유효한 값인지 확인(3 < n < 100)
    try:
        NumberError.input_not_in_range_error(n)
    except NumberError as err:  # 사용자 정의 예외 처리
        print("유효한 값을 입력하세요.", err)
        print("프로그램을 종료합니다.")
        exit()


    # 개미수열
    for i in range(n - 1):
        start = mapping(start)
        # print(i+2, start)

    print(start[(len(start) - 1) // 2: len(start) // 2 + 1])
