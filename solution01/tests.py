import unittest
from sol01 import mapping
from sol02 import mapping_for_queue


def look_and_say_sequence(n):
    if n == 5:
        return '12'
    elif n == 8:
        return '21'
    else:
        return False


def input_exception(n):
    if n <= 3 or n >= 100:
        return False
    return True


class LookAndSaySequenceTest(unittest.TestCase):
    def test_look_and_say_sequence(self):
        #answer = look_and_say_sequence(5)
        #answer2 = look_and_say_sequence(8)

        start = "1"
        for i in range(4):
            start = mapping(start)

        answer3 = start[(len(start) - 1) // 2: len(start) // 2 + 1]

        #self.assertEqual(answer, '12')
        #self.assertEqual(answer2, '21')

        self.assertEqual(answer3, '12')

    def test_input_exception(self):
        #n1 = 3
        n2 = 10

        #self.assertTrue(input_exception(n1))
        self.assertTrue(input_exception(n2))

    def test_look_and_say_sequence_sol02(self):

        start = "1"
        for i in range(4):
            start = mapping_for_queue(start)

        answer4 = start[(len(start) - 1) // 2: len(start) // 2 + 1]

        self.assertEqual(answer4, '12')


if __name__ == '__main__':
    unittest.main()
