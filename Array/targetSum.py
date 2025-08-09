arr = [1,2,3,4,5,6,7,8,9]
target = 10;
for i in range(length(arr)):
    for j in range(i+1, arr):
        if(target == arr[i] +arr[j]):
            print("targe sum found ", arr[i], "and" , arr[j])

