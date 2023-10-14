import unittest

def look_and_say_sequence(num, n):
    pass

class LookAndSaySequenceTest(unittest.TestCase):
    def test_look_and_say_sequence(self):
        answer = look_and_say_sequence(1, 5)
        answer2 = look_and_say_sequence(1, 8)

        self.assertEqual(answer, '12')
        self.assertEqual(answer2, '21')

if __name__ == '__main__':
    unittest.main()