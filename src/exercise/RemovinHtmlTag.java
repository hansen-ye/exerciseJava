package exercise;

public class RemovinHtmlTag {

	 // 去除字串中的html tag 
	static	class Test 
	{
	  public static void main(String[] args) 
	  {
	        String val = "<p>第一步：开始游戏　点击左侧功能列【游戏频道】页面的彩票馆”开始游戏按钮”</p> <p>下一步：选择游戏　在彩票馆点”重庆时时彩”图标</p> <p>下一步：选择注单号码　请选择号码区的号码并形成一注注单</p>  <p>下一步：加入注单列表　点击”添加至投注列表”，将刚才选中的注单加入投注列表</p> <p>下一步：确认投注　点击”确认投注”按钮确认投注</p> <p>下一步：购买注单　点击”确定”按钮购买注单</p>";
	        String tagPattern = "<{1}[^>]{1,}>{1}";
	 
	        System.out.println("Before:" + val);
	        System.out.println("After :" + val.replaceAll(tagPattern, ""));
	  }
	}
}
