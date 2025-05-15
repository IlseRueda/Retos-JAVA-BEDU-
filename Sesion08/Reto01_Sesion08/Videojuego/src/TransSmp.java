public class TransSmp implements TransHist{
    @Override
    public void changScn(String newScene){
        System.out.println("📜 Transición a nueva escena: " + newScene);
    }
}
