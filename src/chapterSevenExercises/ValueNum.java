package chapterSevenExercises;

    public class ValueNum {
        private static final long TERMS = 400000;

        public static void main(String[] args){
            double infiniteSeries = 0.0f;
            boolean sign = true;
            long count = 0;

            for(int i=1; i<=TERMS; i+=2){
                // only compute odd numbers
//                if(i % 2 == 0)
//                    continue;

                // check if addition or subtraction
                if(sign)
                    infiniteSeries += (4.0 / (double)i);
                else
                    infiniteSeries -= (4.0 / (double)i);

                System.out.printf("%d. i = %d, infiniteSeries = %f\n", ++count, i, infiniteSeries);

                // reverse the sign
                sign = !sign;
            }

            System.out.printf("PI calculated from the infinite series 20,000 times: %f\n",
                    infiniteSeries);
        }
    }
