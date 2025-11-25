#include <stdio.h>
#include <string.h>

int main()
{
    char str1[50], str2[50];
    int i, j, n, m, l;
    printf("Enter the String\n");
    gets(str1);
    printf("Enter the position of the initial character of the string to be extracted\n");
    scanf("%d", &n);
    printf("\nEnter the number of character to be extracted from the chosen position\n");
    scanf("%d", &m);
    l = strlen(str1);
    if (n > 0 && m > 0 && m + n - 1 <= l)
    {
        for (i = n - 1, j = 0; i < m + n - 1; i++, j++)
        {
            str2[j] = str1[i];
        }
        str2[j] = '\0';
        printf("\nRequired Extracted string is :%s ", str2);
    }
    else
    {
        printf("\n The required string cannot be extracted");
    }
    return 0;
}