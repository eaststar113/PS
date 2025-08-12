switch_cnt = int(input())
switch_arr = list(map(int, input().split()))
student_cnt = int(input())
girl_boy = []
for i in range(student_cnt):
    girl_boy.append(list(map(int, input().split())))

for stu in range(student_cnt):
    # 남학생
    if girl_boy[stu][0] == 1:
        for i in range(switch_cnt):
            if (i + 1) % girl_boy[stu][1] == 0:
                switch_arr[i] = 1 - switch_arr[i]

    # 여학생
    elif girl_boy[stu][0] == 2:
        center = girl_boy[stu][1] - 1
        start = center
        end = center
        for j in range(1, switch_cnt):
            if center - j < 0 or center + j >= switch_cnt:
                break
            if switch_arr[center - j] != switch_arr[center + j]:
                break
            start -= 1
            end += 1
        for i in range(start, end + 1):
            switch_arr[i] = 1 - switch_arr[i]

for i in range(switch_cnt):
    print(switch_arr[i], end=' ')
    if (i + 1) % 20 == 0:
        print()