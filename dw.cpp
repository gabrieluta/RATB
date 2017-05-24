#include<iostream>
#include<fstream>
#include<string.h>
#include<conio.h>
#include<windows.h>
using namespace std;
struct provincii
{char provincie[100];} p[200];
struct tari
{char tara[100];} t[200];
struct judet
{char denumire[200];
unsigned long zona[200];} jud[600];
ifstream r("judete.txt");
ifstream f("graf.txt");

   ofstream outfile;

int n=94,a[500][500],v[200],w,as,ev,st[200],k,z,q=0,q_max=0,h[100],
vizitat[600],u[600],j,T[200],da_nume=0,nr_traseu=0,i,o=0,d[100],m=0,l[100],c1,c2,ii,contor[500],
co,l_min[600],lungime=0,suma[600],n_pb,jud_d[100];

char nume_j[200],tara_dest[100],sir1[100],rasp[100],nume_d[200];



void citire_nume()
{  char s[200];
    int i;
    for(i=1;i<=n;i++)
      {r.getline(s,200);
      strncpy(jud[i].denumire, s,200);}
    //  for(i=1;i<=n;i++)
      //  cout<<jud[i].denumire<<endl;

}
void citire_graf()
{
    int i,j;
    for(i=1;i<=n;i++)
        for(j=1;j<=n;j++)
            f>>a[i][j];
}



void init()
{
    st[k]=0;
}
int succesor()
{
    if(st[k]<(n-5)) {st[k]=st[k]+1; return 1;}
    else return 0;
}
int valid()
{
    int i;
    if(k>1 && st[k]<st[k-1]) return 0;
    for(i=1;i<k;i++)
        if(st[i]==st[k]) return 0;
    if(v[st[k]]!=w) return 0;
    return 1;
}
int solutie()
{
    if(k==z) return 1;
    else return 0;
}
void afisare()
{
    int i;
    cout<<"Provincia "<<p[w].provincie<<endl;
    for(i=1;i<z;i++)
        cout<<jud[st[i]].denumire<<","<<" ";
        cout<<jud[st[z]].denumire;
        cout<<endl;
}
int back()
{
    k=1;
    init();
    while(k>0)
        {
            as=1; ev=0;
            while((as==1)&&(ev==0))
                {
                    as=succesor();
                    if(as==1) ev=valid();
                }
            if(as==1)
                if(solutie()==1) afisare();
                else {k++; init();}
            else k--;
        }
}




void refac(int nod)
{
    if(nod!=0) { refac(T[nod]);
                outfile <<jud[nod].denumire<<", "; }
}

int K,N,M,P[200],D[200],X[200];
int pf[600], fi, final[600],qw,ab,min,secv[600],ji,ka,sv, da_nod=0,i_nod=0,j_nod=0,nr_tara;

void bf(int K)
{
	int st,dr,j;
	st=dr=1;
	X[1]=K;
	P[K]=1;
	D[K]=0;
	while(st<=dr)
	{
		for(j=1;j<=n-5;j++)
			if(a[X[st]][j]==1 && P[j]==0)
			{
				dr++;
				X[dr]=j;
				P[j]=1;
				D[j]=D[X[st]]+1;
				T[j]=X[st];
			}
		st++;
	}
}

void lant(int K)
{
	if(T[K]!=0) lant(T[K]);
	outfile <<jud[K].denumire<<" ";
}

void afis()
{
	int i;
	for(i=1;i<=n;i++)
		if(D[i]!=100000)
			{ cout<<i<<" "<<D[i]<<"  ";
		      lant(i);
              cout<<endl;
			}
	    else cout<<i<<" -\n";
}
        //problema nr. 7 - Ruta minima
void ruta()
{
    int i,j;
    for(i=1;i<=n;i++) D[i]=100000;
  // cout<<"Introduceti numele judetului de plecare: ";  cin>>nume_j; cout<<endl;

  // cout<<"Introduceti numele judetului destinatie: "; cin>>nume_d; cout<<endl;
  // cout<<"Traseele optime dintre "<<nume_j<<" si "<<nume_d<<" sunt: "<<endl<<endl;
  //  for(i=1;i<=n;i++)
      //  if(strcmp(nume_j,jud[i].denumire)==0) {i_nod=i; cout<<i;}
  //  for(i=1; i<=n;i++)
        // if(strcmp(nume_d,jud[i].denumire)==0) {j_nod=i; cout<<i;}
      // cout<<"Introduceti nr statiei de plecare si nr destinatiei: ";  cin>>i_nod>>j_nod;

       i_nod--; j_nod--;
       strncpy(nume_j,jud[i_nod].denumire,200);



       strncpy(nume_d,jud[j_nod].denumire,200);

          bf(i_nod);
          for(i=1;i<=n;i++)
            if(a[i][j_nod]!=0) if(T[i]!=0) {refac(i); outfile<<nume_d; nr_traseu++; outfile<<endl;}
   cout<<endl;
   cout<<"Exista "<<nr_traseu<<" rute de lungime minima intre cele 2 locatii";
}


int main(int argc, char **argv)
{
    if(argc<2)
        exit(1);
    i_nod=atoi(argv[1]);
    j_nod=atoi(argv[2]);


           SetConsoleTextAttribute (GetStdHandle(STD_OUTPUT_HANDLE), BACKGROUND_RED | 15 );




 outfile.open("date.txt");
    citire_graf();
    citire_nume();
  ruta();




 f.close();
 r.close();

    return 0;
}
