/**
 * 
 */
package com.kishan.collectionchallenges;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Kishankumar
 * Feb 29, 2020 
 */
public class HashCodeEqualsOnMap {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NoHashCodeEquals obj1 = new NoHashCodeEquals();
		System.out.println("NoHashCodeEquals Implemented::");
		obj1.testMap();
		OnlyEquals obj2 = new OnlyEquals();
		System.out.println("Only Equals Method Implemented::");
		obj2.testMap();
		OnlyHash obj3 = new OnlyHash();
		System.out.println("Only HashCode Implemented::");
		obj3.testMap();
		EqualsHashcode obj4 = new EqualsHashcode();
		System.out.println("Both HashCode Equals Implemented::");
		obj4.testMap();
	}

}

class EqualsHashcode {
	
	private class Emp {
		int id;
		String name;
		
		Emp(int id, String name) {
			this.id = id;
			this.name = name;
		}
		
		/**
		 * @return the id
		 */
		public int getId() {
			return id;
		}
		/**
		 * @param id the id to set
		 */
		public void setId(int id) {
			this.id = id;
		}
		/**
		 * @return the name
		 */
		public String getName() {
			return name;
		}
		/**
		 * @param name the name to set
		 */
		public void setName(String name) {
			this.name = name;
		}

		/* (non-Javadoc)
		 * @see java.lang.Object#toString()
		 */
		@Override
		public String toString() {
			return "Emp [id=" + id + ", name=" + name + "]";
		}

		/* (non-Javadoc)
		 * @see java.lang.Object#hashCode()
		 */
		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + getOuterType().hashCode();
			result = prime * result + id;
			result = prime * result + ((name == null) ? 0 : name.hashCode());
			return result;
		}

		/* (non-Javadoc)
		 * @see java.lang.Object#equals(java.lang.Object)
		 */
		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Emp other = (Emp) obj;
			if (!getOuterType().equals(other.getOuterType()))
				return false;
			if (id != other.id)
				return false;
			if (name == null) {
				if (other.name != null)
					return false;
			} else if (!name.equals(other.name))
				return false;
			return true;
		}

		private EqualsHashcode getOuterType() {
			return EqualsHashcode.this;
		}

	}
	
	public void testMap() {
		Map<Emp, String> map = new HashMap<Emp, String>();
		Emp e1 = new Emp(1,"raj");
		Emp e2 = new Emp(1,"raj");
		map.put(e1,  "test1");
		map.put(e2,  "test2");
		map.forEach( (k,v) -> {
			System.out.println("Key::" + k + ", Value::" + v);
		});
	}
}

class OnlyEquals {
	
	private class Emp {
		int id;
		String name;
		
		Emp(int id, String name) {
			this.id = id;
			this.name = name;
		}
		
		/**
		 * @return the id
		 */
		public int getId() {
			return id;
		}
		/**
		 * @param id the id to set
		 */
		public void setId(int id) {
			this.id = id;
		}
		/**
		 * @return the name
		 */
		public String getName() {
			return name;
		}
		/**
		 * @param name the name to set
		 */
		public void setName(String name) {
			this.name = name;
		}

		/* (non-Javadoc)
		 * @see java.lang.Object#toString()
		 */
		@Override
		public String toString() {
			return "Emp [id=" + id + ", name=" + name + "]";
		}

		/* (non-Javadoc)
		 * @see java.lang.Object#equals(java.lang.Object)
		 */
		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Emp other = (Emp) obj;
			if (!getOuterType().equals(other.getOuterType()))
				return false;
			if (id != other.id)
				return false;
			if (name == null) {
				if (other.name != null)
					return false;
			} else if (!name.equals(other.name))
				return false;
			return true;
		}

		private OnlyEquals getOuterType() {
			return OnlyEquals.this;
		}
		
	}
	
	public void testMap() {
		Map<Emp, String> map = new HashMap<Emp, String>();
		Emp e1 = new Emp(1,"raj");
		Emp e2 = new Emp(1,"raj");
		map.put(e1,  "test1");
		map.put(e2,  "test2");
		map.forEach( (k,v) -> {
			System.out.println("Key::" + k + ", Value::" + v);
		});
	}
}

class OnlyHash {
	
	private class Emp {
		int id;
		String name;
		
		Emp(int id, String name) {
			this.id = id;
			this.name = name;
		}
		
		/**
		 * @return the id
		 */
		public int getId() {
			return id;
		}
		/**
		 * @param id the id to set
		 */
		public void setId(int id) {
			this.id = id;
		}
		/**
		 * @return the name
		 */
		public String getName() {
			return name;
		}
		/**
		 * @param name the name to set
		 */
		public void setName(String name) {
			this.name = name;
		}

		/* (non-Javadoc)
		 * @see java.lang.Object#toString()
		 */
		@Override
		public String toString() {
			return "Emp [id=" + id + ", name=" + name + "]";
		}

		/* (non-Javadoc)
		 * @see java.lang.Object#hashCode()
		 */
		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + getOuterType().hashCode();
			result = prime * result + id;
			result = prime * result + ((name == null) ? 0 : name.hashCode());
			return result;
		}

		private OnlyHash getOuterType() {
			return OnlyHash.this;
		}
		
	}
	
	public void testMap() {
		Map<Emp, String> map = new HashMap<Emp, String>();
		Emp e1 = new Emp(1,"raj");
		Emp e2 = new Emp(1,"raj");
		map.put(e1,  "test1");
		map.put(e2,  "test2");
		map.forEach( (k,v) -> {
			System.out.println("Key::" + k + ", Value::" + v);
		});
	}
}

class NoHashCodeEquals {
	
	private class Emp {
		int id;
		String name;
		
		Emp(int id, String name) {
			this.id = id;
			this.name = name;
		}
		
		/**
		 * @return the id
		 */
		public int getId() {
			return id;
		}
		/**
		 * @param id the id to set
		 */
		public void setId(int id) {
			this.id = id;
		}
		/**
		 * @return the name
		 */
		public String getName() {
			return name;
		}
		/**
		 * @param name the name to set
		 */
		public void setName(String name) {
			this.name = name;
		}

		/* (non-Javadoc)
		 * @see java.lang.Object#toString()
		 */
		@Override
		public String toString() {
			return "Emp [id=" + id + ", name=" + name + "]";
		}
	}
	
	public void testMap() {
		Map<Emp, String> map = new HashMap<Emp, String>();
		Emp e1 = new Emp(1,"raj");
		Emp e2 = new Emp(1,"raj");
		map.put(e1,  "test1");
		map.put(e2,  "test2");
		map.forEach( (k,v) -> {
			System.out.println("Key::" + k + ", Value::" + v);
		});
	}
}

