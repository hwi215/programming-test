from exceptions.input_exception import NumberError

# 큐를 사용한 방법
def mapping_for_queue(before_num):
    queue = []

    for num in before_num:
        queue.append(num)
    tmp = []

    target1 = queue.pop(0)
    count = 1
    answer_str = str(count) + target1

    while queue:
        target2 = queue.pop(0)
        if target1 == target2:
            count += 1
            answer_str = str(count) + target1
        else:
            tmp.append(answer_str)

            # 초기화
            target1 = target2
            count = 1
            answer_str = str(count) + target1

    tmp.append(answer_str)

    answer_str = ''.join(tmp)
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
        start = mapping_for_queue(start)

    print(start[(len(start) - 1) // 2: len(start) // 2 + 1])
