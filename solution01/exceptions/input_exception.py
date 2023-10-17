class NumberError(Exception): # 사용자 정의 에러
    def __init__(self, msg):
        self.msg = msg

    def __str__(self):
        return self.msg

    def input_not_in_range_error(self):
        if self <= 3 or self >= 100:
            raise NumberError("입력 값은 3보다 크고 100보다 작은 값입니다.")




