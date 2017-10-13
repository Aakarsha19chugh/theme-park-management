
import java.util.Scanner;

public class Validations
{

public static boolean isNumericString(String x)
{
char c[]=x.toCharArray();

for(int i=0;i<c.length;i++)
{
  if(c[i]<'0' || c[i]>'9')
   return false;
}

return true;
}

public static boolean isNumber(String x)
{
if(x.length()!=10)
return false;



char c[]=x.toCharArray();
for(int i=0;i<c.length;i++)
{
  if(c[i]<'0' || c[i]>'9')
   return false;
}

return true;
}

public static boolean isName(String x)
{
 if(x.length()<3)
  return false;

 if(x.startsWith("."))
  return false;

 if(x.contains(".."))
   return false;

 x=x.toLowerCase();

 char c[]=x.toCharArray();
 for(int i=0;i<c.length;i++)
 {
	if(c[i]<'a' || c[i]>'z')
	   if(c[i]!='.' && c[i]!=' ')
		return false;
 }
   
  return true;
}
 public boolean validEmail(String s1)
    {
        if(s1.startsWith(".")||s1.endsWith(".")||s1.indexOf("@")==-1||s1.indexOf(" ")!=-1)return true;
       if(s1.indexOf("@")!=s1.lastIndexOf("@")||s1.lastIndexOf(".")>s1.indexOf("@"))return true;
        char b[]=s1.toCharArray();
        int c=0,i;
        for(i=0;i<b.length;i++)
        {
            if((b[i]>'a'&&b[i]<'z')||(b[i]>'A'&&b[i]<'Z')||b[i]=='@'||b[i]=='.'||(b[i]>='0'&&b[i]<='9'))
            {
                c++;
            }
        }
        if(c!=i){
            return true;
        }
        
        
        
        return false;
    }


}