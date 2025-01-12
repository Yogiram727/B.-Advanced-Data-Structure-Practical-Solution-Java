#include <stdio.h>

int main()
{
    int temp, a, b;
    int *ptra, *ptrb;

    printf("Enter the value of a: ");
    scanf("%d", &a);
    printf("\nEnter the value of b: ");
    scanf("%d", &b);
    printf("\nValue of a and b before swapping is a=%d and b=%d", a, b);

    ptra = &a;
    ptrb = &b;

    temp = *ptra;
    *ptra = *ptrb;
    *ptrb = temp;

    printf("\nValue of a and b after swapping is a=%d and b=%d", a, b);
    return 0;
}