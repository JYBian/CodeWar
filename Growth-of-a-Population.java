class Arge {
    
    public static int nbYear(int p0, double percent, int aug, int p) {
        double num_now = p0;
        int tot_year = 0;
        
        while(num_now < p)
        {
          num_now = num_now + num_now*percent*0.01 + aug;
          tot_year ++;
        }
        
        return(tot_year);
    }
}
