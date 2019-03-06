import java.util.*;  
class Student
{   
	public String name;  
	public int age;  
	public Student(String name,int age)
	{  
		this.name=name;  
		this.age=age;  
	}	  
} 
class AgeComparator implements Comparator<Student>
{  
	public int compare(Student s1,Student s2)
	{  
		if(s1.age==s2.age)  
		{
			return s1.name.compareTo(s2.name);  
		}
		else if(s1.age>s2.age)  
			return 1;  
		else  
			return -1;  
	}  
} 
class NameComparator implements Comparator<Student>
{  
	public int compare(Student s1,Student s2)
	{  
		return s1.name.compareTo(s2.name);  
	}  
}  
public class try45 
{
	public static void main(String args[])
	{	
		Scanner s=new Scanner(System.in);
		ArrayList<Student> l=new ArrayList<>();
		int n=s.nextInt();
		while(n!=0)
		{
			System.out.println("Age:");
			int age=s.nextInt();
			s.nextLine();
			System.out.println("Name:");
			String name=s.nextLine();
			Student st=new Student(name,age);
			l.add(st);
			n--;
		}
		String c=s.nextLine();
		System.out.println("c="+c);
		if(c.equals("A"))
		{
			System.out.println("here");
			Collections.sort(l,new AgeComparator());
		}
		else
		{
			Collections.sort(l,new NameComparator());
		}
		
		for(int i=0;i<l.size();i++)
		{
			System.out.println(l.get(i).name+" "+l.get(i).age);
		}
	}
}