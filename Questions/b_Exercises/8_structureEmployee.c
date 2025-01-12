// Write a C program – using structures for reading the employee details
// like employee name, date of joining and salary and also to compute
// Total salary outgo for a month.
#include <stdio.h>

struct Date
{
    int day;
    int month;
    int year;
};

struct Employee
{
    char name[20];
    struct Date joinDate;
    float salary;
};

int main()
{
    int n, i;
    printf("Enter number of employees\n");
    scanf("%d", &n);

    struct Employee e[n];

    for (i = 0; i < n; i++)
    {
        printf("\nEnter Details for Employee%d:\n", i + 1);
        printf("\nEnter Name:");
        scanf("%s", &e[i].name);
        printf("\nEnter Date of joining(Day Month Year):");
        scanf("%d %d %d", &e[i].joinDate.day, &e[i].joinDate.month, &e[i].joinDate.year);
        printf("\nEnter Salary: ");
        scanf("%f", &e[i].salary);
    }

    float totalSalaryOutgo = 0;
    for (i = 0; i < n; i++)
    {
        totalSalaryOutgo = totalSalaryOutgo + e[i].salary;
    }

    printf("\nEmployee Details and Total Salary Outgo for a Month:");
    for (i = 0; i < n; i++)
    {
        printf("\n\nEmployee %d", i + 1);
        printf("\n\nName: %s", e[i].name);
        printf("\nDate of Joining: %d-%02d-%02d", e[i].joinDate.year, e[i].joinDate.month, e[i].joinDate.day);
        printf("\nSalary: %f", e[i].salary);
    }
    printf("\n\nTotal Salary Outgo for a Month: %f", totalSalaryOutgo);
    return 0;
}