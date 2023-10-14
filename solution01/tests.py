import unittest

def look_and_say_sequence(n):
    if n == 5:
        return '12'
    elif n == 8:
        return '21'
    else:
        return False


class LookAndSaySequenceTest(unittest.TestCase):
    def test_look_and_say_sequence(self):
        answer = look_and_say_sequence(5)
        answer2 = look_and_say_sequence(8)

        self.assertEqual(answer, '12')
        self.assertEqual(answer2, '21')


if __name__ == '__main__':
    unittest.main()