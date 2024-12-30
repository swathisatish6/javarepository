package icici.loans.refinements;

import java.io.File;
import java.util.Arrays;

public class ProjectDetails
{
	
	public String Classname()
	{
		return this.getClass().getSimpleName();
	}
	
	public String packagename()
	{ 
		return this.getClass().getPackageName();
	}
	
	
	public String[] projectname (String ProjectPath )
	{
		File f = new File(ProjectPath);
		String Name1 = f.getName();
		String Name2 = f.getParent();
		return new String[] {Name1,Name2};
	}
	  
	
	public String getlastnamefrompackage()
	{
		String p = this.getClass().getPackageName();
		String[] partname = p.split("\\.");
		System.out.println(partname.length);
		if(partname.length>=3)
			return partname[2];
		else
			return "String is not present in index";
		}
	
	

	public static void main(String[] args) 
	{
		//C:\Users\swath\eclipse-workspace\JavaProject
		  String ProjectWorkingDirectory = System.getProperty("user.dir");
		  System.out.println("Project Working Directory :" +ProjectWorkingDirectory);
		  
		 
		 String username = System.getProperty("user.name");
		 System.out.println("user name is:" +username);
		 
		 String osname = System.getProperty("os.name");
		 System.out.println("os name is:" +osname);
		 
		 String osversion = System.getProperty("os.version");
		 System.out.println("os version is:" +osversion);
		 
		 ProjectDetails obj = new ProjectDetails();
		 String clasname = obj.Classname();
		 System.out.println("Class name is :" +clasname);
		 
		 
		 String packagename = obj.packagename();
		 System.out.println("package name is :" +packagename);
		 
		 
		 String[] projectname = obj.projectname(ProjectWorkingDirectory);
		 //System.out.println("project name is :" +projectname);
		 System.out.println("project name is :" +Arrays.toString(projectname));
		 
		 
		 String lastnamefrmpackage = obj.getlastnamefrompackage();
		 System.out.println("last name from package is :" + lastnamefrmpackage);

	}

}
