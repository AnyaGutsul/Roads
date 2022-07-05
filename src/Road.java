
public class Road {
	private City city1,city2;
	private int length;
	
	//A constructor that initializes the road as usual, 
	//but in addition also adds the road created to the two cities city1 and city2.
	//He will do so using City's connect method.
	public Road(City city1, City city2, int length) {
		this.city1=city1;
		this.city2=city2;
		this.length=length;
		city1.connect(this);
		city2.connect(this);
	}
	
	//Returns the first city.
	public City getCity1() {
		return this.city1;
	}
	
	//Returns the second city.
	public City getCity2() {
		return this.city2;
	}
	
	//Returns the length of the road.
	public int getLength() {
		return this.length;
	}

}
