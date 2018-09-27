import java.util.*;
public class Fac
{
public int fac(int n)
{
int num =n;
int result = 1;
for(int i = 1;i<=num;i++)
{
result *= i;
}
}
return result;
}