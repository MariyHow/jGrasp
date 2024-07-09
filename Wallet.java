class Wallet {
boolean id;
double cash;
int mcard;
int ocard;
boolean pic;
int receipt;

Wallet() {
id=false;
cash=0.0;
mcard=0;
ocard=0;
pic=false;
receipt=0;
}
Wallet (boolean newid; double newcash, int newmcard, int newocard, boolean newpic, int newreceipt)
{
id=newid;
cash=newcash;
mcard=newmcard;
ocard=newocard;
pic=newpic;
receipt=newreceipt;
}
double updatecash(double newcash)
{
cash=cash+newcash;
return cash;
}
boolean getid()
{
return id;
}
double getcash()
{
return cash;
}
int getcards()
{
return (mcard+ocard) ;
}
boolean getpic()
{
return pic;
}
int getreceipt()
{
return receipt;
}

}
}