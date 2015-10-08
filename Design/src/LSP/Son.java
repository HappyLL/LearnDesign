package LSP;

public class Son extends Father{
	
	//由于参数类型不一致 子类重载了父类的函数
	public void SetName(Object name)
	{
		System.out.println("子类");
	}
	
}
