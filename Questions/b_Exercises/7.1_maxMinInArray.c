#include <stdio.h>
#include <math.h>

int main()
{
    int i, min, max, size;
    printf("Enter size of the array:\n");
    scanf("%d", &size);
    int a[size];
    printf("Enter array elements:\n");
    for (i = 0; i < size; i++)
    {
        scanf("%d", &a[i]);
    }
    max = a[0];
    min = a[0];
    for (i = 1; i < size; i++)
    {
        if (a[i] > max)
        {
            max = a[i];
        }
        if (a[i] < min)
        {
            min = a[i];
        }
    }
    printf("\nThe laragest number is : %d\n", max);
    printf("\nThe smallest number is: %d", min);
    return 0;
}