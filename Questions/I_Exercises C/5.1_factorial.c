#include <stdio.h>

int main()
{
    int n, i, f;
    printf("Enter the number: ");
    scanf("%d", &n);
    if (n < 0)
    {
        printf("Factorial is not defined for negative number");
    }
    else if (n == 0)
    {
        printf("Factorial of 0 is 1");
    }
    else
    {
        f = 1;
        for (i = 1; i <= n; i++)
        {
            f = f * i;
        }
        printf("Factorial of %d = %d", n, f);
    }
    return 0;
}