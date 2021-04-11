package collections;

import java.util.Comparator;

public class NameComparator implements Comparator<NameComparator>{
	private String name;
	private int id;

	public NameComparator() {}
	public NameComparator(String name, int id) {
		this.name = name;
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public int getId() {
		return id;
	}

	/*
	 * @Override public int compareTo(Emp e) { if(this.name.compareTo(e.name)>1) {
	 * return 1; } else if(this.name.compareTo(e.name)<1) { return -1; } else return
	 * 0; }
	 */

	@Override
	public String toString() {
		return "Emp [name=" + name + ", id=" + id + "]";
	}

	@Override
	public int compare(NameComparator o1, NameComparator o2) {
		if((o1.getName().compareTo(o2.getName()))>1)
		{
		return 1;	
		}
		else if((o2.getName().compareTo(o1.getName()))>1)
		{
			return -1;
		}
		return 0;
	}
}
