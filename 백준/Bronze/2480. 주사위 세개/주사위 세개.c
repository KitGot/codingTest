#include<stdio.h>

int main(){
    int dice[7] ={0};
    int max = -1;
    int a,b,c;
    scanf("%d %d %d",&a,&b,&c);
    dice[a]++;
    dice[b]++;
    dice[c]++;
    // dice 값중에 2가있다 그건 하나가 2개가 나온거니까  두번쨰 공식
    for(int i=1;i<7;i++){
        if(dice[i] == 3){
            printf("%d",10000 + i * 1000);
            return 0;
        }else if(dice[i] == 2){
            printf("%d",1000 + i * 100);    
            return 0;
        }else if(dice[i] == 1){
            if(max <= i) max = i;
        }
    }
        printf("%d",max * 100);
}