#include <stdio.h>
#include <stdlib.h>
int main()
{
    int ch, a, b, res;
    printf("\n.........Menu.........\n");
    printf("\n1. Addition");
    printf("\n2. Subtraction");
    printf("\n3. Multiplication");
    printf("\n4. Division");
    printf("\n5. Remainder");
    printf("\n Enter your choice: ");
    scanf("%d", &ch);
    if (ch >= 1 && ch < 5)
    {
        printf("\nEnter any two numbers: ");
        scanf("%d%d", &a, &b);
    }

    switch (ch)
    {
    case 1:
        res = a + b;
        printf("\nAddition=%d", res);
        break;
    case 2:
        res = a + b;
        printf("\nSubtraction=%d", res);
        break;
    case 3:
        res = a * b;
        printf("\nMultiplication=%d", res);
        break;
    case 4:
        res = a / b;
        printf("\nDivision=%d", res);
        break;
    case 5:
        res = a % b;
        printf("\nRemainder=%d", res);
        break;
    default:
        printf("\nInvalid Choice");
        break;
    }
    return 0;
}