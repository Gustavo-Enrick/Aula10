import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        ArrayList<Animal> listAnimal = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            if(i % 2 == 0){
                Gato gato = new Gato();
                listAnimal.add(gato);
            }else if(i % 2 != 0){
                Cachorro cachorro = new Cachorro();
                listAnimal.add(cachorro);
            }
        }

        for(Animal animal : listAnimal){
            animal.fazerSom();
        }
    }
}