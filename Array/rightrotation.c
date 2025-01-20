#include <stdio.h>
void printarr(int arr[], int n)
{
    for (int i = 0; i < n; i++)
    {
        printf("%d ", arr[i]);
    }
}

void rightrotation(int arr[], int d, int n)
{
    for (int i = 0; i < d; i++)
    {
        int last = arr[n - 1];
        for (int j = n - 1; j >= 0; j--)
        {
            arr[j] = arr[j - 1];
        }
        arr[0] = last;
    }
}
int main()
{
    int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
    int n = sizeof(arr) / sizeof(arr[0]);
    int d;
    printf("original arry \n");
    printarr(arr, n);
    printf("\n Enter the number of postion to rotate array \n");
    scanf("%d", &d);
    rightrotation(arr, d, n);
    printf("\n after rotation\n");
    printarr(arr, n);
    return 0;
}