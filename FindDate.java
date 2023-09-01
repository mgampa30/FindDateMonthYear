class FindDate {
    public static void main(String[] args) {
        int year = 2023;
        int find = 60;
        int[] daysInMonthLeap = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int[] daysInMonthNonLeap = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int[] month = (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) ? daysInMonthLeap : daysInMonthNonLeap;
        int total = 0;
        int index = 0;
        int date = find;

        for (int i = 0; i < month.length; i++) {
            total += month[i];
            if (find <= total) {
                index = i;
                break;
            } else{
                date -= month[i]; 
            }
        }

        index = index + 1; // Adjust for zero-based indexing
        System.out.println(date + "/" + index + "/" + year);
    }
}
