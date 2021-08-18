public class Speed {

    public static long toMilesPerHour( double kmsPerHour){
        if(kmsPerHour < 0) {
            return -1;
        }
        long milesperhour = Math.round(kmsPerHour/1.609);
        return milesperhour;


        }

        public static void printConversion(double kmsPerHour){
        if(kmsPerHour<0){
            System.out.println("Invalid Value");
        }
        else{
            long milesperhour = Math.round(kmsPerHour/1.609);
            System.out.println(kmsPerHour + "km/h = "+ milesperhour + " mi/h" );
        }


        }


    }




