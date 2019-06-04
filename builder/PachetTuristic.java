package dp.builder;

public class PachetTuristic {
	//componente obligatorii
	private String numeClient;
	private String destinatie;
	private String hotel;
	
	//componente optionale
	private String cazare;
	private String transport;
	private String asigurare;
	
	private PachetTuristic(BuilderPachetTuristic builder) {
		this.numeClient = builder.numeClient;
		this.destinatie = builder.destinatie;
		this.hotel = builder.hotel;
		this.cazare = builder.cazare;
		this.transport = builder.transport;
		this.asigurare = builder.asigurare;
	}
	
	
	@Override
	public String toString() {
		return "PachetTuristic [numeClient=" + numeClient + ", destinatie=" + destinatie + ", hotel=" + hotel
				+ ", cazare=" + cazare + ", transport=" + transport + ", asigurare=" + asigurare + "]";
	}


	//Builder class
	public static class BuilderPachetTuristic {
	//componente obligatorii
		private String numeClient;
		private String destinatie;
		private String hotel;
		
		//componente optionale
		private String cazare;
		private String transport;
		private String asigurare;
		
		public BuilderPachetTuristic(String numeClient, String destinatie, String hotel) {
			this.numeClient = numeClient;
			this.destinatie = destinatie;
			this.hotel = hotel;
		}
		
		public BuilderPachetTuristic setCazare(String cazare) {
			this.cazare = cazare;
			return this;
		}
		public PachetTuristic build() {
			return new PachetTuristic(this);
		}
		
		public BuilderPachetTuristic setTransport(String transport) {
			this.transport = transport;
			return this;
		}
		
		public BuilderPachetTuristic setAsigurare(String asigurare) {
			this.asigurare = asigurare;
			return this;
		}
		
		
	}
	
}
