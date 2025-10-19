#include<iostream>
using namespace std;

int main(){
    int num;
    cout<<"enthe the number :"<<endl;
    cin>>num;
    if(num<0){
    	cout<<"invalid input";
	}
    for(int i=2;i<num;i++){
        if(num%i==0){
            cout<<"Not Prime";
            break;
        }
        else{
        	cout<<"number is prime";
        	break;
		}
    }
    
}
