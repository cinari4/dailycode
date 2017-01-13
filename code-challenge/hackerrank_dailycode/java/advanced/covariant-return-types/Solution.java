
class Flower {
	String whats_Your_Name() {
		return "I have many names and types";
	}
}

class Jasmin extends Flower {
	@Override
	String whats_Your_Name() {
		return "Jasmine";
	}
}

class Lily extends Flower {
	@Override
	String whats_Your_Name() {
		return "Lily";
	}
}

class Lotus extends Flower {
	@Override
	String whats_Your_Name() {
		return "Lotus";
	}
}

class State {
	Flower your_National_Flower() {
		return new Flower();
	}
}

class WestBengal extends State {
	@Override
	Flower your_National_Flower() {
		return new Jasmin();
	}
}

class Karnataka extends State {
	@Override
	Flower your_National_Flower() {
		return new Lotus();
	}
}

class AndhraPradesh extends State {
	@Override
	Flower your_National_Flower() {
		return new Lily();
	}
}