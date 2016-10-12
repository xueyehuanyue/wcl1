import java.util.Arrays;


public class Num2Rmb {
private String[] hanArr={"��","Ҽ","��","��","��","��","½","��","��","��"};
private String[] unitArr={"ʮ","��","Ǫ"};
/*\
 ��һ���������ֽ���������ֺ�С�������ַ���
 @param num ��Ҫ���ֽ�ĸ�����
 @return �ֽ�������������ֺ�С������ ��һ������Ԫ�����������֣��ڶ�������Ԫ����С������
 */
private String[] divide(double num)
{
	//��һ��������ǿ������ת��Ϊlong �õ���������
	long zheng=(long)num;
	//��������ȥ�������ֵõ�С�����֣�С�����ֳ���100����ȡ���õ�2ΪС��
	long xiao=Math.round((num-zheng)*100);
	//������תΪ�ַ���
	return new String[]{zheng+"", String.valueOf(xiao)};
	
}
/*
��һ����λ����ɺ����ַ���
numStr��Ҫת��������
���غ����ַ���
 */
private String toHanStr(String numStr)
{
String result="";
int numLen=numStr.length();
//���α��������ַ�����ÿһ������
for(int i=0;i<numLen;i++)
{
//��char������ת����int���֣�ascii��ֵ��48
	//��char�����ּ�ȥ48�õ�int����
	int num=numStr.charAt(i)-48;
	//����������һλ���֣��������ֲ����㣬����ӵ�λ
	if(i!=numLen-1&&num!=0)
	{
	result+=hanArr[num]+unitArr[numLen-2-i];	
	}
	//����Ҫ��ӵ�λ
	else
	{
		result+=hanArr[num];
	}}
return result;
}
	public static void main(String[] args)
	{
		Num2Rmb nr=new Num2Rmb();
		System.out.println(Arrays.toString(nr.divide(236711125.123)));
		System.out.println(nr.toHanStr("6109"));
	}
	

}
