public class Main {
    private static String toFloat = "45.456F";
    private static String toLong = "4536847";
    private static String toDouble = "100.0";
    private static String toInt = "100";

    private static String text = "My text";
    public static void main(String[] args) {
        conversion(toFloat,toLong,toDouble,toInt);
        System.out.println(removeWhiteSpace(text));
    }

    public static void conversion(String toFloat, String toLong, String  toDouble, String toInt) {
        float numFloat = Float.parseFloat(toFloat);
        System.out.println(numFloat);

        long numLong = Long.parseLong(toLong);
        System.out.println(numLong);

        double numDouble = Double.parseDouble(toDouble);
        System.out.println(numDouble);

        int numInt = Integer.parseInt(toInt);
        System.out.println(numInt);
    }

    public static String removeWhiteSpace(String str){
        return  str.replaceAll("\\s", "");
    }

    public static String joinByDelimter(char delimimter, String...args){

        StringBuilder stringBuilder = new StringBuilder();

        int i = 0;
        for (i = 0; i < args.length; i++) {
            stringBuilder.append(args[i]).append(delimimter);
        }
        stringBuilder.append(args[i]);

        return stringBuilder.toString();
    }
}
