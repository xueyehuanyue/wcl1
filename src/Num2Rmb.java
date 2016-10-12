import java.util.Arrays;


public class Num2Rmb {
private String[] hanArr={"零","壹","贰","叁","肆","伍","陆","柒","捌","玖"};
private String[] unitArr={"十","佰","仟"};
/*\
 扒一个浮点数分解成整数部分和小数部分字符串
 @param num 需要被分解的浮点数
 @return 分解出来的整数部分和小数部分 第一个数组元素是整数部分，第二个数组元素数小数部分
 */
private String[] divide(double num)
{
	//将一个浮点数强制类型转化为long 得到他的整数
	long zheng=(long)num;
	//浮点数减去整数部分得到小数部分，小数部分乘以100后再取整得到2为小数
	long xiao=Math.round((num-zheng)*100);
	//把整数转为字符串
	return new String[]{zheng+"", String.valueOf(xiao)};
	
}
/*
把一个四位数变成汉字字符串
numStr需要转换的数字
返回汉字字符串
 */
private String toHanStr(String numStr)
{
String result="";
int numLen=numStr.length();
//依次遍历数字字符串的每一个数字
for(int i=0;i<numLen;i++)
{
//把char型数字转换成int数字，ascii码值差48
	//把char型数字减去48得到int数字
	int num=numStr.charAt(i)-48;
	//如果不是最后一位数字，而且数字不是零，需添加单位
	if(i!=numLen-1&&num!=0)
	{
	result+=hanArr[num]+unitArr[numLen-2-i];	
	}
	//否则不要添加单位
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
