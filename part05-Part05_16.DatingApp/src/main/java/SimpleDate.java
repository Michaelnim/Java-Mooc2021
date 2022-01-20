public class SimpleDate {

    private int day;
    private int month;
    private int year;

    public SimpleDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    @Override
    public String toString() {
        return this.day + "." + this.month + "." + this.year;
    }

    public boolean before(SimpleDate compared) {
        if (this.year < compared.year) {
            return true;
        }

        if (this.year == compared.year && this.month < compared.month) {
            return true;
        }

        if (this.year == compared.year && this.month == compared.month &&
                this.day < compared.day) {
            return true;
        }

        return false;
    }

    // Advancing the date by 1 with conditions in case it goes pass 30;
    public void advance() {
        this.day += 1;
        if(this.day > 30){
            this.day = 1;
            this.month += 1;
        }if(this.month > 12){
            this.month = 1;
            this.year +=1;
        }}



    // Advancing the date by userinput with conditions in case it goes pass 30;
    public void advance(int howManyDays) {
        this.day += howManyDays;
        if (day > 30) {
            this.month += 1;
            this.day = this.day - 30;
            if (month > 12) {
                this.month = this.month - 12;
                this.year += 1;
            }
        }
    }

    //Creating another newDate while keeping the old date the same
    public SimpleDate afterNumberOfDays(int days) {
        SimpleDate newDate = new SimpleDate(day, month, year);
        if (!this.equals(newDate)) {
            if (days >= 0) {
                newDate.day += days;
                if (newDate.day > 30) {
                    newDate.day = newDate.day - 30;
                    newDate.month += 1;
                    if (newDate.month > 12) {
                        newDate.month = 1;
                        newDate.year += 1;
                    }
                }
            }
            return newDate;
        }
        return new SimpleDate(this.day, this.month, this.year);
    }


}

