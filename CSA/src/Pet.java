import java.io.*;
import java.util.*;

public class Pet {
	private String name;
	private int age;

	public Pet(String n, int a)
	{
		name = n;
		age = a;
	}

	public String getName()
	{
		return name;
	}

	public int getAge()
	{
		return age;
	}

	public String toString()
	{
		return getName() + " - " + getAge();
	}
}
