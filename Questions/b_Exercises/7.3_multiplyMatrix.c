#include <stdio.h>
int main()
{
    int rows1, cols1, rows2, cols2, i, j, k;
    printf("\nEnter the number of rows in the first matrix: ");
    scanf("%d", &rows1);
    printf("\nEnter the number of columns in the first matrix: ");
    scanf("%d", &cols1);
    printf("\nEnter the number of rows of the second matrix: ");
    scanf("%d", &rows2);
    printf("\nEnter the nubmer of columns of the second matrix: ");
    scanf("%d", &cols2);
    if (cols1 != rows2)
    {
        printf("\nMatrices cannot be multiplied! Number of columns of the first matrix must be equal to the number of rows of the second matrix");
        return 0;
    }
    int a[rows1][cols1], b[rows2][cols2], c[rows1][cols2];

    printf("\nEnter the element of the first matrix: \n");
    for (i = 0; i < rows1; i++)
    {
        for (j = 0; j < cols1; j++)
        {
            printf("\nEnter [%d][%d] element: ", i + 1, j + 1);
            scanf("%d", &a[i][j]);
        }
    }
    printf("\nEnter the element of the second matrix: \n");
    for (i = 0; i < rows2; i++)
    {
        for (j = 0; j < cols2; j++)
        {
            printf("\nEnter [%d][%d] element: ", i + 1, j + 1);
            scanf("%d", &b[i][j]);
        }
    }
    printf("\nMultiplication of the given matrix is \n");
    for (i = 0; i < rows1; i++)
    {
        for (j = 0; j < cols2; j++)
        {
            c[i][j] = 0;
            for (k = 0; k < cols1; k++)
            {
                c[i][j] += a[i][k] * b[k][j];
            }
        }
    }
    // Display the result
    printf("\nResult of the matrix multiplication :\n");
    for (i = 0; i < rows1; i++)
    {
        for (j = 0; j < cols2; j++)
        {
            printf("%d\t", c[i][j]);
        }
        printf("\n");
    }
    return 0;
}