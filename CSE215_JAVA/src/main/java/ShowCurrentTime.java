
public class ShowCurrentTime {
    public static void main(String[] args) {
        long totalMilliSecond = System.currentTimeMillis();
        long totalseconds = totalMilliSecond / 1000;
        long todaysSec = totalseconds % (24*60*60);
        long hours = todaysSec / (60*60);
        long remainingSec = todaysSec % 3600;
        long minutes = remainingSec / 60;
        long secs = remainingSec % 60;
        if (hours<=18) {  // converting GMT to local time zone
            hours = hours+6;
            
        }
        if (hours>=13) {   // converting 24 to 12 hours time format
            hours = hours-12;
            System.out.println(hours + ":" + minutes + ":" + secs + " PM");
          
          
          
        }
        else
            System.out.println(hours + ":" + minutes + ":" + secs + "AM");
       // System.out.println(remainingSec);
        
        
    }
    
}
