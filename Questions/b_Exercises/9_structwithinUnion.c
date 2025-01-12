// Write a C Program – to use structure within union, display the structure and length of
// union elements
#include <stdio.h>

struct Employee
{
    char name[20];
    int employeeId;
    float salary;
};

union EmployeeUnion
{
    struct Employee emp;
    int unionInt;
    float unionFloat;
};

int main()
{
    union EmployeeUnion eU;

    printf("\nSize of structure 'Employee':%lu bytes", sizeof(struct Employee));
    printf("\nSize of union 'EmployeeUnion':%lu bytes", sizeof(union EmployeeUnion));

    printf("\nSize of 'emp' within union: %lu bytes\n", sizeof(eU.emp));
    printf("\nSize of 'unionInt' within union:%lu bytes", sizeof(eU.unionInt));
    printf("\nSize of 'unionFloat' within union:%lu bytes", sizeof(eU.unionFloat));
    return 0;
}