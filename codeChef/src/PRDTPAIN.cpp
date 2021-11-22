#include<bits/stdc++.h>
using namespace std;



#define ll long long


int main(){
    ll t;
    cin>>t;


    while(t--){


    ll n;
    cin>>n;

    ll temp[n];
    for(ll i=0;i<n;i++)
        cin>>temp[i];
    ll ans=0;
    
    
    for(ll i=0;i<n;i++){
    
        ll arr=temp[i],arr2=temp[i];
    
    
    
        set<ll> s;
    
    
        for(ll j=i;j<n;j++){
    
    
            s.insert(temp[j]);
    
            arr=max(arr,temp[j]);
    
    
            arr2=min(arr2,temp[j]);
    
    
            if(j-i<2)
                continue;
    
    
            ll tempAns=0;
            auto point=s.lower_bound((arr+arr2)/2);
    
            if(point!=s.end()){
                tempAns=max(tempAns,(arr-(*point))*((*point)-arr2));
            }
    
    
            if(point!=s.begin()){
                point--;
                tempAns=max(tempAns,(arr-(*point))*((*point)-arr2));
            }
    
    
            ans+=tempAns;
        }

    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    cout<<ans<<endl;
    }
}