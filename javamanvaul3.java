class date
{

    int month, day , year;

    public date(){
        month = 02;
        day = 20;
        year = 2020;
    }

    public int date_geter(){
        return day;
           }
   public int month_geter(){
        return month;
           }
    public int year_geter(){
         return year;
       }

    public void disply_date(){
        System.out.println(month +"/"+ day+"/"+year);
    }

    public boolean equals(date d1){
        if(d1.year == this.year && d1.day == this.day && d1.month== this.month){
            return true;
        }
        else{
            return false;
        }
    }

    public date differencedates(date d2){
        d2.day = d2.day-this.day;
        d2.month= d2.month- this.month;
        d2.year= d2.year- this.year;
        
        return d2;
        
    }


}



public class javamanvaul3 {

        public static void main(String[] args) {
            
        }
 

    
}
