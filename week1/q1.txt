#include <stdio.h>
void check(int n){
  int flag =0;
    for (int i = 2; i < n; ++i) {
        if (n % i == 0) {
            if(flag == 0){
                printf("%d is not a a prime number.\n", n);
                flag = 1;
            }
            printf("%d ", i*i);
        }
    }
    if (flag == 0)
            printf("%d is a prime number.\n", n);

}

int main() {
    int n1, n2, i, flag = 0;
    int arr[100];
    printf("Input a Number: ");
    scanf("%d", &n1);
    scanf("%d", &n2);
    check(n1);
    check(n2);

    
return 0;
}

