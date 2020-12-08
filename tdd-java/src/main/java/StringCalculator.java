public class StringCalculator {
    public int add(String numbers) {
        String nums = numbers.replaceAll("[A-za-z###//;,\n]", "");
        Integer total = 0;
        for (int i = 0; i < nums.length(); i++) {
            total += Integer.parseInt(String.valueOf(nums.charAt(i)));
        }
        return total;
    }
}
