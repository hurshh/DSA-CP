#include <bits/stdc++.h>
using namespace std;

struct range
{
	int index;
	long long start;
	long long end;

};

bool comp (range a,range b){
	if(a.start == b.start){
		return a.end > b.end;
	}
	return a.end>b.end;
}

int main()
{
	ios_base::sync_with_stdio(false);cin.tie(0);cout.tie(0);
	int n; cin>>n;
	std::vector<range> v(n);
	int[n] contn;
	int[n] contd;
	for(int i=0;i<n;i++){
		v[i].index = i;
		cin>>v[i].start;
		cin>>v[i].end;
	}
	sort(v.begin,v.end,comp);
	int max = 0;
	for(int i=0;i<n;i++){
		if(v[i].end <= max){
			contd[v[i].index] = 1;
		}
		max = std::max(max,v[i].end);
	}
	int min = std::numeric_limits<int>::max();
	for(int i=n-1;i>=0;i--){
		if(v[i].end >= min){
			contn[v[i].index] = 1;
		}
		min = std::max(min,v[i].end);
	}
	for(int i=0;i<n;i++){
		sout<<contd[i]<<" ";
	}
	sout<<"\n";
	for(int i=0;i<n;i++){
		sout<<contn[i]<<" ";
	}
	return 0;
}