class Student extends Person{
	private int[] testScores;

    Student(String firstName, String lastName, int identification, int[] testScores){
        super(firstName, lastName, identification);
        this.testScores = testScores;
    }
    
    public String calculate() {
        int avg = 0;
        for (int i = 0; i < testScores.length; i++) {
            avg += testScores[i];
        }
        avg = avg / testScores.length;
        
        if (avg <= 100 && avg >=90) {
            return "O";
        } else if (avg < 90 && avg >=80) {
            return "E";
        } else if (avg < 80 && avg >= 70) {
            return "A";
        } else if (avg < 70 && avg >= 55) {
            return "P";
        } else if (avg < 55 && avg >= 40) {
            return "D";
        } else if (avg < 40) {
            return "T";
        }
        return "T";
    }

}