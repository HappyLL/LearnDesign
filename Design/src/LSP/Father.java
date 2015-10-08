package LSP;

public class Father {
	
	public void SetName(String name)
	{
		System.out.println("父类");
	}
	
	public static void main(String []args)
	{
//		Father f = new Father();
//		f.SetName("哈哈哈");
		//根据LSP原则 如果父类存在的地方 子类也能够存在
		//从这个例子可以看出当子类重载父类的函数时(且前置条件比父类宽泛时) 则调用的是父类的函数
		//其他的重载类型不会调用父类函数
//		Son s = new Son();
//		s.SetName("哈哈哈");
		//同理当子类的前置条件比父类缩小时 则调用的是子类的函数
		
		//所以子类有重载父类函数时就必须要扩大(因为更具LSP原则 父类的地方一定有子类可以存在 所以说明在父类替换
		//成子类后还是调用父类中的方法)
		
		//如果要重写必须函数名参数类型和个数与父类一致(否则即为重载)
		
	}
	
}
