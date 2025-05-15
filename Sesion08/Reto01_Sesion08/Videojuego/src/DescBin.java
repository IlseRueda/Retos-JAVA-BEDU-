public class DescBin implements LogDecs {
    @Override
    public String tomarDecs(String op){
        return op.equalsIgnoreCase("A")? "Has elegido el camino de la luz." : "Has elegido el camino de la sombra.";

    }
}
