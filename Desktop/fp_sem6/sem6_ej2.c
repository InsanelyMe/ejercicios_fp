//
//  sem6_ej2.c
//  fp_sem6
//
//  Created by Angel Romero on 2/12/14.
//
//

#include <stdio.h>

// combos de tamaño r en conjunto n
// n! / r! * (n-r)!

int factorial(int num){
    int i,f=1;
    for (i=0;i<=num;i++){
        f = f*i;
    }
    return f;
}

void main(){
    
    printf("dame n y r");
    scanf("%d %d",&n,&r);
    
    int res = factorial(n)/(factorial(r)*factorial(n-r));
    
    printf(res);
}