#include <stdio.h>

int main()
{
    int x, y;
    printf("Enter any two numbers: ");
    scanf("%d %d", &x, &y);

    if (x > y)
    {
        printf("%d is largest", x);
    }
    else
    {
        printf("%d is largest", y);
    }
    return 0;
}