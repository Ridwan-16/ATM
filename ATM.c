#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>

struct UserData
{
    int ID;
    int PIN;
};
int main()
{
    int credit = 0;
    bool jack = true;
    struct UserData user;
    user.ID = 1234;
    user.PIN = 1234;
    do
    {
        printf("Enter your bank ID: \n");
        int userID;
        scanf("%d", &userID);
        printf("Enter your PIN: \n");
        int userPIN;
        scanf("%d", &userPIN);

        if (userID == user.ID && userPIN == user.PIN)
        {
            printf("Welcome to the BIJOY BANK PLC.\n");
            break;
        }
        else
        {
            printf("Wrong Input!! \n");
        }

    } while (jack);

    do
    {
        printf("\n");
        printf("Enter your option\n1.Check balance 2.Diposit 3.Withdraw 4.Exit \n");
        int num;
        scanf("%d", &num);

        switch (num)
        {
        case 1:
            printf("your balance is %d $\n", credit);
            break;
        case 2:
            printf("Enter your ammout you want to diposit:  \n");
            int diposit;
            scanf("%d", &diposit);
            credit += diposit;
            printf("new balance: %d $\n", credit);

            break;
        case 3:
            printf("Enter your ammout you want to withdraw:  \n");
            int withdraw;
            scanf("%d", &withdraw);
            if (withdraw > credit)
            {
                printf("insufficient balance!\n");
                break;
            }
            else
            {
                credit -= withdraw;
                printf("new balance: %d $\n", credit);
                break;
            }

        case 4:
            printf("see you again!!");
            exit(0);

        default:
            printf("Invalid input \n");
            break;
        }

    } while (jack);


    return 0;
}