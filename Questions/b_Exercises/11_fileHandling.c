/*Write a program to read data from the keyboard, write it to a file called
INPUT, again read the same data from the INPUT file, and copy to that
another file and also display it on the screen.*/
#include <stdio.h>

#define MAX_SIZE 100

int main()
{
    FILE *f1;
    char c;

    printf("Data input\n\n");

    f1 = fopen("D:\\C Problems\\b_Exercises\\INPUT", "w");
    if (f1 == NULL)
    {
        printf("Error opening INPUT file for writing\n");
        return 1;
    }
    while ((c = getchar()) != EOF)
    {
        putc(c, f1);
    }
    fclose(f1);

    printf("\nData Output\n\n");
    f1 = fopen("D:\\C Problems\\b_Exercises\\INPUT", "r");
    if (f1 == NULL)
    {
        printf("Error opening INPUT file for reading\n");
        return 1;
    }
    while ((c = getc(f1)) != EOF)
    {
        printf("%c", c);
    }
    fclose(f1);
    return 0;
}