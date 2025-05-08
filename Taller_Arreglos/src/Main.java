public class Main {
    public static void main(String[] args)

    {
        String[] meses= {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio",
                "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};

        int[] lluvia= new int[12];
        lluvia[0]=23;lluvia[1]=24;lluvia[2]=20;lluvia[3]=21;lluvia[4]=26;lluvia[5]=22;
        lluvia[6]=23;lluvia[7]=23;lluvia[8]=22;lluvia[9]=25;lluvia[10]=22;lluvia[11]=20;

        for (int i=0; i<lluvia.length; i++)
            System.out.println("La lluvia en " + meses[i]+" es: " +lluvia[i]+ "m^2" );

        float lluvia_acumulada=0;

        for (int i=0; i<lluvia.length; i++)
            lluvia_acumulada +=(lluvia[i]);
        System.out.println("La lluvia acumulada es: "+ lluvia_acumulada+ "m^2" );
        System.out.println("El promedio de lluvia es: "+ (lluvia_acumulada)/12 + "m^2" );

    }







}