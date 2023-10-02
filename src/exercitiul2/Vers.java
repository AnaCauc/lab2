package exercitiul2;

public class Vers {
    private String vers;
    Vers(String v){
        this.vers=v;
    }
    public int NrCuvinte(){
        String[] s=vers.split(" ");
        return s.length;
    }

    public int NrVocale(){
        int count=0;
        String s=vers.toLowerCase();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u'){
                count++;
            }
        }
        return count;
    }
}
