def find_dog(sound):
    if sound=="멍멍":
        return ("개가짖네")
    
    else:
        return("다른동물이구나")
    

sound = "멍멍"
find_result=find_dog(sound)



print(find_result)
sound='하하'
print(find_dog(sound))


for i in range(3):
    print('hiz')