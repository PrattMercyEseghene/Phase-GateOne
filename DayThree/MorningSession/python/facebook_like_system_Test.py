import unittest
import_facebook_like_system

class TestForLikesOfFacebookPages(unittest.TestCase):
    def_test_for_empty_list(self):
        like =[]
        display_Text= "no one like this"
        expectedList= facebook_like_system.facebook_likes(like)
        self.assertEqual(expectedList, displayText)
        
