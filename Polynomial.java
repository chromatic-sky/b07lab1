public class Polynomial {
        private double [] polyArr;

        public Polynomial() {
            polyArr = new double[]{0};
        }

        public Polynomial(double [] inArr){
            polyArr = new double[inArr.length];
            polyArr = inArr.clone();
        }
    
        public Polynomial add(Polynomial toAdd) {
            double [] addArr = toAdd.polyArr.clone();
            double [] polyArrCopy = polyArr.clone();
            if (addArr.length > polyArrCopy.length){
                for (int i = 0; i < polyArrCopy.length; i++) {
                     addArr[i] = addArr[i] + polyArrCopy[i];
                }
                Polynomial ret = new Polynomial(addArr);
                return ret;
            }
            for (int i = 0; i < addArr.length; i++) {
                 polyArrCopy[i] = polyArrCopy[i] + addArr[i];
            }
            Polynomial ret = new Polynomial(polyArrCopy);
            return ret;
        }
    
        public double evaluate(double x) {
            double result = 0;
            for (int i = 0; i < polyArr.length; i++) {
                result = result + (polyArr[i] * Math.pow(x, i));
            }
            return result;
        }
    
        public boolean hasRoot(double root) {
             return evaluate(root) == 0;
        }
}
