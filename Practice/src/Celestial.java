class CelestialBody{
    private String name;
    private double mass;
    private double diameter;
    private double period;
    private CelestialBody orbits;
    private CelestialBody next;
    static CelestialBody list;

    public static void print(){
        CelestialBody celestial = list;
        if (celestial == null) System.out.println("The list is empty");
        else do {
            System.out.println(celestial);
            celestial = celestial.next;
        }while(celestial!=null);

    }
    public CelestialBody(String name,double mass,double diameter,double period){
        this.name=name;
        this.mass=mass;
        this.diameter=diameter;
        this.period=period;
        this.next=list;
        list=this;
    }

    public CelestialBody(String name,double mass,double diameter,double period,CelestialBody orbits) {
        this(name, mass, diameter, period);
        this.orbits=orbits;
    }
        @Override
    public String toString() {
        String s = "Name : "+name+"\n"+"Mass : "+mass+"gm"+"\n"+"Diameter : "+diameter+"km"+"\n"+"Period : "+period+"days"+"\n";
        if(orbits != null) s+= "Orbits : "+orbits.name+"\n";
        return s;
    }
}
public class Celestial {
    public static void main(String[] args) {
        CelestialBody.print();
        CelestialBody sun = new CelestialBody("Sun",1.99E33,1.392E6,8.218E10);
        CelestialBody mars = new CelestialBody("Mars",6.418E28,6.7938E3,686.98,sun);
        CelestialBody marsMoon1 = new CelestialBody("Deimos",2E18,15,1.26244,mars);
        CelestialBody.print();
    }
}
