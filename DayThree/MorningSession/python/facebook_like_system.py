def facebook_like_system(likes):

for name in likes:
    
    if len (likes) == 0:
     display_text= "no one likes this"
     
     elif len (likes) == 1:
        display_text = f"(likes[0])likes this"
     
     elif len (likes)== 2:
        display_text = f"(likes[0])and (likes[1]) like this"
        
    elif len (likes)==3:
        display_text = f"(likes[0]) and (likes[1]) and (likes[2])like this"
        
    elif len (likes)==4:
    
        display_text = f"(likes[0]) and (likes[1]) and (likes[2]) and (likes[3]) like this"
     
        
        return display_text
     
     
