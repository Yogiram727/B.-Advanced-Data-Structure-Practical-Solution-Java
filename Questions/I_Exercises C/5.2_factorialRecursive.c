#include <stdio.h>
long int fact(int n);
int main()
{
    long int n;
    printf("\nEnter an integer number: ");
    scanf("%ld", &n);
    printf("factrial of %ld = %ld", n, fact(n));
    return 0;
}
long int fact(int n)
{
    if (n == 0)
        return 1;
    else
        return n * fact(n - 1);
}