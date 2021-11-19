public class GardenSimulator {

    public static void main(String[] args) {
        Garden garden = new Garden();
        while (garden.isPlaying()){
            garden.mainMenu();
        }
    }
}
