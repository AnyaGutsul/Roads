
public class City {
	private String cityName;
	//An array containing the roads connected to the city.
	private Road[] roads= new Road[10];
	//The number of roads connected to the city so far.
	private int numRoads;
	
	//A constructor who produces a city with the given name.
	public City(String name) {
		this.cityName=name;
	}
	
	//Adds the road to the city's road list.
	public void connect(Road r) {
		roads[numRoads]=r;
		numRoads++;
	}
	
	//Returns the city closest to this city or null if no city is connected.
	public City nearestCity() {
		 int min,j=0;
		if(this.numRoads==0)
			return null;
		min=roads[j].getLength();
		
		for(int i=1;i<numRoads;i++)
		{
			if((roads[i].getLength())<min)
				{min=roads[i].getLength();
			      j=i;}
		}
		if(roads[j].getCity1()==this)
		return roads[j].getCity2();
		else return roads[j].getCity1();
	}
	
	//Returns the name of the city.
	public String toString() {
		return this.cityName;
		}

}
