package com.sunil.dataStore.dto;

public class TempleDTO {

	private int id;
	private String name;
	private String location;
	private double entryFee;
	private boolean specialPrasada;
	private int noOfPoojaries;
	private boolean male;
	private String mainGod;
	private boolean kalyani;

	public TempleDTO() {
		System.out.println("created templeDTO constructor");
	}

	public TempleDTO(int id, String name, String location, double entryFee, boolean specialPrasada, int noOfPoojaries,
			boolean male, String mainGod, boolean kalyani) {
		super();
		this.id = id;
		this.name = name;
		this.location = location;
		this.entryFee = entryFee;
		this.specialPrasada = specialPrasada;
		this.noOfPoojaries = noOfPoojaries;
		this.male = male;
		this.mainGod = mainGod;
		this.kalyani = kalyani;
	}

	@Override
	public boolean equals(Object arg) {
		if (arg == null)
			return false;
		if (arg instanceof TempleDTO) {
			TempleDTO cast = (TempleDTO) arg;
			if (this.name.equals(cast.name)) {
				return true;
			} else {
				return false;
			}
		}
		return false;

	}

	@Override
	public String toString() {
		return "TempleDTO [id=" + id + ", name=" + name + ", location=" + location + ", entryFee=" + entryFee
				+ ", specialPrasada=" + specialPrasada + ", noOfPoojaries=" + noOfPoojaries + ", male=" + male
				+ ", mainGod=" + mainGod + ", kalyani=" + kalyani + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public double getEntryFee() {
		return entryFee;
	}

	public void setEntryFee(double entryFee) {
		this.entryFee = entryFee;
	}

	public boolean isSpecialPrasada() {
		return specialPrasada;
	}

	public void setSpecialPrasada(boolean specialPrasada) {
		this.specialPrasada = specialPrasada;
	}

	public int getNoOfPoojaries() {
		return noOfPoojaries;
	}

	public void setNoOfPoojaries(int noOfPoojaries) {
		this.noOfPoojaries = noOfPoojaries;
	}

	public boolean isMale() {
		return male;
	}

	public void setMale(boolean male) {
		this.male = male;
	}

	public String getMainGod() {
		return mainGod;
	}

	public void setMainGod(String mainGod) {
		this.mainGod = mainGod;
	}

	public boolean isKalyani() {
		return kalyani;
	}

	public void setKalyani(boolean kalyani) {
		this.kalyani = kalyani;
	}
}
