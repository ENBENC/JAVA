class Tidspunkt implements Comparable<Tidspunkt>{
    public int aar, mnd, dag, time, min,sek;
    public Tidspunkt(int a,int m,int d,int t,int mi,int s){
        aar = a; mnd = m; dag = d;
        time = t; min = mi; sek = s;
    }

    @Override
    public int compareTo(Tidspunkt tidspunkt){
        //1 betyr this bak annet tidspunkt
        //-1 betyr this før annet tidspunkt
        //0 betyr this er lik etTidspunkt
        if(tidspunkt.aar == aar && tidspunkt.mnd == mnd && tidspunkt.dag == dag && tidspunkt.time == time && tidspunkt.min == min && tidspunkt.sek == sek){
            return 0;
        }
        else if(tidspunkt.aar < aar || tidspunkt.mnd < mnd || tidspunkt.dag < dag || tidspunkt.time < time || tidspunkt.min < min || tidspunkt.sek < sek){
            return 1;
        }
        else{
            return -1;
        }
    }
    @Override
    public String toString(){
        return "" + aar +"." + mnd +"."+ dag +"."+time +"."+min +"."+sek;
    }
}
