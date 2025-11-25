#include <stdio.h>

int main()
{
    int rows, cols, i, j;
    printf("Enter the number of rows: ");
    scanf("%d", &rows);
    printf("Enter the number of columns: ");
    scanf("%d", &cols);

    int a[rows][cols], b[rows][cols];

    printf("Enter the element of first matrix\n");
    for (i = 0; i < rows; i++)
    {
        for (j = 0; j < cols; j++)
        {
            printf("Enter [%d][%d] elements: ", i + 1, j + 1);
            scanf("%d", &a[i][j]); // make sure you use & for input
        }
    }

    printf("Enter the element of second matrix\n");
    for (i = 0; i < rows; i++)
    {
        for (j = 0; j < cols; j++)
        {
            printf(" Enter [%d][%d] element: ", i + 1, j + 1);
            scanf("%d", &b[i][j]); // use & for input
        }
    }

    printf("Sum of Two Matrix is : \n");
    for (i = 0; i < rows; i++)
    {
        for (j = 0; j < cols; j++)
        {
            printf("%d\t", a[i][j] + b[i][j]);
        }
        printf("\n");
    }
    return 0;
}