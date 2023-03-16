public class desafio {
    public static void main(String[] args) {

        double partecima = 3.0*Math.pow((-3.0/4.0),-2.0)+6.0*(Math.pow(3.0,-1.0)/4.0)-4.0;
        double partebaixo = 7.0*Math.pow((-3.0/4.0),-1.0)+2.0;
        double resultadocimabaixo = Math.pow((partecima/partebaixo),-1.0)+4.0;
        System.out.println(resultadocimabaixo);

    }
}