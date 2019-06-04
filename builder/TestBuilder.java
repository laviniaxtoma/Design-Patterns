package dp.builder;

public class TestBuilder {

	public static void main(String[] args) {
		PachetTuristic pachetTuristic = new PachetTuristic
				.BuilderPachetTuristic("Gigel", "Italia", "NewTown")
				.setAsigurare("Asigurare storno").setTransport("avion").build();
		
		System.out.println(pachetTuristic);

	}

}


