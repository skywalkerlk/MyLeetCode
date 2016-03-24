class Person
{
	public int age;
	public double height;
	public void info()
	{
		System.out.println("我的年龄"+age+"我的身高"+height);
	}

}


public class HelloWorld
{
	public static void main(String[] args)
	{
		Person[] students = new Person[2];
		Person zhang = new Person();
		zhang.age = 15;
		zhang.height = 158;
		Person lee = new Person();
		lee.age = 16;
		lee.height = 161;
		students[0] = zhang;
		students[1] = lee;
		lee.info();
		lee.age = 20;
		students[1].info();

		//Arrays
		
	}
}