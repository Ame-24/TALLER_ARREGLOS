//SOFIA MARTINEZ - MIKAELA UVIDIA - AMELIA YANEZ
public class Main {
    public static void main(String[] args)

    {
        int lluvia_acumulada_UIO=0;
        int lluvia_acumulada_GYE=0;
        int lluvia_acumulada_CCA=0;

        String[] meses= {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio",
                "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};
//LLUVIA QUITO
        int[] lluvia_Quito= new int[12];
        lluvia_Quito[0]=23;lluvia_Quito[1]=15;lluvia_Quito[2]=34;lluvia_Quito[3]=51;lluvia_Quito[4]=68;lluvia_Quito[5]=20;
        lluvia_Quito[6]=10;lluvia_Quito[7]=15;lluvia_Quito[8]=120;lluvia_Quito[9]=180;lluvia_Quito[10]=90;lluvia_Quito[11]=68;

        System.out.println("LLUVIA QUITO" );
        for (int i=0; i<lluvia_Quito.length; i++)
            System.out.println("La lluvia en " + meses[i]+" es: " +lluvia_Quito[i]+ "m^2" );

        for (int i=0; i<lluvia_Quito.length; i++)
            lluvia_acumulada_UIO +=(lluvia_Quito[i]);

        System.out.println("La lluvia acumulada es: "+ lluvia_acumulada_UIO+ "m^2" );
        System.out.println("El promedio de lluvia es: "+ (lluvia_acumulada_UIO)/12 + "m^2" );
        System.out.println("------------------------------------------------" );

        /* for (String nombreMes : meses)
            System.out.println(nombreMes);
         */

        //LLUVIA CUENCA
        int[] lluvia_CCA= new int[12];
        lluvia_CCA[0]=24;lluvia_CCA[1]=16;lluvia_CCA[2]=15;lluvia_CCA[3]=50;lluvia_CCA[4]=31;lluvia_CCA[5]=14;
        lluvia_CCA[6]=9;lluvia_CCA[7]=19;lluvia_CCA[8]=120;lluvia_CCA[9]=130;lluvia_CCA[10]=73;lluvia_CCA[11]=58;

        System.out.println("LLUVIA CUENCA" );

        for (int i=0; i<lluvia_CCA.length; i++)
            System.out.println("La lluvia en " + meses[i]+" es: " +lluvia_CCA[i]+ "m^2" );


        for (int i=0; i<lluvia_CCA.length; i++)
            lluvia_acumulada_CCA +=(lluvia_CCA[i]);

        System.out.println("La lluvia acumulada es: "+ lluvia_acumulada_CCA+ "m^2" );
        System.out.println("El promedio de lluvia es: "+ (lluvia_acumulada_CCA)/12 + "m^2" );
        System.out.println("------------------------------------------------" );


        //LLUVIA GUAYAQUIL


        int[] lluvia_GUA= new int[12];
        lluvia_GUA[0]=18;lluvia_GUA[1]=20;lluvia_GUA[2]=30;lluvia_GUA[3]=51;lluvia_GUA[4]=43;lluvia_GUA[5]=22;
        lluvia_GUA[6]=8;lluvia_GUA[7]=15;lluvia_GUA[8]=115;lluvia_GUA[9]=175;lluvia_GUA[10]=93;lluvia_GUA[11]=72;

        System.out.println("LLUVIA GUAYAQUIL" );

        for (int i=0; i<lluvia_GUA.length; i++)
            System.out.println("La lluvia en " + meses[i]+" es: " +lluvia_GUA[i]+ "m^2" );

        for (int i=0; i<lluvia_GUA.length; i++)
            lluvia_acumulada_GYE +=(lluvia_GUA[i]);

        System.out.println("La lluvia acumulada es: "+ lluvia_acumulada_GYE+ "m^2" );
        System.out.println("El promedio de lluvia es: "+ (lluvia_acumulada_GYE)/12 + "m^2" );
        System.out.println("------------------------------------------------" );
    }







}