 int no =121;
int temp= no;
int rev=0 ,rem;
while (temp!=0)
{
rem=temp%10;
rev= rev*10+rem;
temp=temp/10;
}
if (no=rev)
{
print (no+"palendriom");

}
else
{
print (no+"not a palindrom");
}



