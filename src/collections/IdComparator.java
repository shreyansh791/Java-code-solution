package collections;

import java.util.Comparator;

public class IdComparator implements Comparator<IdComparator> {
	private String name;
	private int id;

	public IdComparator() {}
	public IdComparator(String name, int id) {
		this.name = name;
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public int getId() {
		return id;
	}

	
	@Override
	public int compare(IdComparator o1, IdComparator o2) {
		if(o1.getId()>o2.getId()) {
			return +1;
		}
		else if(o2.getId()>o1.getId()) {
			return -1;
		}
		return 0;
	}
	@Override
	public String toString() {
		return "IdComparator [name=" + name + ", id=" + id + "]";
	}

}
